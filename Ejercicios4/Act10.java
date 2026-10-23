import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de dia de la semana: ");
        int numero = scanner.nextInt();

        if(numero==6 || numero==7){
            System.out.println("Fin de semana");
        }
        scanner.close();
    }
}
