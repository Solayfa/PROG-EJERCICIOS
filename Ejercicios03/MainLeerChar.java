import java.util.Scanner;

public class MainLeerChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        char caracter = line.charAt(0);
        System.out.println("Caracter introducido: " + caracter);

        System.out.println("caracter introducido: " + scanner.nextLine().charAt(0));

        

    }
}
