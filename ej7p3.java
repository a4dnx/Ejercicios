import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner objeto = new Scanner(System.in);
    int numero1, numero2, respuesta, contador;
    System.out.println("ingresa el primer numero");
    numero1 = objeto.nextInt ();
    System.out.println("ingresa el segundo numero");
    numero2 = objeto.nextInt ();
    contador = numero1;
    while (contador > numero2) {
      System.out.println (contador);
      contador--;
    }
  }
}