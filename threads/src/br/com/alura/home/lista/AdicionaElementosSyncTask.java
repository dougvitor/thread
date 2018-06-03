package br.com.alura.home.lista;

import java.util.List;

public class AdicionaElementosSyncTask implements Runnable {

	private List<String> lista;
	private int numeroDoThread;

	public AdicionaElementosSyncTask(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			lista.add("Thread " + numeroDoThread + " - " + i);
		}

	}

}
