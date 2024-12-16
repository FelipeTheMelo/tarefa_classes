package Tarefa;
import java.util.Scanner;

public class TarefaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as 4 notas
        System.out.println("Digite as 4 notas do aluno (valores inteiros):");

        System.out.print("Nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.print("Nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.print("Nota 3: ");
        int nota3 = scanner.nextInt();

        System.out.print("Nota 4: ");
        int nota4 = scanner.nextInt();

        // Calcula a média
        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma / 4;

        // Exibe a média calculada
        System.out.println("\nMédia final: " + media);

        // Condições usando apenas if e else
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Fecha o scanner
        scanner.close();
    }
    }

