import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    String nombre, clave;
    Scanner Entrada = new Scanner(System.in);
    System.out.print("Coloque el nombre de usuario: ");
    nombre = Entrada.nextLine ();
    System.out.print("Coloque la clave del usuario: ");
    clave = Entrada.nextLine ();
    if (nombre.equals("andrea")&& clave.equals("18443")) {
    System.out.println("Bienvenido al sistema");
    }
    else {
    System.out.println("Nombre de Usuario o password incorrecto");
    }
  }
}