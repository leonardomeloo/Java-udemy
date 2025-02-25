import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products:");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Product #" + (i+1) + "data:");
            System.out.print("Common, used o import (c/u/i)? ");
            char ch = sc.next().charAt(0);
            if(ch=='c'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product product = new Product(name, price);
                list.add(product);
            }
            else if(ch=='u'){
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Manufacture date (DD/MM/YYYY)");
                String date = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate manufatureDate = LocalDate.parse(date, formatter);

                Product usedProduct = new UsedProduct(name, price, manufatureDate);
                list.add(usedProduct);
            } 
            else if(ch=='i'){
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                Product importedProduct = new ImportedProduct( name,  price, customsFee);
                list.add(importedProduct);
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product item : list){
            System.out.println(item.priceTag());
        }
        sc.close();
    }
}
