package entidadFinanciera;
/**
 * Clase CCuenta que representa una cuenta bancaria con operaciones básicas
 * como ingresar y retirar dinero. Proporciona métodos para gestionar el saldo
 * de la cuenta, así como para consultar el estado actual de la cuenta.
 * @author Pascual Caballero Miguel
 * @version 1.1
 * @since 1.0
 */
public class CCuenta {

    // Nombre del titular de la cuenta.
    private String nombre;

    // Número de la cuenta.
    private String cuenta;

    // Saldo actual de la cuenta.
    private double saldo;

    // Tipo de interés aplicado a la cuenta (no se utiliza actualmente).
    private double tipoInterés;

    // Mensaje de error estático para cantidades negativas.
    private static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";

    /**
     * Constructor vacío para crear una instancia de CCuenta sin inicializar los
     * atributos.
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa una nueva instancia de CCuenta con información
     * específica del titular, número de cuenta, saldo inicial y tipo de
     * interés.
     *
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de la cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés aplicado a la cuenta (actualmente no
     * utilizado).
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo; // Esta línea faltaba para asignar el valor de tipo de interés.
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return this.saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta, aumentando el saldo.
     *
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta, reduciendo el saldo.
     *
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

}
