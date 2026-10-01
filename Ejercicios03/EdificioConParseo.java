import java.util.Scanner;

public class EdificioConParseo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduce num. plantas: ");

    String numPlstr = entrada.nextLine();
    int numPl = Integer.parseInt(numPlstr);

    System.out.println("Introduce nom. Edificio: ");
    String nomEd = entrada.nextLine();

    System.out.printf("Num. plantas %d y nombre edificio %s", numPl, nomEd );

    
    }
}
