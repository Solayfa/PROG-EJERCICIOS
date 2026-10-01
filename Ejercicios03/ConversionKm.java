import java.util.Scanner;
public class ConversionKm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce kilometros: ");
        double kilometros =
            Double.parseDouble(entrada.nextLine());

        final double millas = kilometros * 0.6213;

        System.out.println(kilometros + "Km = " + millas + " millas");




    }
}
