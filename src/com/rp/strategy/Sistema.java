package com.rp.strategy;

import java.math.BigDecimal;

public class Sistema {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Rodrigo", Cargo.DESENVOLVEDOR,
				BigDecimal.valueOf(100000));
		
		Funcionario f2 = new Funcionario("Eduardo", Cargo.GERENTE_DESENVOLVIMENTO,
				BigDecimal.valueOf(100000));
		
		Funcionario f3 = new Funcionario("Francisco", Cargo.DIRETOR_DESENVOLVIMENTO,
				BigDecimal.valueOf(100000));
		
		System.out.println("Comissão do Rodrigo: " + f1.calcularComissaoMensal());
		System.out.println("Comissão do Eduardo: " + f2.calcularComissaoMensal());
		System.out.println("Comissão do Francisco: " + f3.calcularComissaoMensal());
	}

}
