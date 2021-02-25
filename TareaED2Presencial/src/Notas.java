import java.io.InputStream;

public class Notas {
	/**
	 * @param args
	 * @param nota TODO
	 */
	public static void main(String[] args, InputStream nota) {
		int n;
		String calificacion;
		Scanner reader = obtenerNota(nota);
		n = reader.nextInt();
		if (n >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (n >= 5 && nota <= 10)
			calificacion = "Aprobado";
		else
			calificacion = "La nota introducida no es correcta";
		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 */
	public static Scanner obtenerNota(InputStream nota) {
		Scanner reader = new Scanner(nota);// Para pedir números por teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		return reader;
	}
}
