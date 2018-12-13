public class CuentaMain
{
	public static void main (String[] args)
	{
		Cuenta cuenta= new Cuenta();

		cuenta.retirar();
		cuenta.realizarPagos();
		cuenta.recibirDepositos();
		cuenta.hacerTranferencias();
		cuenta.consultarSaldo();
	}
}