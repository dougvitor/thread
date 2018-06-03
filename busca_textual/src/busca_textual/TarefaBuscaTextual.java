package busca_textual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {
	private String arquivo;
	private String nome;

	public TarefaBuscaTextual(String arquivo, String nome) {
		this.arquivo = arquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		
		try {
			Scanner scan = new Scanner(new File(arquivo));
			int numeroLinha = 1;
			
			while(scan.hasNextLine()) {
				String assinaturaLinha = scan.nextLine();
				
				if(assinaturaLinha.trim().toLowerCase().contains(nome.trim().toLowerCase())) {
					System.out.println("L" + numeroLinha + " - " + arquivo.split("/")[1] + " - " + assinaturaLinha);
				}
				numeroLinha++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
