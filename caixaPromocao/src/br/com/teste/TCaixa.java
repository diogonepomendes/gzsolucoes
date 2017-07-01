package br.com.teste;

import br.com.negocio.NVenda;

public class TCaixa {

	NVenda checkout;

	public TCaixa(){
		checkout = new NVenda();
	}

	public boolean testarMovimentoCaixa() {

		boolean erro = false;
		// Teste 1 (caixa zerado)

		checkout.add("A");

		erro = checkout.getTotalPrice() == 50;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 100;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 130;

		erro = checkout.getTotalDiscount() == 20;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 180;

		erro = checkout.getTotalDiscount() == 20;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 230;

		erro = checkout.getTotalDiscount() == 20;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 260;

		erro = checkout.getTotalDiscount() == 40;

		checkout.remove("A");

		erro = checkout.getTotalPrice() == 230;

		erro = checkout.getTotalDiscount() == 20;

		// Teste 2 (caixa zerado)

		checkout.add("D");

		erro = checkout.getTotalPrice() == 15;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 65;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("B");

		erro = checkout.getTotalPrice() == 95;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 145;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("B");

		erro = checkout.getTotalPrice() == 160;

		erro = checkout.getTotalDiscount() == 15;

		checkout.add("A");

		erro = checkout.getTotalPrice() == 190;

		erro = checkout.getTotalDiscount() == 35;

		checkout.remove("A");

		erro = checkout.getTotalPrice() == 160;

		erro = checkout.getTotalDiscount() == 15;

		checkout.remove("B");

		erro = checkout.getTotalPrice() == 145;

		erro = checkout.getTotalDiscount() == 0;

		// Teste 3 (caixa zerado)

		checkout.add("C");

		erro = checkout.getTotalPrice() == 20;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("C");

		erro = checkout.getTotalPrice() == 40;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("C");

		erro = checkout.getTotalPrice() == 40;

		erro = checkout.getTotalDiscount() == 20;

		checkout.add("C");

		erro = checkout.getTotalPrice() == 60;

		erro = checkout.getTotalDiscount() == 20;

		checkout.remove("C");

		erro = checkout.getTotalPrice() == 40;

		erro = checkout.getTotalDiscount() == 20;

		checkout.remove("C");

		erro = checkout.getTotalPrice() == 40;

		erro = checkout.getTotalDiscount() == 0;

		// Teste 4 (caixa zerado)

		checkout.add("C");

		erro = checkout.getTotalPrice() == 20;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("B");

		erro = checkout.getTotalPrice() == 50;

		erro = checkout.getTotalDiscount() == 0;

		checkout.add("B");

		erro = checkout.getTotalPrice() == 65;

		erro = checkout.getTotalDiscount() == 15;

		checkout.remove("B");

		erro = checkout.getTotalPrice() == 50;

		erro = checkout.getTotalDiscount() == 0;

		return erro;
	}
}
