package br.com.alura.home.lista;

public class AdicionaElementosTask implements Runnable {

	private Lista lista;
	private int numeroDoThread;

	public AdicionaElementosTask(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			lista.adicionaElemento("Thread " + numeroDoThread + " - " + i);
		}

	}

}
