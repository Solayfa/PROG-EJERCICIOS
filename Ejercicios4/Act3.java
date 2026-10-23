import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Intruduce temperatura: ");
      double temperatura = scanner.nextDouble();

      if (temperatura <0){
        System.out.println("negativo");
      }else if (temperatura>0){
        System.out.println("positivo");
      }else if (temperatura==0){
        System.out.println("cero");
      }
      
      
      
      
      
      
      
        scanner.close();
    }
    
}
