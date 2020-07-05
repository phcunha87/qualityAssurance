package br.com.qa.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.qa.core.BaseTest;
import br.com.qa.pages.PesquisaPage;

public class PesquisarTeste extends BaseTest{
	
	
	PesquisaPage pt = new PesquisaPage();
	
	
	@Test
	public void RealizaPesquisa() {
		pt.url("http://www.google.com.br");
		pt.escrevePesquisa("Testes Automatizados");
		pt.submeterPesquisa();
		assertEquals("Com uuma infraestrutura simples, entregue Aplicações para Mercado mais Rápido e Barato. Descobra como a IA acelera a Identificação da Raiz de Problemas com IBM. Descubra mais. Implementação estratégica. Indústria Focada Solution. Metodologias avançadas.‎", pt.validaPesquisa());
		
	}

}
