package br.com.dao;

import br.com.entidade.EItem;

import javax.management.MBeanServerFactory;
import java.util.HashMap;
import java.util.Map;

public class DItem {

	private Map<String,EItem> itens;

	public DItem(){
		itens = new HashMap<String,EItem>();
		itens.put("A",new EItem("A",50, 3, 130));
		itens.put("B",new EItem("B",30, 2, 45));
		itens.put("C",new EItem("C",20, 3, 40));
		itens.put("D",new EItem("D",15));
	}

	public EItem get(String item){
		return itens.get(item);
	}


}
