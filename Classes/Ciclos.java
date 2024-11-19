import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        int i= 0;
        int j;
        int contador=0;

        System.out.println("####### DO-WHILE #######");
        // do
        do{
            System.out.println("Voy en la vuelta N° " + i);
            i +=1;
        }while(i<=10);
    
        
        System.out.println("####### WHILE #######");
        // while
        while(contador<=10){
            System.out.println("Voy en la vuelta N° " + contador);
            contador++;
        }


        System.out.println("####### For #######");
        // For (declaramos valor de variable, condicion, bucle)
        for(j=0; j<=10; j++){
            System.out.println("Vuelta N° " +j);
        }


        System.out.println("####### Bucle Infinito(true) #######");
        // while true
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String respuesta;

        while(flag == true){
            System.out.println(""); // espacio en blanco
            System.out.println("¿Desea salir del programa?");
            System.out.println(""); // espacio en blanco
            respuesta = sc.next();

            if(respuesta.equalsIgnoreCase("si")){
                flag = false;
            }
        }
   
    }
}
