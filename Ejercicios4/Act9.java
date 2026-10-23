import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduzca edad: ");
        int edad = scanner.nextInt();

        System.out.println("Acceso?: ");
        boolean acceso = scanner.nextBoolean();

        if(edad>=18 && acceso == true){
            System.out.println("Acceso autorizado");
        }else{
            System.out.println("acceso denegado");
        }
    }
}
