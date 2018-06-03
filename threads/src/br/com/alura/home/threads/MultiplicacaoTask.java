package br.com.alura.home.threads;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiplicacaoTask implements Runnable {
	
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public MultiplicacaoTask(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}
	
	@Override
	public void run() {
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		BigInteger calculo = new BigInteger("0");
		resultado.setText("Calculando...");
		
		for (int i = 0; i < valor1; i++) {
			for (int j = 0; j < valor2; j++) {
				calculo = calculo.add(new BigInteger("1"));
			}
		}

		resultado.setText(calculo.toString());
	}

	public JTextField getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(JTextField primeiro) {
		this.primeiro = primeiro;
	}

	public JTextField getSegundo() {
		return segundo;
	}

	public void setSegundo(JTextField segundo) {
		this.segundo = segundo;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}
}
