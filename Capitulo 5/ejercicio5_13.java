public class ejercicio5_13 {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.printf("%2d! = %,d%n", n, factorial);
        }
    }
}