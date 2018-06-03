package br.com.alura.home.lista;

public class ListaMain {
	
	public static void main(String[] args) throws InterruptedException {
		Lista lista = new Lista();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new AdicionaElementosTask(lista, i)).start();;
		}
		
		new Thread(new ImprimirTask(lista)).start();
	}

}
