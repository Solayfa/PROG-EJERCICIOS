import java.util.Scanner;

public class MainEntradaMultipleInt {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca número de cajas: ");
        int numeroCajas = entrada.nextInt();

        System.out.println("Número de items por caja: ");
        int numeroItemsCaja = entrada.nextInt();

        int total = numeroCajas * numeroItemsCaja;

        System.out.println("Total items: " + total);
        entrada.close();
    }
}
