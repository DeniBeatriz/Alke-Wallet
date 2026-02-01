
public class CuentaBancaria {

	
	/*
	 * Atributos
	 */
	private int numeroCuenta;
	protected double saldo;
		
	/*
	 * Constructores
	 */
	public CuentaBancaria (int numeroCuenta, double saldo) {
		
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		
	}
	
	/*
	 * Getter and Setters implementados de manera automática.
	 */
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
	 * Métodos personalizados
	 */
	
	
	public void depositar (double monto) { //Método para deposito en CLP
		
		if (monto > 0) {
			saldo += monto;
			System.out.println("Deposito realizado con éxito!");
			System.out.println("Nuevo saldo: " + saldo);
		} else {
			System.out.println("Error en la operación.");
		}
	
	} 
	
		
	public void retirar (double monto) { //Método para retiro en CLP
		if ( monto > 0 && monto <= saldo) {
		saldo -= monto; 
		System.out.println("Giro realizado con éxito!");
		System.out.println("Nuevo saldo: " + saldo);
		
	} else {
		System.out.println("Saldo insuficiente");
	}
	}
		
		
	public void consultarSaldo () { //Saldo se entrega en CLP
		System.out.println("El saldo de su cuenta :" + saldo);
	}
	
	
}
