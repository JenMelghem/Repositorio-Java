public class Ejercicio4_22 {
    public static void main(String[] args) {
       // Imprime los encabezados de la tabla
       System.out.println("N\t10*N\t100*N\t1000*N");
 
       // Ciclo para imprimir cada fila de la tabla
       for (int n = 1; n <= 5; n++) {
          // Calcula los valores de la fila
          int diezN = 10 * n;
          int cienN = 100 * n;
          int milN = 1000 * n;
 
          // Imprime la fila de valores
          System.out.println(n + "\t" + diezN + "\t" + cienN + "\t" + milN);
       }
    }
 }