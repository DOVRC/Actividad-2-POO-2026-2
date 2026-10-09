/**
 * Programa principal del ejercicio 2.5.
 * Ejecuta la secuencia del libro y luego el interes mensual.
 */
public class Main {

    public static void main(String[] args) {
        /*
         * El 2 % mensual no aparece en el libro. Es un valor de ejemplo
         * para los ejercicios propuestos.
         */
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789,
                TipoCuenta.AHORROS, 2.0f);

        cuenta.imprimir();
        System.out.println("Resultado = " + cuenta.consignar(200000));
        System.out.println("Resultado = " + cuenta.consignar(300000));
        System.out.println("Resultado = " + cuenta.retirar(400000));
        cuenta.consultarSaldo();

        System.out.println();
        System.out.println("Ejercicios propuestos - Interés mensual");
        cuenta.aplicarInteresMensual();
        cuenta.consultarSaldo();

        /*
         * La cuenta auxiliar no cambia el saldo final de Pedro.
         * Sirve para probar operaciones invalidas y el interes en cero.
         */
        System.out.println();
        System.out.println("Comprobación de operaciones inválidas");
        CuentaBancaria auxiliar = new CuentaBancaria("Cuenta", "Auxiliar", 1,
                TipoCuenta.CORRIENTE, 2.0f);
        System.out.println("Resultado = " + auxiliar.consignar(0));
        System.out.println("Resultado = " + auxiliar.consignar(-100));
        System.out.println("Resultado = " + auxiliar.retirar(0));
        System.out.println("Resultado = " + auxiliar.retirar(-50));
        System.out.println("Resultado = " + auxiliar.retirar(1));
        auxiliar.consultarSaldo();
        auxiliar.aplicarInteresMensual();
        auxiliar.consultarSaldo();
        System.out.println("Resultado = " + auxiliar.consignar(100000));
        System.out.println("Resultado = " + auxiliar.retirar(100000));
        auxiliar.consultarSaldo();
        System.out.println("Resultado = " + auxiliar.consignar(100000));
        auxiliar.aplicarInteresMensual();
        auxiliar.consultarSaldo();
    }
}
