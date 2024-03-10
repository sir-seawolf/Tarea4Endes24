/**
 * Clase principal que demuestra el uso de la clase CCuenta para realizar
 * operaciones bancarias básicas como ingresar y retirar dinero.
 * <p>
 * Esta clase incluye métodos para probar las operaciones de ingreso y retiro,
 * manejando las excepciones que puedan surgir durante estas operaciones.
 * </p>
 *
 * @author Pascual Caballero Miguel
 * @version 1.1
 * @since 1.0
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;
/* * Clase principal Main que demuestra el uso de la clase CCuenta para realizar
 * operaciones bancarias básicas como ingresar y retirar dinero.
*/
public class Main {

    /**
     * Cuenta bancaria utilizada para demostrar las operaciones de ingreso y
     * retiro.
     */
    static CCuenta objetoCuenta;

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * <p>
     * Este método inicializa una cuenta bancaria y realiza operaciones de
     * prueba de ingreso y retiro, mostrando el saldo actual después de cada
     * operación.
     * </p>
     *
     * @param args Argumentos de línea de comando. No se utilizan en este
     * programa.
     */
    public static void main(String[] args) {
        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        probarIngresar(300);
        probarRetirar(200);
    }

    /**
     * Intenta ingresar una cantidad de dinero en la cuenta.
     * <p>
     * Registra un mensaje de éxito o error en el logger según el resultado de
     * la operación.
     * </p>
     *
     * @param cantidad La cantidad de dinero a ingresar.
     */
    public static void probarIngresar(double cantidad) {
        try {
            objetoCuenta.ingresar(cantidad);
            System.out.println("Ingreso realizado correctamente. Saldo actual: " + objetoCuenta.estado());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error al intentar ingresar dinero", ex);
        }
    }

    /**
     * Intenta retirar una cantidad de dinero de la cuenta.
     * <p>
     * Registra un mensaje de éxito o error en el logger según el resultado de
     * la operación.
     * </p>
     *
     * @param cantidad La cantidad de dinero a retirar.
     */
    public static void probarRetirar(double cantidad) {
        try {
            objetoCuenta.retirar(cantidad);
            System.out.println("Retiro realizado correctamente. Saldo actual: " + objetoCuenta.estado());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error al intentar retirar dinero", ex);
        }
    }
}
