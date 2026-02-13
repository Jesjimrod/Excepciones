import  java.util.Scanner;

//Array tipo String, rellenarle las posiciones y pedir un número fuera de rango
public class RangoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[3];

        System.out.print("Introduce la primera posicion: ");
        palabras[0] = sc.nextLine();
        System.out.print("Introduce la segunda posicion: ");
        palabras[1] = sc.nextLine();
        System.out.print("Introduce la tercera posicion: ");
        palabras[2] = sc.nextLine();

        System.out.println();
        System.out.print("¿Qué posición quieres mostrar?: ");
        int q = sc.nextInt();

        if(q>=palabras.length) {
            throw new ArrayIndexOutOfBoundsException("Te sales, colega");
        }

//        try {
//            System.out.println(palabras[q]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("No se puede leer el valor, motivo: " + e.getMessage());
//        } finally {
//            System.out.println("Fin del programa");
//        }
    }
}
