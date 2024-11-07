import java.util.Scanner;

public class OpTernario {
    /*
    Exercício
    Tente usar um operador ternário para verificar se um número é múltiplo de 3.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int number = sc.nextInt();

        System.out.println((number % 3 == 0) ? "Múltiplo de 3" : "Não é múltiplo de 3");
    }
}
