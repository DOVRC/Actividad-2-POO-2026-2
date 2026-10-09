/**
 * Programa principal del ejercicio 2.3.
 * Recorre la secuencia de velocidad del libro y luego comprueba las multas.
 */
public class Main {

    public static void main(String[] args) {
        /*
         * automatico no aparece en el programa original del libro.
         * true es un valor de ejemplo para el ejercicio propuesto.
         */
        Automovil auto1 = new Automovil("Ford", 2018, 3, TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO, 5, 6, 250, TipoColor.NEGRO, true);

        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        System.out.println("Tiempo de llegada para 140 km = "
                + auto1.calcularTiempoLlegada(140) + " horas");
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(20);

        System.out.println();
        System.out.println("Comprobación de multas");
        System.out.println("Tiene multas = " + auto1.tieneMultas());
        System.out.println("Total de multas (COP) = " + auto1.calcularTotalMultas());
        auto1.acelerar(251);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(251);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        System.out.println("Tiene multas = " + auto1.tieneMultas());
        System.out.println("Total de multas (COP) = " + auto1.calcularTotalMultas());
        auto1.acelerar(250);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        System.out.println("Tiene multas = " + auto1.tieneMultas());
        System.out.println("Total de multas (COP) = " + auto1.calcularTotalMultas());
    }
}
