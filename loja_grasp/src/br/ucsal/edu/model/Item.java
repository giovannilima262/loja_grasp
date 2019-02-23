package br.ucsal.edu.model;

import java.math.BigDecimal;

public class Item {
	
	private Produto produto;
	
	private BigDecimal valor;
	
	private BigDecimal quantidade;
	
	public BigDecimal getTotal() {
		return valor.multiply(quantidade);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
