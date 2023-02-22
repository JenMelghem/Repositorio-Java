public class ejercicio5_14 {

    public static void main(String[] args) {
        
        double monto;
        double principal = 1000.0;
        
        for (int tasa = 5; tasa <= 10; tasa++) {
            System.out.printf("Tasa de interés del %d%%:%n", tasa);
            System.out.printf("%s%20s%n", "Año", "Monto en depósito");
            
            for (int anio = 1; anio <= 10; anio++) {
                monto = principal * Math.pow(1.0 + (double) tasa / 100, anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            }
            System.out.println();
        }
    }
}