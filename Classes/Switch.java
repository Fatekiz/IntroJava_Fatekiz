package IntroJava_Fatekiz.Classes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        int day;
        String nameDay;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número para indicar el dia asociado a él.");
        day = sc.nextInt();

        switch (day) { // Esto me va generando casos , significa que "case 1" (si es 1) : --> pasa lo siguiente | esto en python se podria generar con muchos if´s y tambien  en java
            case 1 -> nameDay = "Lunes";
                

            case 2 -> nameDay = "Martes";
                

            case 3 -> nameDay = "Miercoles";
                
                
            case 4 -> nameDay = "Jueves";
                

            case 5 -> nameDay = "Viernes";
                

            case 6 -> nameDay = "Sabado";
                

            case 7 -> nameDay = "Domingo";
                
                

            default -> throw new AssertionError("El número que señaló no tiene un dia asociado"); //  default es como el else, si ingreso un numero q no está asociado a los de arriba hará esa acción
                                                                                                            // en este caso arroja un error con mensaje en la consola.
        }
        System.out.println("El dia de la semana asociado al número que señaló es: "+ nameDay);

    }
    
}
// Código funcionando sin errores, clas de switch ¡Aprobada!