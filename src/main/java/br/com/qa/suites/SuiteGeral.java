package br.com.qa.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.qa.core.DriverFactory;
import br.com.qa.testes.PesquisarTeste;

@RunWith(Suite.class)
@SuiteClasses({
	PesquisarTeste.class,
})
public class SuiteGeral {
	
	@BeforeClass
	public static void inicializa(){
		
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}
