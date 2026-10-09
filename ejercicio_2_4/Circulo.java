/**
 * Circulo definido por su radio, en centimetros.
 *
 * @version 2026-2
 */
public class Circulo {

    int radio;

    Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * Area = pi * radio al cuadrado.
     */
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Perimetro = 2 * pi * radio.
     */
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
