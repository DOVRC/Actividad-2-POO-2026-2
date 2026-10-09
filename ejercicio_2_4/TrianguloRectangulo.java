/**
 * Triangulo rectangulo definido por sus dos catetos, en centimetros.
 * La hipotenusa no es un atributo: se calcula con un metodo.
 *
 * @version 2026-2
 */
public class TrianguloRectangulo {

    int base;
    int altura;

    TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Area = (base * altura) / 2.
     * La division usa 2.0 para conservar los decimales.
     */
    double calcularArea() {
        return (double) base * altura / 2.0;
    }

    /**
     * Hipotenusa por el teorema de Pitagoras.
     */
    double calcularHipotenusa() {
        return Math.hypot(base, altura);
    }

    /**
     * Perimetro = base + altura + hipotenusa.
     */
    double calcularPerimetro() {
        return (double) base + altura + calcularHipotenusa();
    }

    /**
     * Clasifica el triangulo segun sus tres lados.
     * Un triangulo rectangulo con lados positivos no puede ser equilatero.
     * Es isosceles si los dos catetos son iguales; si no, es escaleno.
     */
    void determinarTipoTriangulo() {
        if (base <= 0 || altura <= 0) {
            System.out.println("Los catetos deben ser positivos para clasificar el triángulo.");
            return;
        }
        double hipotenusa = calcularHipotenusa();
        boolean catetosIguales = base == altura;
        boolean baseIgualHipotenusa = Math.abs(base - hipotenusa) < 1e-9;
        boolean alturaIgualHipotenusa = Math.abs(altura - hipotenusa) < 1e-9;

        if (catetosIguales && baseIgualHipotenusa && alturaIgualHipotenusa) {
            System.out.println("Es un triángulo equilátero");
        } else if (!catetosIguales && !baseIgualHipotenusa && !alturaIgualHipotenusa) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
