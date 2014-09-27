package com.rp.strategy;

import java.math.BigDecimal;

public enum Cargo implements Comissao {
	
	DIRETOR_DESENVOLVIMENTO {

		@Override
		public BigDecimal calcular(BigDecimal valorVenda) {
			return valorVenda.multiply(new BigDecimal("0.1"));
		}
		
	},
	
	GERENTE_DESENVOLVIMENTO {

		@Override
		public BigDecimal calcular(BigDecimal valorVenda) {
			return valorVenda.multiply(new BigDecimal("0.05"));
		}
		
	},
	
	DESENVOLVEDOR {
		@Override
		public BigDecimal calcular(BigDecimal valorVenda) {
			// Desenvolvedor não tem comissão!!!
			return BigDecimal.ZERO;
		}
	}
}
