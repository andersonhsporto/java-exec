import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> numeros = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {
      numeros.add(sc.nextInt());
    }

    System.out.println("Menor Valor: " + Collections.min(numeros));
    System.out.println("Valor medio: " + (Collections.min(numeros) + Collections.max(numeros)) / 2);
    System.out.println("Pares: " + numeros.stream().filter(n -> n % 2 == 0).count());
    System.out.println("Impares: " + numeros.stream().filter(n -> n % 2 != 0).count());
  }
}