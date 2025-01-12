import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a annotation Tabela
@Retention(RetentionPolicy.RUNTIME) // Torna a annotation disponível em tempo de execução
@Target(ElementType.TYPE) // Define que a annotation pode ser usada em classes, interfaces ou enums
public @interface Tabela {
    String value(); // Atributo que será usado para definir o nome da tabela
}

