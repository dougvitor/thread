package br.com.alura.home.threads;

public class BanheiroSync {
	
	private boolean estaSujo = true;
	
	public void mijar() {
		
		String convidado = Thread.currentThread().getName();
		
		System.out.println(convidado + " batendo na porta");
		
		synchronized (this) {
			System.out.println(convidado + " entrando no banheiro");
			
			while(this.estaSujo) {
				esperaLaFora(convidado);
			}
			
			System.out.println(convidado + " mijando...");
			
			dormeUmPouco(8000L);
			
			this.estaSujo = true;
			
			System.out.println(convidado + " dando descarga");
			System.out.println(convidado + " lavando a mão");
			System.out.println(convidado + " saindo do banheiro");
		}
	}

	public void cagar() {
		
		String convidado = Thread.currentThread().getName();
		
		System.out.println(convidado + " batendo na porta");
		
		synchronized (this) {
			System.out.println(convidado + " entrando no banheiro");
			
			while(this.estaSujo) {
				esperaLaFora(convidado);
			}
			
			System.out.println(convidado + " cagando...");
			
			dormeUmPouco(10000L);
			
			this.estaSujo = true;
			
			System.out.println(convidado + " dando descarga");
			System.out.println(convidado + " lavando a mão");
			System.out.println(convidado + " saindo do banheiro");
		}
	}
	
	public void limpar() {
		
		String faxineira = Thread.currentThread().getName();
		
		System.out.println(faxineira + " batendo na porta");
		
		synchronized (this) {
			System.out.println(faxineira + " entrando no banheiro");
			
			if(!estaSujo) {
				System.out.println(faxineira + ", não está sujo, vou sair");
				return;
			}
			
			
			System.out.println(faxineira + " limpando o banheiro...");
			
			dormeUmPouco(12000L);
			
			this.estaSujo = false;
			
			this.notifyAll();
			
			System.out.println(faxineira + " saindo do banheiro");
		}
	}
	
	private void esperaLaFora(String convidado) {
		System.out.println(convidado + ", banheiro está sujo.");
		
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void dormeUmPouco(Long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
