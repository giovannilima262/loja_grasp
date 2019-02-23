package br.ucsal.edu.model;

import java.math.BigDecimal;
import java.util.List;

public class Carrinho {
	
	private List<Item> itens;
	
	private Cliente cliente;
	
	public BigDecimal getTotal() {
		BigDecimal total = new BigDecimal(0);
		for (Item item : itens) {
			total.add(item.getTotal());
		}
		return total;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
