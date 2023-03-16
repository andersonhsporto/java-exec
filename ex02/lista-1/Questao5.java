import java.util.Scanner;

class Questao5 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

		if (isPrime(N, 2)) {
			System.out.println("O numero " + N + " eh um numero primo");
		} else {
			System.out.println("O numero " + N + " nao eh um numero primo");
		}
  }

  public static boolean isPrime(int n, int i) {
		if (n <= 2) {
			return (n == 2) ? true : false;
		}
		if (n % i == 0) {
			return false;
		}
		if (i * i > n) {
			return true;
		}
    return isPrime(n, i + 1);
  }
}