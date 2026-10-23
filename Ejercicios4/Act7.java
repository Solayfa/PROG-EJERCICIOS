import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica porcentaje de humedad: ");
        int humedad = scanner.nextInt();

        if(humedad>=30 && humedad<=70){
            System.out.println("humedad adecuada");
        }
        scanner.close();
    }
}
