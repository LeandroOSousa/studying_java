//Desafio: Filtrar e Classificar Nomes
//Descrição: Dada uma lista de nomes, você deve filtrar apenas os nomes que começam com uma letra específica e classificá-los em ordem alfabética.
//
//Instruções:
//
//Crie um método List<String> filtrarENomear(List<String> nomes, char letra).
//O método deve receber uma lista de nomes e uma letra (char) como entrada.
//Use streams e lambdas para:
//Filtrar apenas os nomes que começam com a letra fornecida.
//Classificar esses nomes em ordem alfabética.
//Retorne uma lista contendo apenas os nomes filtrados e classificados.
//Exemplo: Para a entrada ["Ana", "Alice", "Bruno", "Carlos", "Amanda", "Bianca"]
// e a letra 'A', o método deve retornar ["Alice", "Amanda", "Ana"].
//
//Dicas:
//
//Use filter() para selecionar os nomes que começam com a letra desejada.
//Use sorted() para classificar os nomes.
//Lembre-se de que strings têm um método startsWith(String prefix) que pode ser útil.
//Desafio Extra: Tente tornar a filtragem insensível a maiúsculas e minúsculas
//(por exemplo, tanto 'a' quanto 'A' devem funcionar para nomes que começam com "A").

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterSortNamesUtils {
    public static List<String> filtrarENomear(List<String> nomes, char letra){
        // Cria uma String que recebe o valor do char e o transforma em minúscula
        String prefixo = String.valueOf(letra).toLowerCase();
        return nomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith(prefixo)) // Filtra nomes que começam com a letra
                .sorted() // Ordena em ordem alfabética
                .collect(Collectors.toList()); // Coleta como uma lista
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada:
        List<String> nomes = Arrays.asList("Ana", "Alice", "Bruno", "Carlos", "Amanda", "Bianca");
        System.out.print("Digite uma letra: ");
        String sLetra = sc.nextLine();
        char letra = sLetra.charAt(0);
        System.out.println(filtrarENomear(nomes, letra));
        sc.close();
    }
}
