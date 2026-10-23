import java.util.Scanner;

public class Act13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca palabra: ");
        String palabra = scanner.nextLine();

        if(palabra.equals("delta42")){
            System.out.println("Aceptado");
        }else{
            System.out.println("denegado");
        }

        scanner.close();


    }
}
