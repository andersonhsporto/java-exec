package dev.anderson;

public class Book {

  private String title;

  private float price;

  private int quantity;

  public Book(String title, float price, int quantity) {
    this.title = title;
    this.price = price;
    this.quantity = quantity;
  }

  public static Book of(String title, float price, int quantity) {
    return new Book(title, price, quantity);
  }

  public String getTitle() {
    return title;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void removeQuantity(int quantity) {
    if (this.quantity - quantity < 0) {
      throw new IllegalArgumentException("Quantity is not available");
    }
    this.quantity -= quantity;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", price=" + price +
        '}';
  }
}
