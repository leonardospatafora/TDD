package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class BonusServiceTestManual {

	public static void main(String[] args) throws IllegalAccessException {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.calcularBonus(funcionario, Desempenho.NIVEL_UM);
		System.out.println(funcionario.getSalario());
		
		
		
	}

}
