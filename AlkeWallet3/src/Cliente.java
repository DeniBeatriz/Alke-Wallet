
public class Cliente {

	/*
	 * La clase Cliente reune los datos del titular de la cuenta, en clase Main se simplifica el código
	*/
	//Atributos
	
	private int ID;
	private String titular;
	private CuentaBancaria cuenta;
	
	
	//Constructores
	public Cliente (int ID, String titular, CuentaBancaria cuenta) {
	
		this.ID = ID;
		this.titular = titular;
		this.cuenta = cuenta;
				
	}

	//Getter and Setter
	
	/*
	 * Getter permite acceder a los atributos privados desde fuera de la clase
	 * Se generaron automáticamente.
	*/
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	
	//Método para consultar los datos del cliente
	/*
	 * Método para devolver los datos del cliente, 
	 * al seleccionar la opción correspondiente en el menú de Clase Prinicipal Main
	 */
	
		public void consultarDatosCliente() {
			System.out.println("\n*****Datos del cliente*****");
			System.out.println("ID: " + getID());
			System.out.println("Titular: " + getTitular());
			System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
			System.out.println("Saldo actual :" + cuenta.getSaldo() + "CLP");
			
			
			
		}
}
