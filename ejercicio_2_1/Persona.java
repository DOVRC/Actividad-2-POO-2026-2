/**
 * Modela una persona con sus datos de identidad.
 * Reune el ejercicio 2.1 del libro y los tres ejercicios propuestos
 * de la pagina 66: pais de nacimiento y genero.
 *
 * @version 2026-2
 */
public class Persona {

    // Atributos del enunciado original
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;

    // Atributos de los ejercicios propuestos
    String paisNacimiento;
    char genero;

    /**
     * Inicializa todos los atributos de la persona.
     * La palabra this distingue el atributo del parametro cuando
     * ambos tienen el mismo nombre.
     */
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,
            int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    /**
     * Imprime en pantalla los valores de los atributos del objeto.
     */
    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = "
                + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }
}
