public class Cuenta
{
		String nombre;
		String telefono;
		String domicilio;
		String no_cuenta;
		double saldo;
		int pin;

		public void retirar()
		{
			System.out.println("\nRetirar");
		}

		public void realizarPagos()
		{
			System.out.println("\nRealizar pagos");
		}

		public void recibirDepositos()
		{
			System.out.println("\nRecibir depositos");
		}

		public void hacerTranferencias()
		{
			System.out.println("\nHacer transferencias");
		}

		public void consultarSaldo()
		{
			System.out.println("\nConsultar Saldo");
		}
	
}