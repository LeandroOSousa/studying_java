//Desafio 2: Verificação de Números Primos em um Intervalo
//Implemente um método findPrimesInRange que recebe dois inteiros,
// start e end, e retorna uma lista de números primos que estão entre start e end (inclusive).
//
//Regras:
//Um número primo é divisível apenas por 1 e por ele mesmo, e deve ser maior que 1.
//Se não houver números primos no intervalo, retorne uma lista vazia.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeUtils {
    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número (início do intervalo): ");
        int start = sc.nextInt();
        System.out.print("Digite o segundo número (fim do intervalo): ");
        int end = sc.nextInt();
        if (start < end) {
            System.out.println("Números primos dentro do intervalo = "
                    + findPrimesInRange(start, end));
            // Saída esperada: [11, 13, 17, 19] // Esses são os números primos entre 10 e 20
        } else {
            System.out.println("Erro: O primeiro número não pode ser maior que o segundo.");
            System.out.println("Por favor, insira os valores corretamente.");
        }
        sc.close();
    }
}
