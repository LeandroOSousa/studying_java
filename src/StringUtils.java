//Desafio 5: Contagem de Caracteres em uma String
//Implemente um método countCharacterOccurrences que recebe
// uma String e um caractere, e retorna o número de vezes
// que o caractere aparece na String.
// O método deve ser insensível a maiúsculas e minúsculas.

public class StringUtils {
    public static int countCharacterOccurrences(String text, char charactere) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(charactere) == text.toLowerCase().charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Entrada:
        String text = "Programming in Java";
        char character = 'a';

        // Saída esperada: 3 // (o caractere 'a' aparece três vezes na string)
        System.out.println(countCharacterOccurrences(text, character));
    }
}
