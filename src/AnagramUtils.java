import java.util.Arrays;

/*
Desafio 7: Verificador de Anagramas
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

    public static void main(String[] args) {
        System.out.println(areAnagrams("Amor", "Roma")); // true
        System.out.println(areAnagrams("Calor", "Carol")); // true
        System.out.println(areAnagrams("Palavra", "Alpava")); // false
        System.out.println(areAnagrams("Dormitory", "Dirty room")); // true
    }
}
