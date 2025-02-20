import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         
        Client client = new Client("Alex Green", "alex@gmail.com", Client.parseDate("15/03/1985"));
        Order order = new Order(LocalDateTime.now(), OrderStatus.PENDING_PAYMENT, client);


     

        System.out.println(order.toString());

    }
}
