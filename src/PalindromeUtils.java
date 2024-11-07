/*
Questão 3: Verificação de Palíndromos
Crie um método chamado isPalindrome que verifica se
uma String é um palíndromo (lê-se da mesma forma de frente para trás e de trás para frente).

Regras:
Ignore letras maiúsculas e espaços.
Retorne true se a String for um palíndromo e false caso contrário.
 */

public class PalindromeUtils {
    public static boolean isPalindrome(String word){

        if (word == null) {
            return false;
        }
        // Remove espaços e converte a string para letras minúsculas
        String cleanedWord = word.replaceAll("\\s+", "" ).toLowerCase();

        // Verifica se a string é igual à sua inversa
        int length = cleanedWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - i - 1)) {
                return false; // Não é um palíndromo
            }
        }
        return true; // É um palíndromo
    }

    public static void main(String[] args) {
        // Entrada:
        System.out.println(isPalindrome("A man a plan a canal Panama"));// Saída esperada: true
        System.out.println(isPalindrome("I am sorry but i have to go now"));// Saída esperada: false
    }
}
