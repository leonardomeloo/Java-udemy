package entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
  private LocalDateTime moment;
  private OrderStatus status;

  Client client;
  List<OrderItem> items = new ArrayList<>();
  
  public Order(LocalDateTime moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
  private LocalDateTime toDay = LocalDateTime.now();
  

  public LocalDateTime getMoment() {
    return moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public void addItem(OrderItem item){
    items.add(item);
  }
  public void removeItem(OrderItem item){
    items.remove(item);
  }

  public double total(){
    double sum = 0.0;
    for(OrderItem t : items){
      sum += t.subTotal();
    }
    return sum;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: ");
    sb.append(toDay.format(formatter));
    sb.append(" Order Status: ");
    sb.append(status + "\n");
    sb.append("Client: ");
    sb.append(client + "\n");
    sb.append("Order items:\n");
    for(OrderItem item : items){
      sb.append(item + "\n");
    }
    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }


  
}
