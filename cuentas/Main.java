package cuentas;


import cuentas.CCuenta;

/**
 * clase que contiene metodo que hece referencia a la clase CCuenta y
 * gestiona las operaciones de una cuaenta bancaria.
 * @author Jose Carlos Cruz
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0.0f);
    }
    
    /**
     * metodo que crea dichas operaciones. Crear una nueva cuenta,
     * ingresar y retirar el dinero.
     * @param cantidad 
     */
    public static void operativa_cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
