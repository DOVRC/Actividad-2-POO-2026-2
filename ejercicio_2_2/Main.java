/**
 * Programa principal del ejercicio 2.2.
 * Crea la Tierra y Jupiter e imprime sus datos, su densidad
 * y si cada uno es un planeta exterior.
 */
public class Main {

    public static void main(String[] args) {
        /*
         * Los periodos orbital y de rotacion no aparecen en el programa
         * original del libro. 1.0, 1.0, 11.86 y 0.4135 son valores de
         * ejemplo para los ejercicios propuestos.
         */
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742,
                150000000, TipoPlaneta.TERRESTRE, true, 1.0, 1.0);
        Planeta p2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820,
                750000000, TipoPlaneta.GASEOSO, true, 11.86, 0.4135);

        p1.imprimir();
        System.out.println("Densidad del planeta (kg/km3) = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println();

        p2.imprimir();
        System.out.println("Densidad del planeta (kg/km3) = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
        System.out.println();
    }
}
