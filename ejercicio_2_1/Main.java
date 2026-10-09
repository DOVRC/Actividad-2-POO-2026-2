/**
 * Programa principal del ejercicio 2.1.
 * Crea dos personas con los datos del libro e imprime sus atributos.
 */
public class Main {

    public static void main(String[] args) {
        /*
         * El pais de nacimiento y el genero no aparecen en el enunciado
         * original. Colombia y 'H' son valores de ejemplo para los
         * ejercicios propuestos.
         */
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998,
                "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001,
                "Colombia", 'H');

        p1.imprimir();
        p2.imprimir();
    }
}
