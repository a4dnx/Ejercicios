import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner Reader = new Scanner(System.in);
    int contador;
    int fin;
    System.out.println("Ingrese el valor inicial (contador)");
    contador = Reader.nextInt ();
    System.out.println("ingrese el valor final");
    fin = Reader.nextInt ();
      while(contador <= fin) {
      System.out.println("valor actual de la iteracion "+contador);
      contador++;
      }
  }
}