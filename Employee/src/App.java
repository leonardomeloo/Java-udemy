import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsoucerdEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<Employee>();
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Outsourced: ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours worked: ");
            int hoursWorked = sc.nextInt();
            System.out.print("Velue hours: ");
            Double velueHours = sc.nextDouble();
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additional = sc.nextDouble();
                
                list.add(new OutsoucerdEmployee(name, hoursWorked, velueHours, additional));
            } else {
                
                list.add(new Employee(name, hoursWorked, velueHours));

            }

        }
        System.out.println();
        System.out.println("Payment: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
