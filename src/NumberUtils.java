/*
Questão 1: Soma dos Números Pares de uma Lista
Implemente um método em Java chamado sumEvenNumbers
que recebe uma lista de números inteiros e retorna a soma de todos os números pares.

Regras:
Utilize a estrutura de repetição que preferir.
Se a lista estiver vazia, o método deve retornar 0.
 */

import java.util.Arrays;
import java.util.List;

public class NumberUtils {
    public static int sumEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers){
            if (n % 2 == 0){
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Entrada:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumEvenNumbers(numbers));
        // Saída esperada: 12 // (2 + 4 + 6)
    }
}
