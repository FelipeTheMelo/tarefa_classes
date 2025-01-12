import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<Usuario> clazz = Usuario.class;

        // Verifica se a annotation Tabela está presente
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A classe não possui a annotation Tabela.");
        }
    }
}