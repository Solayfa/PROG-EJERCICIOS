import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porcentaje de bateria: ");
        int bateria = scanner.nextInt();

        if(bateria>=0 && bateria<=15){
            System.out.println("bateria critica");
        }else if(bateria>=16 && bateria<=40){
            System.out.println("bateria baja");
        }else if(bateria>=41 && bateria<=80){
            System.out.println("bateria normal");
        }else if(bateria>=81 && bateria<=100){
            System.out.println("bateria alta");
        }
        scanner.close();
    }
}
