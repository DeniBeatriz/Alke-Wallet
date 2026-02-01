import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	private CuentaBancaria cuenta; //señalamos de que clase se realizará el test
	
	@BeforeEach
	void configuracion() {
		cuenta = new CuentaBancaria(12345, 1000.0); //Se crea cuenta con saldo inicial
		
	}
	@Test
	
	void depositoCorrecto() {
		cuenta.depositar(1000.0);
		assertEquals(2000.0, cuenta.getSaldo(), 0.001); //se usa getSaldo porque estamos probando el estado de un objeto y no un valor aislado
		
	}
	
	@Test
	void depositoIncorrecto() {
		cuenta.depositar(1000.0);
		assertNotEquals(1000.0, cuenta.getSaldo(), 0.001); //el 0.001 se utiliza porque los numeros doubles no son exactos, funciona como margen de error
		
	}
	
	@Test
	void retiroCorrecto() {
		cuenta.retirar(500.0);
		assertEquals(500.0, cuenta.getSaldo(), 0.001);
		
	}
	
	@Test
	void retiroIncorrecto () {
		cuenta.retirar(500.0);
		assertNotEquals(1000.0, cuenta.getSaldo(), 0.001);
	
	}
	
	
	}
		
		
		
	
	


