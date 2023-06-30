package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveSerZero () {
		
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("10000.00"));
		assertThrows(IllegalAccessException.class, 
				() -> service.calcularBonus(funcionario, null));
	}
	
	@Test
	void bonusDeveSer3 () throws IllegalAccessException {
		
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.calcularBonus(funcionario, Desempenho.NIVEL_UM);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	void bonusDeveSer15 () throws IllegalAccessException {
		
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.calcularBonus(funcionario, Desempenho.NIVEL_DOIS);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	void bonusDeveSer20 () throws IllegalAccessException {
		
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.calcularBonus(funcionario, Desempenho.NIVEL_TRES);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
	

}
