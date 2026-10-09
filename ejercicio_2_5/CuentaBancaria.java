/**
 * Modela una cuenta bancaria.
 * Reune el ejercicio 2.5 y el interes mensual de los ejercicios
 * propuestos de la pagina 101.
 *
 * @version 2026-2
 */
public class CuentaBancaria {

    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    TipoCuenta tipoCuenta;
    float saldo = 0;
    float porcentajeInteresMensual;

    /**
     * Crea la cuenta con saldo cero.
     * El porcentaje de interes mensual es una tasa porcentual.
     */
    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta,
            TipoCuenta tipoCuenta, float porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }

    /**
     * Imprime los datos de la cuenta.
     */
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Porcentaje de interés mensual = " + porcentajeInteresMensual);
    }

    /**
     * Muestra el saldo actual. No devuelve el valor.
     */
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }

    /**
     * Consigna un valor mayor que cero y actualiza el saldo.
     */
    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor
                    + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        System.out.println("El valor a consignar debe ser mayor que cero.");
        return false;
    }

    /**
     * Retira un valor mayor que cero y menor o igual que el saldo.
     * El libro escribe que el retiro debe ser menor que el saldo,
     * pero su condicion permite retirar exactamente el saldo.
     */
    boolean retirar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor
                    + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        System.out.println("El valor a retirar debe ser mayor que cero "
                + "y menor o igual que el saldo actual.");
        return false;
    }

    /**
     * Suma al saldo el interes del mes.
     * interes = saldo * (porcentaje / 100).
     */
    void aplicarInteresMensual() {
        float interes = saldo * (porcentajeInteresMensual / 100.0f);
        saldo = saldo + interes;
        System.out.println("Interés aplicado = $" + interes);
        System.out.println("El nuevo saldo es $" + saldo);
    }
}
