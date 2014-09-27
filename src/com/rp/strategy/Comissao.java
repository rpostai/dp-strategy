package com.rp.strategy;

import java.math.BigDecimal;

public interface Comissao {
	
	public BigDecimal calcular(BigDecimal valorVenda);
}
