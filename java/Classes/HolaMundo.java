package IntroJava_Fatekiz.java.Classes;

public class HolaMundo {
    public static void main(String[] args) {
        String nombre = "benjamin";                // String (con S en mayus) es una clase que nos deja almacenar una "cadena" de carácteres.
        String apellido = "Concha"; 
        int edad = 19;        // int para enteros | ocupa 4 bytes
        double estatura = 1.71;    // double para numeros con decimales de doble presición | ocupa 8 bytes
        float pi = 3.1416f;        // float para numeros con decimales simples (f para truncar) |  ocupa 4 bytes              <--- DATO IMPORTANTE, siempre finalizar las lineas de código con " ; " menos los condicionales if | else if |else
        short old_sueldo = 30000; // para numeros pequeños, desde el -32,768 hasta el 32,768  | ocupa 2bytes
        long sueldo = 2000000;          // long para números "largos" superior a 6/7 dígitos // 19 digitos de tope (desde el - al +) | ocupa 8 bytes
        boolean estado = true;           // boolean para booleanos = 0|1 | 
        char letra  = 'A';                      // char para "solo una letra"             se ocupan para guardar "listas" o "cajas q almacenen distintos tipos de datos"
        
        
        System.out.println("Hola Mundo, mi nombre es " + nombre +" "+ apellido + ", Mi edad es "+edad+" y mi estatura es: "+estatura);             // Para juntar una cadena junto con las variables debemos usar el método de "concatenación"
        System.out.println("Número PI:" + pi);
        System.out.println("Actualmente me encuentro trabajando donde recibo: " + sueldo + " de Dólares." + "Pero el anterior era de: "+ old_sueldo + " Mi estado de trabajo es:  " + estado + " , Y estoy en el area de trabajo:  " + "'" +letra+"'");
    }
}