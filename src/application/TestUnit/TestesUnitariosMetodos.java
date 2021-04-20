package application.TestUnit;


import static org.junit.jupiter.api.Assertions.*;
import application.Controllers.*;
import application.Models.*;

import org.junit.jupiter.api.Test;

class TestesUnitariosMetodos {
	Conta a = new Conta();
	@Test
	void test() {
		a.AdicionaSaldo("Viagem", 2344);
		assertEquals(1,a.getSizeSaldo());
		a.clearSaldos();
		assertEquals(0,a.getSizeSaldo());
		a.AdicionaSaldo("Viagem dois", 3400);
		a.editaTituloSaldo("Comprar um carro", 0);
		assertEquals("Comprar um carro", a.getSaldo(0).getTitulo());
	}

}
