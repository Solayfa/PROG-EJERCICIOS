import java.util.Scanner;
public class Edificio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce numero de plantas: ");
        int numeroPlantas = entrada.nextInt();
    

        double superficieEdificio = entrada.nextDouble();
        System.out.println(superficieEdificio);

        entrada.nextLine();

        System.out.println("Introduzca el nombre del bloque: ");
        String nombreEdificio = entrada.nextLine();

        System.out.printf("Num. plantas %d con una superficie de %.2f y nombre de edif. %s", numeroPlantas, superficieEdificio, nombreEdificio);


    }
}
