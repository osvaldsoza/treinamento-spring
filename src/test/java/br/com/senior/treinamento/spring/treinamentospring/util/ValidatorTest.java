package br.com.senior.treinamento.spring.treinamentospring.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.senior.treinamento.spring.treinamentospring.TreinamentoSpringApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TreinamentoSpringApplication.class})
public class ValidatorTest{

	@Autowired
	private Validator validator;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("###########Executou antes da classe");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("###########Executou depois da classe");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("###########Executou antes do teste");
	}
	
	@After
	public void afterTest() {
		System.out.println("###########Executou depois do teste");
	}
	@Test
	public void validaStringVaziaTest() {
		assertTrue("O valor devia esta nulo.",validator.validaStringVazia(null));
		assertTrue("O valor devia estar vazio",validator.validaStringVazia(""));
		assertFalse("O valor não devia estar vazio",validator.validaStringVazia(" "));
		assertFalse("O valor não devia estar vazio",validator.validaStringVazia("fafadf"));
	}
	
	@Test
	public void validaTamanhoMinimo() {
		assertTrue(validator.validaTamanhoMinimo("aa", 2));
		assertTrue(validator.validaTamanhoMinimo(" ", 1));
		assertFalse(validator.validaTamanhoMinimo("aa", 5));
		assertFalse(validator.validaTamanhoMinimo(null, 2));
	}
	
	@Test
	public void validaTamanhoMaximo() {
		assertTrue(validator.validaTamanhoMaximo("aa", 2));
		assertTrue(validator.validaTamanhoMaximo(" ", 1));
		assertFalse(validator.validaTamanhoMaximo("aaaaaaaaa", 5));
		assertFalse(validator.validaTamanhoMaximo(null, 2));
	}
}
