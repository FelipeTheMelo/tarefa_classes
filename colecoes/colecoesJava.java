package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class AgruparPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um Map para armazenar os grupos masculino e feminino
        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        String opcao;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().trim().toUpperCase();

            // Verifica o sexo e adiciona no grupo correspondente
            if (sexo.equals("M")) {
                grupos.get("Masculino").add(nome);
            } else if (sexo.equals("F")) {
                grupos.get("Feminino").add(nome);
            } else {
                System.out.println("Sexo inválido! Use 'M' para masculino ou 'F' para feminino.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            opcao = scanner.nextLine().trim().toUpperCase();

        } while (opcao.equals("S"));

        scanner.close();

        // Exibe os grupos
        System.out.println("\nGrupo Masculino: " + grupos.get("Masculino"));
        System.out.println("Grupo Feminino: " + grupos.get("Feminino"));
    }
}


