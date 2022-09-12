import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    for (int n = 1; n <=10; n++) {
      int f = 1;
      for (int i = 2; i<=n; i++) {
        f *= i;
      }
      System.out.print("El factor de " + n);
      System.out.println(" es: " + f);
    }
  }
}