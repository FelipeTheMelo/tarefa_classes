package TarefaColecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class AgruparNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os grupos por sexo
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        // Solicita os nomes e sexos ao usuário
        System.out.println("Digite os nomes e sexos separados por traço (exemplo: Matheus-m), separados por vírgula:");
        String entrada = scanner.nextLine();

        // Divide os pares nome-sexo com base nas vírgulas
        String[] pessoas = entrada.split(",");

        // Processa cada entrada
        for (String pessoa : pessoas) {
            String[] dados = pessoa.trim().split("-"); // Divide nome e sexo com base no traço
            String nome = dados[0].trim();
            String sexo = dados[1].trim().toLowerCase();

            // Adiciona à lista correspondente
            if (sexo.equals("m")) {
                masculino.add(nome);
            } else if (sexo.equals("f")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido para: " + nome);
            }
        }

        // Exibe os resultados
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
