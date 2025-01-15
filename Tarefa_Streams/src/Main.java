import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista principal
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite os nomes e sexos no formato 'Nome-Sexo' (ex: Ana-F) separados por vírgula:");
        System.out.println("Pressione ENTER após a entrada.");
        String input = scanner.nextLine();

        // Adicionando os dados à lista
        String[] entradas = input.split(",");
        for (String entrada : entradas) {
            pessoas.add(entrada.trim());
        }

        // Filtrar somente as mulheres (Sexo "F")
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> {
                    String[] partes = pessoa.split("-");
                    if (partes.length == 2) {
                        String sexo = partes[1].trim().toUpperCase();
                        return sexo.equals("F");
                    } else {
                        return false; // Ignorar entradas inválidas
                    }
                })
                .collect(Collectors.toList());

        // Exibir a lista completa e a lista filtrada
        System.out.println("\nLista completa:");
        pessoas.forEach(System.out::println);

        System.out.println("\nLista de mulheres:");
        if (mulheres.isEmpty()) {
            System.out.println("Nenhuma mulher encontrada na lista.");
        } else {
            mulheres.forEach(System.out::println);
        }

        scanner.close();
    }
}