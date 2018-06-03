package br.com.alura.home.threads;

public class Banheiro {
	
	public static void main(String[] args) {
		
		BanheiroSync banheiro = new BanheiroSync();
		
		Thread joaoMijao = new Thread(new MijarTask(banheiro), "João");
		Thread mariaCagona = new Thread(new CagarTask(banheiro), "Maria");
		Thread fatinhaFaxina = new Thread(new LimpezaTask(banheiro), "Fatinha");
		fatinhaFaxina.setDaemon(true);
		fatinhaFaxina.setPriority(Thread.MAX_PRIORITY);
		mariaCagona.setPriority(Thread.NORM_PRIORITY);
		joaoMijao.setPriority(Thread.MIN_PRIORITY);
		
		joaoMijao.start();
		mariaCagona.start();
		fatinhaFaxina.start();
	}

}
