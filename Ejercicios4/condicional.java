import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca numero de categoria:");

        int categoria = scanner.nextInt();
        if(categoria==9 || categoria==10){
            System.out.println("excelente");
        }else if(categoria==7 || categoria==8){
            System.out.println("Alta");

        }else if(categoria>=4 && categoria<=6){
            System.out.println("Intermedia");
        }else if(categoria>=0 && categoria<=3){
            System.out.println("Inicial");

        }else{
            System.out.println("Valor incorrecto");
        }
        System.out.println("Indica saldo: ");
        int saldo = scanner.nextInt();
        if(saldo>=0){
            System.out.println("correcto");
        
        }else{
            System.out.println("negativo");
        }
        scanner.close();    }
}
