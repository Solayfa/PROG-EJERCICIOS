import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primera distancia: ");
        double distancia1 = scanner.nextDouble();

        System.out.println("Introduzca segunda distancia: ");
        double distancia2 = scanner.nextDouble();

        if(distancia1>distancia2){
            System.out.println("Primera distancia es mayor");
        }else if(distancia2>distancia1){
            System.out.println("segunda distancia es mayor");
        }
        if(distancia1==distancia2){
            System.out.println("distancias coinciden");
        }
        scanner.close();
    }
}
