// Classe Main com Reflection para acessar o nome da tabela
public class Main {
    public static void main(String[] args) {
        Class<Usuario> clazz = Usuario.class;

        // Verifica se a classe possui a annotation @Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            // Obtém a annotation @Tabela
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            // Imprime o valor do nome da tabela
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A classe não possui a annotation @Tabela.");
        }
    }
}