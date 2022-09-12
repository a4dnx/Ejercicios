import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    System.out.println("ingrese la base: ");
    double base = Entrada.nextDouble ();
    System.out.println ("ingrese el exponente: ");
    double exponente = Entrada.nextDouble ();
    double resultado = Math.pow (base, exponente);
    System.out.println("El resultado es: "+ resultado);
  }
}