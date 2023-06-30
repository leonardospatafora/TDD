package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	
	NIVEL_UM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	}, NIVEL_DOIS {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},NIVEL_TRES {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.2");
		}
	};
	
	public abstract BigDecimal percentualReajuste();

}
