import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int soma = 0;
    int produto = 1;
    for (int i = 0; i < N; i++) {gagagagaga
      int numero = sc.nextInt();
      soma += numero;
      produto *= numero;
    }
    System.out.println("Soma = " + soma);
    System.out.println("Produto = " + produto);
  }
}