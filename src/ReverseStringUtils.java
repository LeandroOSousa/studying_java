/*
Desafio 8: Inversão de String
Crie um método que recebe uma String e retorna a mesma String invertida.
 */

public class ReverseStringUtils {
    public static String reverseString(String text){

        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Java")); // "avaJ"
        System.out.println(reverseString("Desafio")); // "oifaseD"
    }
}