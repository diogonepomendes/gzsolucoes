package br.com.entidade;

public class EItem {

	private String item;
	private Integer vlrUnitario;
	private Integer precoEspecial;
	private Integer qtdPromocao;
	private Integer vlrPromocao;

	public EItem(String item, int vlrUnitario, Integer qtdPromocao, int vlrPromocao) {
		this.item = item;
		this.vlrUnitario = vlrUnitario;
		this.qtdPromocao = qtdPromocao;
		this.vlrPromocao = vlrPromocao;
		precoEspecial = (vlrUnitario * qtdPromocao) - vlrPromocao;
	}

	public EItem(String item, Integer vlrUnitario) {
		this.item = item;
		this.vlrUnitario = vlrUnitario;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getVlrUnitario() {
		return vlrUnitario;
	}

	public void setVlrUnitario(Integer vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}

	public Integer getPrecoEspecial() {
		return precoEspecial;
	}

	public Integer getQtdPromocao() {
		return qtdPromocao;
	}

	public Integer getVlrPromocao() {
		return vlrPromocao;
	}
}
