package javaapplication12;

import java.util.Scanner;

public class CuentaServi {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta cu = new Cuenta();
        System.out.print("Ingrese el numero de la cuenta: ");
        cu.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su numero de D.N.I: ");
        cu.setDni(leer.nextLong());
        System.out.print("Ingrese el saldo actual: ");
        cu.setSaldoActual(leer.nextDouble());
        System.out.print("Ingrese el interes anual que usted recibe: ");
        cu.setInteresAnual(leer.nextDouble());
        return cu;
    }

    public void imprimir(Cuenta cu) {
        System.out.println("**********************************************");

        System.out.println("Seleccione una opcion");
        System.out.println("Para conocer el saldo disponible ingrese: 1");
        System.out.println("Para ingresar dinero a la cuenta ingrese: 2");
        System.out.println("Para extraer dinero de la cuenta ingrese: 3");
        System.out.println("Si desea saber cual es el interes diario ingrese: 4");
        System.out.println("Si desea ver todos los datos de la cuenta ingrese: 5");
        System.out.println("Si desea salir ingrese: 6");

        String x = leer.next();

        while (!x.equals("1") && !x.equals("2") && !x.equals("3") && !x.equals("4") && !x.equals("5") && !x.equals("6")) {            
            System.out.println("Ingrese una opcion valida");
            x = leer.next();
        }
        if (x.equals("1")) {
            System.out.print("Su saldo es:" + cu.getSaldoActual());
        }
        if (x.equals("2")) {
            System.out.println("Ingrese la cantidad de dinero que quiere ingresar: ");
            double ingreso = leer.nextDouble();
            System.out.println("Saldo ingresado correctamente, el saldo de su cuenta es: $" + cu.ingresar(ingreso));
        }
        if (x.equals("3")) {
            System.out.println("Ingrese la cantidad de dinero que quiere extraer: ");
            double retiro = leer.nextDouble();
            if (retiro > cu.getSaldoActual()) {
                System.out.println("Usted no cuenta con ese dinero en la cuenta, la cuenta contiene: $ " + cu.getSaldoActual());
            } else {
                System.out.println("Extraccion realizada correctamente, el saldo de su cuenta es: $" + cu.retirar(retiro));
            }
        }
        if (x.equals("4")) {
            System.out.println("el interes diario de la tarjeta es de: " + cu.actualizarSaldo());
        }
        if (x.equals("5")) {
            cu.consultarDatos();
        }
        if(x.equals("6")){
        System.out.println("Nos vemos la proxima!!!");
        }
        System.out.println("Gracias por utilizar nuestro servicio.");
    }

}

