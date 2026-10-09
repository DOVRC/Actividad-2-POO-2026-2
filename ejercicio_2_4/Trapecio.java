/**
 * Trapecio definido por sus dos bases, su altura y sus lados
 * no paralelos, en centimetros.
 *
 * @version 2026-2
 */
public class Trapecio {

    double baseMayor;
    double baseMenor;
    double altura;
    double ladoIzquierdo;
    double ladoDerecho;

    Trapecio(double baseMayor, double baseMenor, double altura,
            double ladoIzquierdo, double ladoDerecho) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoIzquierdo = ladoIzquierdo;
        this.ladoDerecho = ladoDerecho;
    }

    /**
     * Area = ((base mayor + base menor) * altura) / 2.
     */
    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    /**
     * Perimetro = suma de los cuatro lados.
     */
    double calcularPerimetro() {
        return baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
    }
}
