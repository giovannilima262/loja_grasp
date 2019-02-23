package br.ucsal.edu.model;

import java.time.LocalDateTime;

public class NotaFiscal {

	private FormaPagamento formaPagamento;
	
	private LocalDateTime data;

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
