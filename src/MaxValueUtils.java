/*
Questão 4: Busca de Maior Valor em uma Lista
Escreva um método findMaxValue que receba uma
lista de números inteiros e retorne o maior valor encontrado na lista.

Regras:
Se a lista estiver vazia ou for nula, o método deve retornar Integer.MIN_VALUE.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxValueUtils {
    public static int findMaxValue(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()){
            return Integer.MIN_VALUE;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int n : numbers){
            if (n > maxValue){
                maxValue = n;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        // Entrada:
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

        System.out.println(findMaxValue(numbers));
        // Saída esperada: 30

        System.out.println(findMaxValue(new ArrayList<>()));
        // Saída esperada : -2147483648
    }
}
