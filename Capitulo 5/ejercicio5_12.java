import java.util.Scanner;
public class ejercicio5_12 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) { // si i es impar
                product *= i; // se multiplica por el número actual
            }
        }
        System.out.println("El producto de los enteros impares del 1 al 15 es: " + product);
    }
}