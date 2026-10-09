/**
 * Cuadrado definido por la longitud de su lado, en centimetros.
 * No hereda de Rectangulo: el ejercicio usa clases independientes.
 *
 * @version 2026-2
 */
public class Cuadrado {

    int lado;

    Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Area = lado al cuadrado.
     */
    double calcularArea() {
        return (double) lado * lado;
    }

    /**
     * Perimetro = 4 * lado.
     */
    double calcularPerimetro() {
        return 4.0 * lado;
    }
}
