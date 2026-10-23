import java.util.Scanner;

public class contabilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca nombre del producto 1:");
        String nomProd1 = scanner.nextLine();

        System.out.println("Cantidad de producto 1: ");
        int cantProd1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Precio producto 1: ");
        double precioProd1 = Double.parseDouble(scanner.nextLine());
        double precioTotal1 = cantProd1*precioProd1;

         System.out.println("Introduzca nombre del producto 2:");
        String nomProd2 = scanner.nextLine();

        System.out.println("Cantidad de producto 2: ");
        int cantProd2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Precio producto 2: ");
        double precioProd2 = Double.parseDouble(scanner.nextLine());
        double precioTotal2 = cantProd2*precioProd2;


         System.out.println("Introduzca nombre del producto 3:");
        String nomProd3 = scanner.nextLine();

        System.out.println("Cantidad de producto 3: ");
        int cantProd3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Precio producto 3: ");
        double precioProd3 = Double.parseDouble(scanner.nextLine());
        double precioTotal3 = cantProd3*precioProd3;

        double precioTotalFinal = precioTotal1+precioTotal2+precioTotal3;

        System.out.println("-".repeat(60));
        System.out.printf("%-20s %8s %12s %14s %n", "Producto", "Cant.", "Precio/u", "Importe");
        System.out.println("-".repeat(60));

        System.out.printf("%-20s %8d %12.2f %14.2f %n", nomProd1, cantProd1, precioProd1, precioTotal1 );
        System.out.printf("%-20s %8d %12.2f %14.2f %n", nomProd2, cantProd2, precioProd2, precioTotal2 );
        System.out.printf("%-20s %8d %12.2f %14.2f %n", nomProd3, cantProd3, precioProd3, precioTotal3 );
        System.out.println("-".repeat(60));
        System.out.printf("%-20s %8s %12s %14.2f %n", "TOTAL"," ", " ", precioTotalFinal);
        System.out.println("-".repeat(60));





     scanner.close();
     

    }
}
