package IntroJava_Fatekiz.Retos;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner (System.in);
        int n1,n2,resultado,opcion;
        
        System.out.println("Bienvenido a la calculadora de Fatekiz");
        System.out.println("Ingresa 2 numeros y luego selecciona la operación que desees realizar");
        
        System.out.println("Ingresa el primer numero:");
        n1 = keyword.nextInt();
        
        System.out.println("Ingresa el segundo número");
        n2 = keyword.nextInt();
         // imprimiendo los numeros entregados
        System.out.println("El primero numero ingresado fue: |"+n1+"| y el segundo fue: |"+n2+"| Como quieres operar con ellos?");
        System.out.println("Para suma ingresa: 1 | para restar ingresa: 2 | para multiplicar ingresa 3: | para dividirlos ingresa: 4 |");
        opcion = keyword.nextInt();
        
        switch(opcion){
            
            case 1 -> {
                resultado = n1+n2;
                System.out.println("Los numeros proporcionados son: "+n1+" y "+n2+". Se sumaron y el resultado es: ");
                System.out.println( resultado);
            }
     
            case 2 -> {
                resultado = n1-n2;
                System.out.println("Los numeros proporcionados son: "+n1+" y "+n2+". Se restaron y el resultado es: ");
                System.out.println( resultado);
            }
            case 3 -> {
                resultado = n1*n2;
                System.out.println("Los numeros proporcionados son: "+n1+" y "+n2+". Se multiplicaron y el resultado es: ");
                System.out.println(resultado);
            }
                
            case 4 -> {
                resultado = n1/n2;
                System.out.println("Los numeros proporcionados son: "+n1+" y "+n2+". Se dividieron y el resultado es: ");
                System.out.println( resultado);
            }
        }
        
        
    }
    
}
