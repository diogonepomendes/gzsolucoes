package br.com.entidade;

import java.util.ArrayList;
import java.util.List;

public class EVenda {

	private Long id;
	private List<EItem> itens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<EItem> getItens() {
		return itens;
	}

	public void setItens(List<EItem> itens) {
		this.itens = itens;
	}
}
