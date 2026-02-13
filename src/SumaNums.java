import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el número uno: ");
            int n1 = sc.nextInt();
            System.out.print("Introduce el número dos: ");
            int n2 = sc.nextInt();
            int suma = n1 + n2;
            System.out.println("Resultado de la suma: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
            System.out.println("Fin del programa");
        }
    }
}
