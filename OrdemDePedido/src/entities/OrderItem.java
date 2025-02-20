package entities;

public class OrderItem {
  private int quantity;
  private double price;
  
  Product product;

  public OrderItem() {
  }

  public OrderItem(int quantity, double price) {
    this.quantity = quantity;
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double subTotal(){
    return quantity * price;
  }
  
}
