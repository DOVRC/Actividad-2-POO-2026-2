/**
 * Rombo definido por sus dos diagonales, en centimetros.
 * El lado se calcula a partir de las semidiagonales.
 *
 * @version 2026-2
 */
public class Rombo {

    double diagonalMayor;
    double diagonalMenor;

    Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Area = (diagonal mayor * diagonal menor) / 2.
     */
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Perimetro = 4 * lado.
     * lado = raiz de la suma de los cuadrados de las semidiagonales.
     */
    double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2)
                + Math.pow(diagonalMenor / 2, 2));
        return 4 * lado;
    }
}
