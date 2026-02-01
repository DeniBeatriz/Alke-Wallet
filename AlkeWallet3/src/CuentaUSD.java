
public class CuentaUSD extends CuentaBancaria implements TipoCambio {
	
	
	/*
	 * Atributos: La Subclase CuentaUSD no posee atributos, sólo modifica comportamiento respecto a los métodos
	 * (depositar y retirar) indicados en la Superclase CuentaBancaria.
	*/
	
		
	/*
	 * Se utilizan atributos heredados de Superclase CuentaBancaria
	 */

	public CuentaUSD (int numeroCuenta, double saldo) { //probar hacerlo sin paramentros
		super(numeroCuenta, saldo); //por el curso hay que hacer constructor con parametro y un constructor sin parametros
	
		
		
	}
	
	/*
	 * No aplica Getter and Setter al no existir atributos propios de la Subclase CuentaUSD
	 */


	/*
	 * Método depositar en USD: multiplicación de la cantidad en USD indicado por el usuario por el Valor_Dolar establacedio 
	 * como dato constante en Interfacie IipoCambio, esta operación tranforma el mondo en USD a monto en CLP
	 * Se llama al método establaecido en la Superclase Cuenta Bancaria, se agrega el monto al saldo de la cuenta
	 * en CLP.
	 */
	
	public void depositarUsd (double montoUSD) { //Usuario debe indicar número en dólares
		if (montoUSD <= 0) {
			System.out.println("El monto debe ser mayor a 0");
			return;
		}
		double montoCLP = montoUSD * VALOR_DOLAR; //Cambio de USD a CLP, valor dolar proveniente de interface
		super.depositar(montoCLP); // Llamado al método depositar de la Superclase
		
	}
	
	/*
	 * Método retiro en USD.
	 */
	
	public void retirarUsd (double montoUSD) {
		if (montoUSD <= 0) {
			System.out.println("El monto debe ser mayor a 0.");
			return;
		} 
			double montoCLP = montoUSD * VALOR_DOLAR;
			super.retirar(montoCLP);
		


		}

	}
	




