public class EstudiantesMain
{
	public static void main (String[] args)
	{
		Estudiantes estudiante= new Estudiantes();

		estudiante.seleccionarMaterias();
		estudiante.inscribirse();
		estudiante.solicitarSeguroMedico();
		estudiante.solicitarDeBajaDeMateria();
		estudiante.liberarServicioSocial();
		estudiante.solicitarBeca();
	}
}