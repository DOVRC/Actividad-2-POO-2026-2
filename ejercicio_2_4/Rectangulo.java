/**
 * Rectangulo definido por su base y su altura, en centimetros.
 *
 * @version 2026-2
 */
public class Rectangulo {

    int base;
    int altura;

    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Area = base * altura.
     */
    double calcularArea() {
        return (double) base * altura;
    }

    /**
     * Perimetro = 2 * (base + altura).
     */
    double calcularPerimetro() {
        return (2.0 * base) + (2.0 * altura);
    }
}
