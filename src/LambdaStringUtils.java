import java.util.Arrays;
import java.util.List;

/*
Exercício Prático
Para praticar, tente criar uma expressão lambda que receba uma
lista de Strings e retorne uma nova lista com todos os nomes em maiúsculas.

Dica: Use o método map e a função String::toUpperCase.
 */
public class LambdaStringUtils {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Leandro", "Stephani", "Kaio", "Larissah");

        List<String> namesUpperCase = names.stream()
                                            .map(String::toUpperCase)
                                            .toList();
        System.out.println(namesUpperCase);
    }
}
