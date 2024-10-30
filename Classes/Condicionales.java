package IntroJava_Fatekiz.Classes;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        
        int edad;
        boolean token = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad para ingresar a esta página: ");
        edad = sc.nextInt();

        if (edad== 18 && token == true){                             // el if es diferente al de python, despues del if la condicion va en "()" y los and son --> "&&"
            System.out.println("¡Tienes 18 años y un token activo! Puedes entrar a esta página.");
        }
        else if (edad > 18 && token == true){                       // en java no existe el "elif" se ocupa el --> "else if" para realizar más opciones.
            System.out.println("¡Eres mayor de 18 años y tienes un token activo! Puedes entrar a esta página");
        }
        else{                                                  // El else funciona de igual manera que en el python, si las anteriores opciones no se cumplen actua esta misma.
            System.out.println("No puedes entrar a esta página"); 
            System.out.println("Redireccionando la a página anterior"); // para decorar namas xd
        }
    }
}

// Código funcionando sin errores, clase de condicionales ¡Aprobada!