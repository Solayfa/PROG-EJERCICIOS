import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce continuar:");

        String acceso = scanner.nextLine();
        if(acceso.equalsIgnoreCase("continuar")){
            System.out.println("aceptado");
        }else{
            System.out.println("Palabra incorrecta");
        }
        scanner.close();
    }
}
