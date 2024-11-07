import java.util.Arrays;
import java.util.List;

/*
Desafios para Praticar
1 - Filtre e Some Números: Dada uma lista de números, filtre os números ímpares e some-os.
2 - Obtenha Comprimentos de Strings: Dada uma lista de palavras, crie uma nova lista com o comprimento de cada palavra.
 */
public class StreamsUtils {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers);

        // soma os somente os números impares da lista numbers e atribui a variável
        int sumNumbers = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

        // imprime a soma
        System.out.println("Impares :" + sumNumbers);

        List<String> words = Arrays.asList("Carro", "Moto", "Borboleta", "Welcome to Java", "Olá Mundo");
        System.out.println(words);

        // captura o tamanho de cada palavra e coloca em uma nova lista de inteiros
        List<Integer> lengths = words.stream().map(String::length).toList();

        // imprime lista com os tamanhos das palavras
        System.out.println(lengths);
    }
}
