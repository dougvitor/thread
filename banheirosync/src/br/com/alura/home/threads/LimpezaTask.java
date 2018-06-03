package br.com.alura.home.threads;

public class LimpezaTask implements Runnable{
	
	private BanheiroSync banheiro;
	
	public LimpezaTask(BanheiroSync banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		
		while(true) {
			this.banheiro.limpar();
			
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
