package IntroJava_Fatekiz.java.Classes;

import java.util.Scanner; //                 <--------------------------------------------------AQUÍ-----------------------¬--------
//                                                                                                                                |
public interface Operadores { //                                                                                                  |
        //                                                                                                                       |
//                                                                                                                               |                                                                              |
    public static void main(String[] args) {       //                                                                           |                                                            |
        //                                                                                                                      |                                                                                |
        // Teclado virtual o Captura de variables                                                                              |                                                         |
        Scanner keyword =  new Scanner (System.in); // "Scanner" es una clase la cual para usarla debemos importar su libreria |  Seguido de mencionarla viene su "prefijo q usaremos para el" Usamos convencionalmente "keyword"
        //                                                                                       Para inicializarlo debemos luego escribir = new Scanner(system.in); y al usar el prefijo despues un " . " y lo q queremos que haga con el dato             | o kw o sc o como queramos
        int n1,n2,suma;      // declaramos las variables con su tipo de valor
        
        System.out.println("Ingrese el primer numero");
        n1  =  keyword.nextInt(); // peticion de dato y liego lo transforma a entero | nexInt()
        
        System.out.println("Ingrese el primer numero");
        n2  =  keyword.nextInt();
        
        suma = n1 + n2; // en esta variable se sumarán los datos y se guardarán en la variable
        
        System.out.println("El resultado de la suma es: " + suma); // concatenamos y listo
        
    }
    
}

// Código sin errores y funcionando! clase de Operadores  ¡Aprobada!