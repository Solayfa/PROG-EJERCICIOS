import java.util.Scanner;
public class Act1 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca porcentaje: ");
     
    int bateria = scanner.nextInt();

    if(bateria <20){
        System.out.println("Nivel bajo");
    }

    
}


}