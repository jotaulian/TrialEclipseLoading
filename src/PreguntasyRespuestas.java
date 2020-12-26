import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreguntasyRespuestas
{
	
	private static final String PREGUNTAR_CURSO = "¿En qué curso estás?";
	private static final String PREGUNTAR_EDAD = "¿Cuántos años tienes?";
	private static final String PREGUNTAR_NOMBRE = "¿Cómo te llamas?";
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {

		System.out.println(PREGUNTAR_NOMBRE);
		String nombre = entrada.readLine();
		System.out.println(PREGUNTAR_EDAD);
		String edad = entrada.readLine();
		System.out.println(PREGUNTAR_CURSO);
		String curso = entrada.readLine();
		mensaje(nombre, edad, curso);
	}
 
	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}

}
