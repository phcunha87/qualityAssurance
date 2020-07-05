package br.com.qa.pages;

import org.openqa.selenium.By;

import br.com.qa.core.BasePage;
import br.com.qa.core.DriverFactory;

public class PesquisaPage extends BasePage{

	public void url(String url) {
		chamaUrl(url);
	}
	
	
	public void escrevePesquisa(String texto) {
		escrever(By.name("q"), texto);
	}
	
	
	public void submeterPesquisa() {
		DriverFactory.getDriver().findElement(By.name("btnK")).submit();		
	}
	
	public String validaPesquisa() {
		return obterTexto(By.xpath("(//div[contains(@class,'ads-creative')])[1]"));
	}
	
}
