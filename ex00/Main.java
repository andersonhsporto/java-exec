import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;

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
		int n = sc.nextInt();
		return n;
	}

	public static boolean ehPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
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
