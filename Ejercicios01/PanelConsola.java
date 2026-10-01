public class PanelConsola {
    public static void main(String[] args) {

System.out.println("CALCULADORA \u00a9");
System.out.println();
System.out.print("operaciones: ");
System.out.println("suma, resta, multiplicacion, division");
System.out.println();
System.out.println("ECUACIONES\t\tTOTAL");
System.out.println();
System.out.printf("%d + %d =\t\t\t %d\n", 5, 3, 2);
System.out.printf("%.2f - %.2f =\t\t %.2f\n", 5.0, 3.0, 2.0);
System.out.printf("%c * %c =\t\t\t %c*%c\n", 'A', 'B', 'A', 'B');
System.out.printf("100/4 = 20 ->\t\t %b%n", false);
System.out.println("100%4 =\t\t\t" + (100%4));
int a =10;
int b = 5;
int total = a * b;
System.out.println(a + " * " + b + " = \t\t" + total);
System.out.println();
System.out.println("\"Inserta nueva operacion...\"");

System.out.println("""
------------------------
Creadora:\tSolayfa
Fecha:\t\t01\\10\\2026
------------------------        
        """);

        
    }
    
}
