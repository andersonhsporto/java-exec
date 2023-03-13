import java.util.*;

class Main {

    public static void main(String args[]) {

		// Ler o numero de casos de teste
		int n = lerNumeros();

		System.out.println("Sequencia completa:");
		geraSequencia(n);

		System.out.println("Sequencia omitindo impares:");
		geraSequenciaOmitindoImpares(n);
    }

	public static int lerNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		try {
			int n = sc.nextInt();
			sc.close();
			return n;
		} catch (Exception e) {
			System.out.println("Erro ao ler o numero");
			return lerNumeros();
		}
	}

	public static boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	public static void geraSequencia(int numero) {
		for (int i = numero + 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void geraSequenciaOmitindoImpares(int numero) {
		for (int i = numero + 1; i <= 100; i++) {
			if (ehPar(i)) {
				System.out.println(i);
			}
		}
	}

}