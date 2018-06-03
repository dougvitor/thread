package br.com.alura.home.lista;

public class ImprimirTask implements Runnable {

	private Lista lista;

	public ImprimirTask(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		
		synchronized (lista) {
			
			try {
				System.out.println("Aguardando preenchimento completo da lista... ");
				lista.wait();
				
				for(int i = 0 ; i <lista.tamanho(); i++) {
					System.out.println(i + " - " + lista.getElemento(i));
				}
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
