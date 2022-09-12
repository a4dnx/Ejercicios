import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int password;
    do {
      System.out.print("ingrese un password numerico: ");
      password = keyboard.nextInt ();
      if (password != 1234)
        System.out.println("el password no es valido. ");
      
    }
      while (password != 1234);
  }
}