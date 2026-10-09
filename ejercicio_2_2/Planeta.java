/**
 * Modela un planeta del sistema solar.
 * Reune el ejercicio 2.2 del libro y los periodos orbital y de
 * rotacion pedidos en los ejercicios propuestos de la pagina 73.
 *
 * @version 2026-2
 */
public class Planeta {

    // Atributos del enunciado original, con sus valores iniciales
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    TipoPlaneta tipo;
    boolean esObservable = false;

    // Atributos de los ejercicios propuestos
    double periodoOrbital = 0;
    double periodoRotacion = 0;

    /**
     * Inicializa los diez atributos del planeta.
     * Masa en kg, volumen en km3, diametro y distancia al Sol en km,
     * periodo orbital en años y periodo de rotacion en dias.
     */
    Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
            int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable,
            double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    /**
     * Imprime en pantalla los datos del planeta.
     */
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta (kg) = " + masa);
        System.out.println("Volumen del planeta (km3) = " + volumen);
        System.out.println("Diámetro del planeta (km) = " + diametro);
        System.out.println("Distancia al Sol (km) = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Período orbital (años) = " + periodoOrbital);
        System.out.println("Período de rotación (días) = " + periodoRotacion);
    }

    /**
     * Calcula la densidad como masa / volumen.
     * El resultado queda en kg/km3, las unidades del libro.
     * Si el volumen es cero, devuelve 0 para no dividir por cero.
     */
    double calcularDensidad() {
        if (volumen == 0) {
            return 0;
        }
        return masa / volumen;
    }

    /**
     * Indica si el planeta esta mas alla del limite exterior
     * del cinturon de asteroides (3.4 UA). Una UA equivale a 149597870 km.
     */
    boolean esPlanetaExterior() {
        return distanciaSol > 3.4 * 149597870;
    }
}
