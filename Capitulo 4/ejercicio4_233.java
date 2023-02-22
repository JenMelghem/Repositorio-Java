import java.util.Scanner;

public class ejercicio4_233 {

    public static void main(String args[]){
    
    try (Scanner entrada = new Scanner(System.in)) {
        int cont = 1;
        int num;
        int mayor1 = 0;
        int mayor2 = 0;
        
        
        System.out.printf("Escriba el numero %d\n ", cont++);
        mayor1 = entrada.nextInt();
        
        System.out.printf("Escriba el numero %d\n ", cont++);
        mayor2 = entrada.nextInt();
        
        if (mayor2 > mayor1)
        mayor1 = mayor2;
        
        while (cont <= 3){
        
        System.out.printf("Escriba el numero %d\n", cont++);
        num = entrada.nextInt();
        
        if (num > mayor1)
        
        mayor1 = num;
        
        
        } // fin del while
        
        System.out.printf("El primer numero mayor es : %d\nEl segundo numero mayor es : %d ",mayor1, mayor2);
    }
    
    }
    
    }