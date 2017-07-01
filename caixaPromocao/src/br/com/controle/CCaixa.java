package br.com.br.cm.controle;

import br.com.teste.TCaixa;

public class CCaixa {

	public static void main(String[] args) {
		TCaixa movimentoCaixa = new TCaixa();
		System.out.println("Teste movimento caixa:" + (movimentoCaixa.testarMovimentoCaixa() ? "Sucesso" : "Erro"));
	}

}
