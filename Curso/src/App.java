import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for Course A?");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int cod = sc.nextInt();
            a.add(cod);
        }
        System.out.print("How many students for Course B?");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int cod = sc.nextInt();
            b.add(cod);
        }
        System.out.print("How many students for Course C?");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int cod = sc.nextInt();
            c.add(cod);
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Total: " + total.size());
        sc.close();
    }
}
