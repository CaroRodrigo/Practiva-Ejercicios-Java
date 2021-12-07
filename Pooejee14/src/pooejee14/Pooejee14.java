package pooejee14;

import java.util.Scanner;

public class Pooejee14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
/*
        System.out.println("**********************************************");
        Persona pe = new Persona();
        PersonaServicio perso = new PersonaServicio();

        System.out.print("Ingrese el nombre: ");
        pe.setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        pe.setEdad(leer.nextInt());
        System.out.print("Ingrese el sexo (H - M - O): ");
        String se = leer.next();
        char sexo = se.charAt(0);
        System.out.print("Ingrese el peso: ");
        pe.setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura: ");
        pe.setAltura(leer.nextDouble());
        System.out.println("");
        System.out.println("Los datos ingresados son: ");

        perso.imprimirPersona(pe);
        perso.comprobarSexo(sexo);
        System.out.println("");
        perso.esMayorDeEdad(pe.getEdad());
        System.out.println(perso.calcularIMC(pe.getPeso(), pe.getAltura()));
        
        System.out.println("\n"+"**********************************************");
        
        
        System.out.print("Ingrese el nombre de la segunda persona: ");
        String n = leer.next();
        System.out.print("Ingrese la edad de la segunda persona: ");
        Integer e = leer.nextInt();
        System.out.print("Ingrese el sexo (H - M - O) de la segunda persona: ");
        String s = leer.next();
        char ss = s.charAt(0);
        Persona p3 = new Persona(n, e, ss);
        
        
        System.out.println("\n"+"**********************************************");
        Persona pe2 = new Persona();
        PersonaServicio perso2 = new PersonaServicio();
        System.out.println(pe2.toString());
        perso2.comprobarSexo(sexo);
        System.out.println("");
        perso2.esMayorDeEdad(pe2.getEdad());
        System.out.println(perso2.calcularIMC(pe2.getPeso(), pe2.getAltura()));
        System.out.println("**********************************************");
*/
        PersonaServicio pp = new PersonaServicio();
        
        
        try {
        pp.esMayorDeEdad(18);    
        } catch (NullPointerException e) {
            System.out.println("Encontre el error y el programa no se rompio");
        }catch(RuntimeException j){
            System.out.println("aver");
        }
        
        finally{
            System.out.println("va saltar siempre");
        }
        
    }

   

}
