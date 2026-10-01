public class Ejercicio2_2_12 {
    public static void main(String[] args) {
        int entero = 13/5;
        double decimal = 13/5.0;
        System.out.println("Resultado entero: " + entero);
        System.out.println("Resultado decimal: " + decimal);

        //la salida no coincide porque el resultado de la division no es un numero entero, por lo que al hacer la division entre enteros se pierde la parte decimal y el resultado es 2, mientras que al hacer la division entre un entero y un decimal el resultado es 2.6.
    }

}
