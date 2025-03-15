import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Map<String, Integer> votacao = new TreeMap<>();
        String path = "D:\\Estudo-Java\\Java-udemy\\VotacaoMap\\src\\files\\votos.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
               String[] field = line.split(",");
               String candidato = field[0];
               int votos = Integer.parseInt(field[1]);
               
               votacao.put(candidato, votacao.getOrDefault(candidato, 0) + votos);              
               line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        for(Map.Entry<String, Integer> entry : votacao.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
