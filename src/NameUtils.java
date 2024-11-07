/*
Questão 2: Ordenação de Nomes
Implemente um método chamado sortNames que recebe uma
lista de nomes (String) e retorna uma nova lista com os nomes em ordem alfabética.

Regras:
A lista original não deve ser alterada.
Retorne uma lista vazia se a entrada for nula ou vazia.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameUtils {
    public static List<String> sortNames(List<String> names) {
        if (names.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> sortedNames = new ArrayList<>(names);
        sortedNames.toString().toLowerCase();
        Collections.sort(sortedNames);
        return sortedNames;
    }

    public static void main(String[] args) {
        // Entrada:
        List<String> names = Arrays.asList("Carlos", "Ana", "Bruno");
        List<String> voidList = new ArrayList<>();

        System.out.println(sortNames(names));
        // Saída esperada: [Ana, Bruno, Carlos]

        System.out.println(sortNames(voidList));
        // Saída esperada: []
    }
}
