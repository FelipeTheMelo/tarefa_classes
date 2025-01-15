import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    @Test
    public void testListaDeMulheres() {
        // Lista simulada (entrada de exemplo)
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Ana-F");
        pessoas.add("João-M");
        pessoas.add("Maria-F");
        pessoas.add("Carlos-M");

        // Filtrar as mulheres
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

        // Verificar se todos os elementos da lista filtrada são mulheres (sexo = F)
        assertTrue(mulheres.stream()
                        .allMatch(mulher -> mulher.split("-")[1].trim().equalsIgnoreCase("F")),
                "A lista de mulheres contém apenas pessoas do sexo feminino.");
    }
}