import java.util.Locale;
import java.util.Scanner;

public class MainDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         scanner.useLocale(Locale.UK);
       
       
         System.out.println("introduzca distancia en metros: ");
         double metros = scanner.nextDouble();

         System.out.println("Introduce tiempo en segundos: ");
         double tiempo = scanner.nextDouble();

         double total = (metros/tiempo) * 3.6;
         System.out.println("Distancia: " + total + "Km/H");

    }
}
