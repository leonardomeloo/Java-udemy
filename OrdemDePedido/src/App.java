import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("e-mail: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY)");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, Client.parseDate(birthDate));

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        
        LocalDateTime dateNow = LocalDateTime.now();    
        Order order = new Order(dateNow, status, client);

        System.out.println("How many items to this order?");
        int qnt = sc.nextInt();

        for(int i=0;i<qnt;i++){
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int qntProduct = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(qntProduct, productPrice, product);
            
            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();
        
    }
}
