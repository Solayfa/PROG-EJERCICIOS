import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca temperatura: ");
        int temperatura = scanner.nextInt();

        if(temperatura<-40 || temperatura>80){
            System.out.println("fuera de servicio");
        }
        scanner.close();
    }
}
