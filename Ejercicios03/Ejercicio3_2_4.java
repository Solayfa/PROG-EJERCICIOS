import java.util.Scanner;

public class Ejercicio3_2_4 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduzca distancia 1: ");
    double distancia1 = scanner.nextDouble();

    System.out.println("Introduce distancia2: ");
    double distancia2 = scanner.nextDouble();

    double media = (distancia1 * distancia2)/2;

    System.out.printf("La media es: %.2f", media);
}



}