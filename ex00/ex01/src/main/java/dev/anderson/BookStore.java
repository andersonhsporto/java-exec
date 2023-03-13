package dev.anderson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

  private int taxISS;
  private int taxXLP;
  private List<Book> books;

  public BookStore() {
    this.taxISS = 30;
    this.taxXLP = 5;
    books = new ArrayList<>();
  }

  public static BookStore of() {
    return new BookStore();
  }

  public void insertBook(String title, float price, int quantity) {
    books.add(Book.of(title, price, quantity));
  }

  public void printInputBook(String title, float price, int quantity) {
    System.out.printf(
        "***\t%d Livros com o título %s, custando R$ %.2f cadastrados com sucesso.\n",
        quantity,
        title,
        price);

    printTax(price);
  }

  public void options(int option, Scanner scanner) {
    switch (option) {
      case 1:
        inputOption(scanner);
        break;
      case 2:
        sellOption(scanner);
        break;
      case 3:
        printBalance();
        break;
      case 4:
        System.out.println("Obrigado por utilizar o Livraria P2");
        System.exit(0);
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }
  }

  private void printTax(float price) {
    System.out.println("***\tImposto por cada livro");
    System.out.println("***\tImposto ISS: " + (price * taxISS / 100));
    System.out.println("***\tImposto XLP: " + (price * taxXLP / 100));
    System.out.print("***\tValor com impostos de cada livro é:");
    System.out.println(" R$ " + (price + (price * taxISS / 100) + (price * taxXLP / 100)));
  }

  private void sellBook(String title, int quantity) {
    if (!contains(title)) {
      System.out.println("***\tLivro não encontrado");
      return;
    }
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        book.removeQuantity(quantity);
      }
    }
    System.out.printf("***\t%d Livros com o título %s vendidos com sucesso.\n", quantity, title);
  }

  private boolean contains(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        return true;
      }
    }
    return false;
  }

  private void printBalance() {
    float total = 0;
    for (Book book : books) {
      System.out.println(book.toString());
      total += book.getPrice() * book.getQuantity();
    }
    System.out.println("***\tValor total em estoque: R$ " + total);
  }

  private boolean containsTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        return true;
      }
    }
    return false;
  }

  private float getBookPriceByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        return book.getPrice();
      }
    }
    return 0;
  }

  private void inputOption(Scanner scanner) {
    System.out.println("Digite o título do livro:");
    String title = scanner.nextLine();
    System.out.println("Digite a quantidade do livro:");
    int quantity = Integer.parseInt(scanner.nextLine());
    if (contains(title)) {
      System.out.println("***\tLivro já cadastrado");
      float price = getBookPriceByTitle(title);
      insertBook(title, price, quantity);
      return;
    } else {
      System.out.println("Digite o preço do livro:");
      float price = Float.parseFloat(scanner.nextLine());
      insertBook(title, price, quantity);
    }
    printInputBook(title, getBookPriceByTitle(title), quantity);
  }

  private void sellOption(Scanner scanner) {
    System.out.println("Digite o título do livro:");
    String title = scanner.nextLine();
    System.out.println("Digite a quantidade do livro:");
    int quantity = Integer.parseInt(scanner.nextLine());
    try {
      sellBook(title, quantity);
    } catch (IllegalArgumentException e) {
      System.out.println("***\tQuantidade indisponível");
    }
  }
}
