package Tarefa_Wrapp;

public class TarefaWrapp {

    public static void main(String[] args) {
        // Exemplo fictício: valor inteiro
        int valorPrimitivo = 42; // Valor primitivo
        Integer valorWrapper = Integer.valueOf(valorPrimitivo); // Conversão para Wrapper

        // Exemplo fictício: valor decimal
        double valorPrimitivoDouble = 3.14; // Valor primitivo
        Double valorWrapperDouble = Double.valueOf(valorPrimitivoDouble); // Conversão para Wrapper

        // Exibe os valores inteiros
        System.out.println("Exemplo com inteiro:");
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor Wrapper (Integer): " + valorWrapper);

        // Exibe os valores decimais
        System.out.println("\nExemplo com decimal:");
        System.out.println("Valor primitivo: " + valorPrimitivoDouble);
        System.out.println("Valor Wrapper (Double): " + valorWrapperDouble);
    }
}
