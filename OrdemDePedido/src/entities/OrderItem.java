package entities;

public class OrderItem {
  private Integer quantity;
  private Double price;
  
  Product product;

  public OrderItem() {
  }

  public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  
  public Product getProduct() {
    return product;
  }
  
  public void setProduct(Product product) {
    this.product = product;
  }
  
  public Double subTotal(){
    return quantity * price;
  }

  public String toString(){
    return "Order items:\n" +
            getProduct().getName()
            + ", $" 
            + String.format("%.2f" ,getPrice() )
            + ", Quantity: " 
            + getQuantity() 
            + ", Subtotal: " 
            + String.format("%.2f",subTotal());
  }

}
