package br.edu.inteli.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServicoAprovacaoTest {
	
	@Test
	public void testConsultarReprovadoFalta() {
		ServicoAprovacao svc = new ServicoAprovacao();
		assertEquals(ResultadoAprovacao.REPROVADO, svc.consultar(0.5, 80, 70));
	}
	
	// TODO: implementar todos os testes para os métodos consultar da classe ServicoAprovacao
}
