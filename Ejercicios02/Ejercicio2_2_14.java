public class Ejercicio2_2_14 {
    public static void main(String[] args) {
        double distancia1 = 23.5;
        double distancia2 = 12.3;
        double distancia3 = 45.6;
        int totaslEtapas = 3;
        long registroRecorrido = 123456789L;

        double mediaDistanciaEtapa = (distancia1 + distancia2 + distancia3) / totaslEtapas;

        System.out.println("Distancia etapa 1: " + distancia1);
        System.out.println("Distancia etapa 2: " + distancia2);
        System.out.println("Distancia etapa 3: " + distancia3);
        System.out.println("Total de etapas: " + totaslEtapas);
        System.out.println("Registro de recorrido: " + registroRecorrido);
        System.out.println("Media de distancia por etapa: " + mediaDistanciaEtapa);
    }
}
