package com.rp.strategy.exercicio;

public class Sistema {

	public static void main(String[] args) {
		Calculadora c = new Calculadora(new Multiplicacao());
		System.out.println(c.aplicar(1, 2));
		
		Calculadora c1 = new Calculadora(new Adicao());
		System.out.println(c1.aplicar(1, 2));
	}
}
