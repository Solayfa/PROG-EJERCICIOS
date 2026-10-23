import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca numero:");
        int numero = scanner.nextInt();

        if(numero % 4 == 0){
            System.out.println(numero + " es divisible entre 4");

        }

    }
    
}
