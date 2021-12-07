package pooejee14;

import java.util.Scanner;

public class PersonaServicio {

    public String calcularIMC(double peso, double altura) {
        double imc = 0;
        imc = peso / (altura * altura);

        if (imc < 20) {

            System.out.println("IMC -1 : Esta persona esta por debajo de su peso");
            System.out.print("Numero exacto de IMC: ");
        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("IMC 0 : Esta persona en su peso ideal");
            System.out.print("Numero exacto de IMC: ");
        }
        if (imc > 25) {
            System.out.println("IMC 1 : Esta persona tiene sobrepeso");
            System.out.print("Numero exacto de IMC: ");
        }

        String cadena = String.valueOf(imc);
        return cadena;
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    public void comprobarSexo(char sexo) {
        String s = String.valueOf(sexo);
        System.out.print("Sexo: " + s);
        if (!s.equals("h") && !s.equals("H") && !s.equals("m") && !s.equals("M") && !s.equals("o") && !s.equals("O")) {
            System.out.println("   <----   La opcion de sexo ingresada es incorrecta");
        }

    }

    public void imprimirPersona(Persona per) {
        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + per.getEdad());
        System.out.println("Peso: " + per.getPeso());
        System.out.println("Altura: " + per.getAltura());

    }

}
