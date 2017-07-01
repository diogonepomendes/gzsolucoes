package br.com.negocio;

import br.com.dao.DItem;
import br.com.entidade.EItem;
import br.com.entidade.EVenda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NVenda {

	private EVenda venda;
	private DItem dItem;
	private List<String> jaSomado;
	private Integer somaDesconto;

	public NVenda(){
		jaSomado = new LinkedList<String>();
		somaDesconto = 0;
		dItem = new DItem();
		venda = new EVenda();
	}

	public void add(String item){
		if(venda.getItens() == null){
			venda.setItens(new ArrayList<EItem>());
		}
		venda.getItens().add(dItem.get(item));
	}

	public void remove(String item){
		if(venda.getItens() == null && venda.getItens().size() > 0){
			for(EItem itemDaLista : venda.getItens()){
				if(itemDaLista.getItem().equals(item)){
					venda.getItens().remove(itemDaLista);
					break;
				}
			}
		}
	}

	public Integer getTotalPrice(){
		Integer total = 0;
		for (EItem item:venda.getItens()) {
			total +=  somarItens(item, venda.getItens());
		}
		return total;
	}

	public Integer getTotalDiscount(){
		return somaDesconto;
	}

	public Integer somarItens(EItem item, List<EItem> itens){
		if(jaSomado.size() > 0 && !jaSomado.contains(item.getItem())) {
			List<EItem> itensSoma = new ArrayList<EItem>();
			for (EItem itemSoma : itens) {
				if (item.getItem().equals(itemSoma.getItem())) {
					itensSoma.add(itemSoma);
				}
			}
			Integer qtde = 0;
			Integer vlrSoma = 0;
			for(EItem eitemAgrupado : itensSoma) {
				vlrSoma += eitemAgrupado.getVlrUnitario();
				if(qtde == item.getQtdPromocao()){
					vlrSoma -= item.getPrecoEspecial();
					somaDesconto = item.getPrecoEspecial();
					qtde = 0;
				}

			}
			return vlrSoma;
		}
		return 0;
	}
}
