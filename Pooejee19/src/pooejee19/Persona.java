/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejee19;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Integer fechaDeNacimiento;
    private Integer edad;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    Date actual = new Date();

    Integer año;
    Integer mes;
    Integer dia;

    Calendar ca = new GregorianCalendar();
    Calendar ca2 = new GregorianCalendar();

    public void pedirFecha() {

        System.out.print("Ingrese su nombre completo: ");
        nombre = leer.next();
        System.out.println("Ingrese fecha de nacimiento");
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Año: ");
        año = leer.nextInt();

        ca.set(año, mes, dia);

        System.out.println("la fecha ingresada es: " + ca.get(Calendar.DATE) + "/" + ca.get(Calendar.MONTH) + "/" + ca.get(Calendar.YEAR));

    }

    public void calcularEdad() {
        Period edad = Period.between(LocalDate.of(ca.get(Calendar.YEAR),
                ca.get(Calendar.MONTH), ca.get(Calendar.DATE)), LocalDate.now());

        System.out.println("Usted tiene: " + String.format("%d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays()));
    }

    public void MenorQue() {
        System.out.println("Ingrese los datos de la otra persona para saber si es menor que usted");
        System.out.print("Ingrese su nombre completo: ");
        String nombre2 = leer.next();
        System.out.println("Ingrese fecha de nacimiento");
        System.out.print("Dia: ");
        Integer dia2 = leer.nextInt();
        System.out.print("Mes: ");
        Integer mes2 = leer.nextInt();
        System.out.print("Año: ");
        Integer año2 = leer.nextInt();

        ca2.set(año2, mes2, dia2);

        if (ca.get(Calendar.YEAR) < ca2.get(Calendar.YEAR)) {
            System.out.println(nombre + " es menor que " + nombre2);
        } else {
            if (ca.get(Calendar.YEAR) > ca2.get(Calendar.YEAR)) {
            } else { 
                if ((ca.get(Calendar.MONTH) < ca2.get(Calendar.MONTH))) {
                    System.out.println(nombre + " es menor que " + nombre2);
                } else {
                }
                if ((ca.get(Calendar.DATE) < ca2.get(Calendar.DATE))) {
                    System.out.println(nombre + " es menor que " + nombre2);
                } else {
                    System.out.println(nombre + " es mayor que " + nombre2);
                }

            }

        }
    }
}
