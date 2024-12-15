package AulasMedia;

public class AulaMedia {

    public static void main(String[] args) {
        // Valores fictícios para as notas
        double nota1 = 7.5;
        double nota2 = 6.0;
        double nota3 = 8.0;
        double nota4 = 5.5;

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificar se o aluno foi aprovado
        boolean aprovado = media >= 6;

        // Exibir o resultado
        System.out.println("Notas: ");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        System.out.println("\nMédia final: " + media);
        System.out.println("Aprovado: " + aprovado);
    }
}
