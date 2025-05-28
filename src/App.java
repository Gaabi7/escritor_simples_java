import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            FileWriter escritor = new FileWriter("frase.txt");
            
            escritor.write("A prática leva à perfeição!");
            escritor.close();
            System.out.println("Frase escrita com sucesso!");

            } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo.");
            e.printStackTrace();
        }
    }
}
