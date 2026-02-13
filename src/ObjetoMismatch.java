import java.util.Scanner;

public class ObjetoMismatch {
    private String nombre;
    private String apellido;

    public ObjetoMismatch(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombreApellido(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjetoMismatch persona = null;

        System.out.print("¿Quieres introducir tu nombre completo?: ");
        String respuesta = sc.nextLine();

        if(respuesta.equals("si")) {
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce tu apellido: ");
            String apellido = sc.nextLine();
            persona = new ObjetoMismatch(nombre, apellido);
        }

        try {
            System.out.println(persona.getNombreApellido(persona.nombre, persona.apellido));
        } catch (NullPointerException e) {
            System.out.println("No se puede mostrar el nombre, motivo: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
