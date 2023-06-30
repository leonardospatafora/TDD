package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() { 
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Leonardo", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	

	@Test
	 void reajusteNivelUm() {
		service.concederReajuste(funcionario, Desempenho.NIVEL_UM);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		
	}
	
	@Test
	 void reajusteNivelDois() {
		service.concederReajuste(funcionario, Desempenho.NIVEL_DOIS);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		
	}
	
	@Test
	 void reajusteNivelTres() {
		service.concederReajuste(funcionario, Desempenho.NIVEL_TRES);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	
	

}
