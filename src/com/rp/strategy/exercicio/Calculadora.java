package com.rp.strategy.exercicio;

public class Calculadora {
	
	private Operacao operacao;
	
	public Calculadora(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public int aplicar(int a, int b) {
		return operacao.aplicar(a, b);
	}
}
