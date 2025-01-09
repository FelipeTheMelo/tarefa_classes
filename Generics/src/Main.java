import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação de uma lista genérica para carros
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros
        listaDeCarros.add(new Honda("Civic"));
        listaDeCarros.add(new Mercedes("Classe A"));
        listaDeCarros.add(new BMW("X5"));

        // Exibindo os detalhes de cada carro
        for (Carro carro : listaDeCarros) {
            carro.exibirDetalhes();
        }
    }
}