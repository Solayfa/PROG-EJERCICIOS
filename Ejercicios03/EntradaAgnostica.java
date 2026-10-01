import java.util.Scanner;

public class EntradaAgnostica {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca nuemro de plantas y nombre de edificio en cualquier orden");
        entrada.nextInt();
        int num = entrada.nextInt();
        String nom = " ";
        if (entrada.hasNext()){
            nom = entrada.next();
        }
            System.out.printf("Num. plantas %d y nom. ed. %s", num, nom);


    }   
}
