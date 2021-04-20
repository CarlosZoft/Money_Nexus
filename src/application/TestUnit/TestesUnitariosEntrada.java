package application.TestUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import application.errors.*;

class TestesUnitariosEntrada {
	Valida a = new Valida();
	@Test
	void test1() {
		assertEquals(true,a.validaSaldo("Comprar um carro", 1763).isStatus());
		assertEquals(false,a.validaSaldo("", 1763).isStatus());
		assertEquals(false,a.validaSaldo("Viajar", 0).isStatus());
		assertEquals(false,a.validaSaldo("Viajar", -1).isStatus());
		assertEquals(false,a.validaSaldo("ab", 3223).isStatus());
		assertEquals(false,a.validaSaldo("         ", 1000).isStatus());
		assertEquals(true,a.validaSaldo("Comprar um carro", 1763).isStatus());
	}
	@Test
	void test2() {
		
			assertEquals(false,a.verificaString(""));
			assertEquals(false,a.verificaString("21hu237"));
			assertEquals(false,a.verificaString("377373a"));
			assertEquals(false,a.verificaString("-1"));
			assertEquals(false,a.verificaString("      "));
			assertEquals(true,a.verificaString("123123"));
		
	}
	@Test
	void test3() {
		
		assertEquals(false,a.validaTitulo("").isStatus());
		assertEquals(false,a.validaTitulo("      ").isStatus());
		assertEquals(true,a.validaTitulo("Abastecer o carro").isStatus());
		assertEquals(false,a.validaTitulo("ok").isStatus());
		
		
	}
	@Test
	void test4() {
		
		assertEquals(true,a.validaValor(1123).isStatus());
		assertEquals(false,a.validaValor(0).isStatus());
		assertEquals(false,a.validaValor(-1).isStatus());
		assertEquals(true,a.validaValor(2/2).isStatus());

	}
}
