import java.util.Scanner;

public class PedirNumeros {

    //pedir dos numeros e impedir que el programa se rompa si el segundo es 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

//        if(n2==0) {
//            throw new ArithmeticException("El segundo número no puede ser 0");
//        }
//        double resultado = n1 / n2;
//        System.out.println("El resultado es: " + resultado);

        try {
            double resultado = n1 / n2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("División por 0 " + e);
        } finally {
            sc.close();
        }


    }
}
