package TarefaColecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OrdenarNomes {
        public static void main(String[] args) {
            // Nomes fictícios em uma string
            String entrada = "Carlos, Ana, João, Beatriz, Maria, Pedro, Fernanda, Lucas, Amanda, Rafael";

            // Divide os nomes usando o split e cria uma lista
            ArrayList<String> nomes = new ArrayList<>(Arrays.asList(entrada.split(",")));

            // Remove espaços extras antes e depois dos nomes
            for (int i = 0; i < nomes.size(); i++) {
                nomes.set(i, nomes.get(i).trim());
            }

            // Ordena os nomes em ordem alfabética
            Collections.sort(nomes);

            // Imprime os nomes ordenados
            System.out.println("Nomes em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }

}
