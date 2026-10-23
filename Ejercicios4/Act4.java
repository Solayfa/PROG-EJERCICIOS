import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de personas en la sala: ");
        int aforo = scanner.nextInt();

        if(aforo<=60){
            System.out.println("aforo correcto");
        }else if(aforo>60){
            System.out.println("aforo excedido");
        }
        scanner.close();
    }
}
