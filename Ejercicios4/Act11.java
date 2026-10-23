import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introduzca segundo numero: ");
        int numero2 = scanner.nextInt();

        if(numero1 !=0 && numero2 !=0){
            System.out.println(numero1/numero2);

        }else{
            System.out.println("error");
        }
    }
}
