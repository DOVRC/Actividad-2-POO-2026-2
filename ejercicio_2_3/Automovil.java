/**
 * Modela un automovil y el cambio de su velocidad.
 * Reune el ejercicio 2.3 del libro y los tres ejercicios propuestos
 * de la pagina 86: transmision automatica y multas.
 *
 * @version 2026-2
 */
public class Automovil {

    /*
     * Valor ilustrativo de cada intento de superar la velocidad maxima.
     * No aparece en el libro y no representa una sancion legal.
     */
    static final int VALOR_MULTA = 100000;

    String marca;
    int modelo;
    int motor;
    TipoCombustible tipoCombustible;
    TipoAutomovil tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    TipoColor color;
    int velocidadActual = 0;

    // Ejercicios propuestos
    boolean automatico;
    int cantidadMultas = 0;
    int totalMultas = 0;

    /**
     * Inicializa el vehiculo. La velocidad actual queda en cero.
     */
    Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible,
            TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
            int velocidadMaxima, TipoColor color, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.automatico = automatico;
    }

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    int getModelo() {
        return modelo;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    int getMotor() {
        return motor;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    int getNumeroPuertas() {
        return numeroPuertas;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Cambia la velocidad maxima si el valor es mayor que cero
     * y no es inferior a la velocidad actual.
     */
    void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima <= 0) {
            System.out.println("No se puede asignar una velocidad máxima "
                    + "menor o igual a cero.");
        } else if (velocidadMaxima < velocidadActual) {
            System.out.println("No se puede asignar una velocidad máxima "
                    + "inferior a la velocidad actual.");
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    TipoColor getColor() {
        return color;
    }

    void setColor(TipoColor color) {
        this.color = color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Cambia la velocidad actual si el valor esta entre cero
     * y la velocidad maxima, incluidos ambos extremos.
     */
    void setVelocidadActual(int velocidadActual) {
        if (velocidadActual < 0) {
            System.out.println("No se puede asignar una velocidad negativa.");
        } else if (velocidadActual > velocidadMaxima) {
            System.out.println("No se puede asignar una velocidad superior "
                    + "a la máxima del automóvil.");
        } else {
            this.velocidadActual = velocidadActual;
        }
    }

    boolean getAutomatico() {
        return automatico;
    }

    void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    /**
     * Aumenta la velocidad actual. Si el resultado superaria la
     * velocidad maxima, la velocidad no cambia y se registra una multa.
     */
    void acelerar(int incrementoVelocidad) {
        if (incrementoVelocidad < 0) {
            System.out.println("No se puede acelerar con un incremento negativo.");
            return;
        }
        if (incrementoVelocidad <= velocidadMaxima - velocidadActual) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            cantidadMultas = cantidadMultas + 1;
            totalMultas = totalMultas + VALOR_MULTA;
            System.out.println("No se puede incrementar a una velocidad superior "
                    + "a la máxima del automóvil.");
            System.out.println("Se generó una multa de " + VALOR_MULTA + " COP.");
        }
    }

    /**
     * Reduce la velocidad actual. Puede llegar a cero.
     * No acepta un decremento negativo ni una velocidad negativa.
     */
    void desacelerar(int decrementoVelocidad) {
        if (decrementoVelocidad < 0) {
            System.out.println("No se puede desacelerar con un decremento negativo.");
            return;
        }
        if (decrementoVelocidad <= velocidadActual) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    /**
     * Detiene el automovil.
     */
    void frenar() {
        velocidadActual = 0;
    }

    /**
     * Calcula el tiempo de llegada en horas: distancia (km) / velocidad (km/h).
     * Si el automovil esta detenido, devuelve NaN.
     */
    double calcularTiempoLlegada(int distancia) {
        if (velocidadActual == 0) {
            return Double.NaN;
        }
        return (double) distancia / velocidadActual;
    }

    /**
     * Imprime el estado actual del automovil.
     */
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima (km/h) = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual (km/h) = " + velocidadActual);
        System.out.println("Automático = " + automatico);
        System.out.println("Cantidad de multas = " + cantidadMultas);
        System.out.println("Total de multas (COP) = " + totalMultas);
    }

    /**
     * Indica si el automovil tiene al menos una multa.
     */
    boolean tieneMultas() {
        return cantidadMultas > 0;
    }

    /**
     * Devuelve el valor acumulado de las multas, en pesos colombianos.
     */
    int calcularTotalMultas() {
        return totalMultas;
    }
}
