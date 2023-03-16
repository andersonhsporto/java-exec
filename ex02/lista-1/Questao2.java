import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int m = 0;
    int n = 0;
    try {
      System.out.println("Digite o primeiro numero: ");
      n = sc.nextInt();

      System.out.println("Digite o segundo numero: ");
      m = sc.nextInt();
    } catch (Exception e) {
      System.out.println("Erro ao ler o numero");
      main(args);
    }

    System.out.println("A soma dos numeros eh: " + (n + m));
    System.out.println("A subtracao dos numeros eh: " + (n - m));
    System.out.println("A multiplicacao dos numeros eh: " + (n * m));
    System.out.println("A divisao dos numeros eh: " + (n / m));
    System.out.println("O resto da divisao dos numeros eh: " + (n % m));
  }
}