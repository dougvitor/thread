package br.com.alura.home.threads;

public class CagarTask implements Runnable{
	
	private BanheiroSync banheiro;
	
	public CagarTask(BanheiroSync banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		this.banheiro.cagar();
	}

}
