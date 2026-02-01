import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaUSDTest {

	private CuentaUSD cuentausd;
	
	@BeforeEach
	void configuracion() {
		cuentausd = new CuentaUSD(12345, 1000.0);
	}
	@Test
	
	void depositoUsdCorrecto () {
		cuentausd.depositarUsd(10);
		assertEquals(9733.6, cuentausd.getSaldo(), 0.001);
		
	}
	
	@Test
	void depositoUsdIncorrecto () {
		cuentausd.depositarUsd(10);
		assertNotEquals(1000.0, cuentausd.getSaldo(), 0.001); //asert equals porque el monto es desconocido, se deja igual al inicial
		
	}
	
	@Test
	void retiroUsdCorrecto () {
		cuentausd.depositarUsd(10);
		cuentausd.retirarUsd(10);
		assertEquals(1000.0, cuentausd.getSaldo(), 0.001);
		
	}
	
	@Test
	void retiroUsdIncorrecto () {
		cuentausd.retirarUsd(10);
		assertEquals(1000.0, cuentausd.getSaldo(), 0.001); //assertEquals porque si el saldo es insuficiente par el retiro, se debe mantener el monto 
	}

}
