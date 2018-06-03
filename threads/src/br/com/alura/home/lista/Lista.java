package br.com.alura.home.lista;

public class Lista {
	
	private String[] elementos = new String[1000];
	private int indice = 0;
	
	public synchronized void adicionaElemento(String elemento) {
		this.elementos[indice] = elemento;
		indice++;
		
		try {
			Thread.sleep(5);
			
			if(this.indice == this.elementos.length) {
				System.out.println("Lista completamente preenchida!!");
				this.notify();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String getElemento(int posicao) {
		return this.elementos[posicao];
	}
}
