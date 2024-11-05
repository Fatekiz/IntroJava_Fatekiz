package IntroJava_Fatekiz.Retos;

/*
 1 El programa debe solicitar al usuario la
cantidad de animales que necesita registrar
para chequeo.

Los animales con edad mayor o igual a 10
años y estado de salud "malo"
recibirán una revisión gratuita.
2.
Los animales menores de 1 año reciben
revisión gratuita sin importar el estado de
salud.
3.
Utilizar ciclos para registrar la información de
cada animal y determinar si califican para la
revisión gratuita.
4.
Una vez ingresada toda la información, el
programa debe mostrar cuántos animales
califican para la revisión gratuita y cuántos
deben pagar por el servicio.
 */

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int i = 1; // contador para el while
        int contador1 =0; // animales que no pagan
        int contador2 =0;  // animales que pagan 
        int cantidad =0; // total de animales.
        int edad; //edades
        String estado; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de animales que inscribirá para su revisión médica");
        cantidad = sc.nextInt();
        System.out.println("Usted ingreso: "+ cantidad + " Animales.");

        while (i<=cantidad){
            System.out.println("Ingrese las edad de la mascota numero: "+i);
            edad = sc.nextInt();

            System.out.println("Ingrese su estado de salud (bueno/malo)");
            estado = sc.next();
            i ++;

            if ((edad >= 10 || edad<1)&& estado.equals("malo")){
            System.out.println("La mascota cumple con las condiciones para recibir una atencion ¡Gratuita!");
            contador1++;
            }

            else if (edad<1){
                System.out.println("La mascota cumple con las condiciones para recibir una atencion ¡Gratuita!");
            contador1++;
            }

            else{
                System.out.println("La mascota NO cumple con las condiciones para recibir una atencion gratuita :/ ... deberá pagar su atención.");
                contador2++;
            }
        } // fin de while

        System.out.println("De los "+cantidad+" Animales que usted inscribió:");
        System.out.println(contador1 + " Animales no pagarán (revisión gratis)");
        System.out.println(contador2 + " Animales deberán pagar la revisión.");        

    } // cierre del main
    
}
