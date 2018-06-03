package br.com.alura.home.threads;

public class MijarTask implements Runnable{
	
	private BanheiroSync banheiro;
	
	public MijarTask(BanheiroSync banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		this.banheiro.mijar();
	}

}
