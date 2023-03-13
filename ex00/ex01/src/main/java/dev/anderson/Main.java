package dev.anderson;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    loopBookStore();
  }

  public static void loopBookStore() {
    System.out.println("= = = = Bem-vindo(a) ao Livraria P2 = = = = ");
    Scanner scanner = new Scanner(System.in);
    BookStore bookStore = new BookStore();

    while (true) {
      printMessage();
      try {
        int option = Integer.parseInt(scanner.nextLine());
        bookStore.options(option, scanner);
      } catch (NumberFormatException e) {
        System.out.println("Opção inválida");
      }

    }
  }

  public static void printMessage() {
    System.out.println("\nDigite a opção desejada:");
    System.out.println("1 - Cadastrar um Livro");
    System.out.println("2 - Vender um Livro");
    System.out.println("3 - Imprimir Balanço");
    System.out.println("4 - Sair");
    System.out.print("Opção: ");
  }
}