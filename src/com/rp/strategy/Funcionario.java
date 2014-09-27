package com.rp.strategy;

import java.math.BigDecimal;

public class Funcionario {
	
	private final String nome;
	private final Cargo cargo;
	private BigDecimal valorVendaMensal;

	public Funcionario(String nome, Cargo cargo, BigDecimal valorVendas) {
		this.nome = nome;
		this.cargo = cargo;
		this.valorVendaMensal = valorVendas;
	}
	
	public BigDecimal calcularComissaoMensal() {
		return cargo.calcular(valorVendaMensal);
	}

}
