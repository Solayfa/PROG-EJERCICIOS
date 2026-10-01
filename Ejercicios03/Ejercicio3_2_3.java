import java.util.Scanner;

public class Ejercicio3_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca num. estanteria: ");
        int numEstanterias = scanner.nextInt();

        System.out.println("Introduzca num. cajas por estanteria: ");
        int numCajasEstanterias = scanner.nextInt();

        System.out.println("Itrosduzca num items por caja: ");
        int numeroItemsCaja = scanner.nextInt();

        System.out.printf("Num. estaterias: %d, num. cajas/estanteria: %d" + "num. items/caja: %d", numEstanterias, numCajasEstanterias, numeroItemsCaja);

    }
}
