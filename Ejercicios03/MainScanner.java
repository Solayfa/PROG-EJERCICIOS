import java.io.InputStream;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca código:");
        

    

        int codigo = scanner.nextInt();

        System.out.println("EL código introducido es: " + codigo);

        scanner.close();

        System.out.println("FIN DE PROGRAMA");
        
    }
}
