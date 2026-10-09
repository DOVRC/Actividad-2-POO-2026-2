/**
 * Crea las figuras del ejercicio 2.4 y muestra su area y su perimetro.
 *
 * @version 2026-2
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);

        System.out.println("Figuras del libro");
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        System.out.println("La hipotenusa del triángulo es = " + figura4.calcularHipotenusa());
        figura4.determinarTipoTriangulo();

        /*
         * Diagonales y lados del rombo y del trapecio son ejemplos
         * de los ejercicios propuestos. El libro no los proporciona.
         */
        Rombo figura5 = new Rombo(8, 6);
        Trapecio figura6 = new Trapecio(10, 4, 4, 5, 5);

        System.out.println();
        System.out.println("Ejercicios propuestos");
        System.out.println("El área del rombo es = " + figura5.calcularArea());
        System.out.println("El perímetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();
        System.out.println("El área del trapecio es = " + figura6.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());

        TrianguloRectangulo isosceles = new TrianguloRectangulo(4, 4);
        System.out.println();
        System.out.println("Comprobación adicional: triángulo rectángulo isósceles");
        System.out.println("El área del triángulo es = " + isosceles.calcularArea());
        System.out.println("La hipotenusa del triángulo es = " + isosceles.calcularHipotenusa());
        isosceles.determinarTipoTriangulo();
    }
}
