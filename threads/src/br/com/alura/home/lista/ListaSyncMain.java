package br.com.alura.home.lista;

import java.util.List;
import java.util.Vector;

public class ListaSyncMain {
	
	public static void main(String[] args) throws InterruptedException {
		List<String> lista = new Vector<>();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new AdicionaElementosSyncTask(lista, i)).start();;
		}
		
		Thread.sleep(2000);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
