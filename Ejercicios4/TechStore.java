import java.util.Scanner;

public class TechStore {
    public static final double DESC_MENOR_100 = 0;
    public static final double DESC_DESDE_100_MENOR_300 =0.05;
    public static final double DESC_DESDE_300_MENOR_500 = 0.08;
    public static final double DESC_DESDE_500_MAS = 0.1;

    public static final double DESC_PARTICULAR = 0;
    public static final double DESC_ESTUDIANTE = 0.03;
    public static final double DESC_EMPRESA = 0.04;

    public static final double DESC_TARJETA = 0;
    public static final double DESC_EFECTIVO = 0.02;
    public static final double DESC_BIZUM = 0.01;

    public static final double DESC_MAX = 0.15;
    public static void main(String[] args) {
        banner();
    }
        public static void banner(){
        char esqSupIzq = '\u2554'; // ╔
        char esqSupDer = '\u2557'; // ╗
        char esqInfIzq = '\u255A'; // ╚
        char esqInfDer = '\u255D'; // ╝
        char horiz      = '\u2550'; // ═
        char vert       = '\u2551'; // ║


        String lineaSup = esqSupIzq + Character.toString(horiz).repeat(40) + esqSupDer;
        System.out.println(lineaSup);

        String lineaMed = vert + " ".repeat(9) + "TECH-STORE - NUEVA VENTA" + " ".repeat(7) + vert;
        System.out.println(lineaMed);

        String lineainf = esqInfIzq + Character.toString(horiz).repeat(40) + esqInfDer;
        System.out.println(lineainf);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio u (€): ");
        Double precioUnidad = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());


        System.out.println("""
                Tipo de cliente
                ---------------
                1. Particular
                2. Estudiante
                3. Empresa


                Seleccione: """);
                int tipoCliente = Integer.parseInt(scanner.nextLine());

        System.out.println("""
                Forma de pago
                -------------
                T. Tarjeta
                E. Efectivo
                B. Bizum


                Seleccione: """);
                char formaPago = scanner.nextLine().toUpperCase().charAt(0);

        if (producto.strip().length() == 0){
            System.out.println("Nombre de producto vacio");
        }
        if(precioUnidad <= 0.0){
        System.out.println("Precio 0 o negativo");
        }
        if(cantidad<=0 || cantidad >=11){
            System.out.println("Cantidad fuera de rango[1,10]");
        }
        if (tipoCliente<1 || tipoCliente>3){
            System.out.println("tipo incorrecto solo se aceptan 1,2,3");
        }
        if (formaPago!='T' && formaPago !='E' && formaPago !='B'){
            System.out.println("Pago no valido");

        }

        double importeBruto = precioUnidad * cantidad;
        
        double descuentoImporte = 0;
        if(importeBruto<=100){
            descuentoImporte = DESC_MENOR_100;
        }else if(importeBruto<300){
            descuentoImporte = DESC_DESDE_100_MENOR_300;
        }else if(importeBruto<500){
            descuentoImporte = DESC_DESDE_300_MENOR_500;
        }else {
            descuentoImporte = DESC_DESDE_500_MAS;
        }
        
        double descuentoCliente = 0;
        if(tipoCliente==1){
            descuentoCliente += DESC_PARTICULAR;
        }else if (tipoCliente == 2 && cantidad >= 2){
            descuentoCliente+= DESC_ESTUDIANTE;
        }else if(cantidad >=3 && importeBruto >= 250){
            descuentoCliente +=DESC_EMPRESA;
        }

        double descuentoPago = 0;
        switch(formaPago){
            case 'E':
                descuentoPago += DESC_EFECTIVO;
            break;

            case 'B':
                descuentoPago += DESC_BIZUM;
            break;

            case 'T':
                descuentoPago += DESC_TARJETA;
            break;
        }

        double descuentoTotal = descuentoCliente + descuentoImporte +descuentoPago;
        if(descuentoTotal > DESC_MAX){
            System.out.println("Descuento mayor al" + DESC_MAX*100 + "%");
            descuentoTotal = DESC_MAX;
        }
        
        double importeNeto = importeBruto * (1-descuentoTotal);
        double descImporte = -importeBruto * descuentoImporte;
        double descCli = -importeBruto * descuentoCliente;
        double descPag = -importeBruto * descuentoPago;

        double descTotal = descCli + descPag +descImporte;


    
        String lineaSup2 = esqSupIzq + Character.toString(horiz).repeat(40) + esqSupDer;
        System.out.println(lineaSup2);

        String lineaMed2 = vert + " ".repeat(9) + "TECH-STORE - TICKET" + " ".repeat(12) + vert;
        System.out.println(lineaMed2);

        String lineainf2 = esqInfIzq + Character.toString(horiz).repeat(40) + esqInfDer;
        System.out.println(lineainf2);

        System.out.printf("%c %-20s %10s %8c %n", vert, "Producto", producto, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Precio unitario", precioUnidad, vert);
        System.out.printf("%c %-20s %10d %8c %n", vert, "Cantidad", cantidad, vert);
        System.out.println(lineainf2);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Importe bruto", importeBruto, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Dto. por importe",descImporte, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Dto. cliente",descCli, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Dto. pago", descPag, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Descuento calculado", descTotal, vert);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "Descuento aplicado", descTotal, vert);
        System.out.printf("%c %-20s %10s %8c %n", vert, "Gastos de envio", "0.00€", vert);
        System.out.println(lineainf2);
        System.out.printf("%c %-20s %10.2f %8c %n", vert, "TOTAL", importeNeto, vert);
        System.out.printf("%c %-20s %7s %4c %n", vert, "clasificacion", "COMPRA PREMIUM", vert);
        System.out.println(lineainf2);












    


    scanner.close();
        








        }
    }

