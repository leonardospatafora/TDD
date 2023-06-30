package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario, Desempenho desempenho) throws IllegalAccessException  {

		
		
		BigDecimal valor = funcionario.getSalario();
		BigDecimal valorComparador = new BigDecimal("10000");
		if (valor.compareTo(valorComparador) >= 0)  {
			throw new IllegalAccessException("Funcionario com salario maior que dez mil não recebe bonus");
		}
		
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
		return reajuste;
	}

}
