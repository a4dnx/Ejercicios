import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner objetoNum = new Scanner(System.in);
    Scanner objetoTexto = new Scanner(System.in);

    String seguir="s";
    double num,suma;
    int conteo = 0, primo =0, noprimo =0;

    while ("s".equals(seguir) || "S".equals(seguir));
    {
      System.out.println("ingrese un numero positivo");
      num=objetoNum.nextInt ();
      while (num<0)
        {
          System.out.println("ingrese un numero positivo");
          num=objetoNum.nextInt ();
        }
        conteo++;
        if (num%2==0)
        {
          primo++;
        }
        else
        {
          noprimo++;
        }

        System.out.println("desea ingresar otro valor, s");
        seguir=objetoTexto.next();
    }
      
  }
}