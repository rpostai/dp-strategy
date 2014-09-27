package com.rp.strategy.exercicio;

import java.math.BigDecimal;

public class Multiplicacao implements Operacao {

	@Override
	public int aplicar(int a, int b) {
		return a * b;
	}

}
