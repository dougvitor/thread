package busca_textual;

public class BuscaTextualMain {
	
	public static void main(String[] args) {
		
		String nome = "do";
		
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("resources/assinaturas1.txt", nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("resources/assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("resources/autores.txt", nome));
		
		threadAutores.start();		
		threadAssinaturas1.start();
		threadAssinaturas2.start();
	}
}
