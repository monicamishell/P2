public class EmpleadoMain
{
	public static void main (String[] args)
	{
		Empleado empleado= new Empleado();

		empleado.solicitarHorasExtras();
		empleado.solicitarUtilidades();
		empleado.solicitarVacaciones();
		empleado.realizarTrabajo();
	}
}