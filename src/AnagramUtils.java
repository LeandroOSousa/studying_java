import java.util.Arrays;

/*
Desafio: Verificador de Anagramas
Crie um método que recebe duas Strings e verifica se elas são anagramas,
ignorando maiúsculas, minúsculas, espaços e pontuação.
 */
public class AnagramUtils {
    public static boolean areAnagrams(String text1, String text2) {
        // Remove espaços e converte a string para letras minúsculas
        String t1 = text1.replaceAll("\\s+", "").toLowerCase();
        String t2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Verifica se os comprimentos são diferentes
        if (t1.length() != t2.length()) {
            return false;
        }

        // Converte as strings em arrays de caracteres
        char[] chars1 = t1.toCharArray();
        char[] chars2 = t2.toCharArray();

        // Ordena os arrays de caracteres
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compara os arrays ordenados
        return Arrays.equals(chars1, chars2);
    }

    // Solução sem Arrays.sort
    static boolean isAnagram(String a, String b) {
        // Remove espaços e converte a string para letras minúsculas
        String a1 = a.replaceAll("\\s+", "").toLowerCase();
        String b1 = b.replaceAll("\\s+", "").toLowerCase();

        // Verifica se os comprimentos são diferentes

        if (a1.length() != b1.length()) return false;

        // Cria um array de contagem para armazenar a quantidade de cada letra.
        // O array possui 26 posições, uma para cada letra do alfabeto ('a' a 'z').
        int[] contador = new int[26];

        // Percorre cada caractere das duas strings
        for (int i = 0; i < a1.length(); i++) {
            // Para cada caractere em "a1", incrementamos o valor no índice correspondente.
            // Subtrair 'a' de um caractere dá a posição dele no alfabeto (ex: 'a' - 'a' = 0, 'b' - 'a' = 1).
            contador[a1.charAt(i) - 'a']++;

            // Para cada caractere em "b1", decrementamos o valor no índice correspondente.
            contador[b1.charAt(i) - 'a']--;
        }

        // Após as operações acima, se "a1" e "b1" são anagramas,
        // cada posição em "contador" deve ser zero.
        // Se houver alguma posição diferente de zero, não são anagramas.
        for (int count : contador) {
            if (count != 0) {
                return false; // Há diferença na contagem de caracteres, logo, não são anagramas.
            }
        }
        // Se todas as posições são zero, as strings são anagramas.
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Amor", "Roma")); // true
        System.out.println(areAnagrams("Calor", "Carol")); // true
        System.out.println(areAnagrams("Palavra", "Alpava")); // false
        System.out.println(areAnagrams("Dormitory", "Dirty room")); // true
    }
}
