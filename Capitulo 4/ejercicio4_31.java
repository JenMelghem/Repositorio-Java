import java.util.Scanner;

public class ejercicio4_31 {
   public static void main(String[] args) {
      // Lee el número binario como una cadena de texto
      Scanner input = new Scanner(System.in);
      System.out.print("Introduzca un número binario: ");
      String binarioString = input.nextLine();

      // Convierte la cadena de texto en un número entero
      int binario = Integer.parseInt(binarioString);

      // Convierte el número binario en su equivalente decimal
      int decimal = 0;
      int base = 1;
      while (binario > 0) 
      {
         int digito = binario % 10;
         binario /= 10;
         decimal += digito * base;
         base *= 2;
      }

      // Imprime el resultado
      System.out.println("El equivalente decimal de " + binarioString + " es " + decimal);
   }
}