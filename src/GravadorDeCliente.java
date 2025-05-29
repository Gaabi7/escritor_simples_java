import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GravadorDeCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Gabriela", 21));
        clientes.add(new Cliente("Mirian", 41));
        clientes.add(new Cliente("Guilherme", 50));

        try {
            FileWriter escritor = new FileWriter("clientes.txt");
            for (Cliente c : clientes) {
                escritor.write(c.toString() + "\n");
            }
            escritor.close();
            System.out.println("Clientes gravados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar clientes.");
            e.printStackTrace();
        }
    }
}
