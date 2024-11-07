import java.util.Scanner;

public class StaircaseUtils {
    public static void staircase(int n) {
        int tmp = n - 1;
        while (tmp >= 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(i < tmp ? " " : "#");
            }
            System.out.println();
            tmp--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da escada: ");
        staircase(sc.nextInt());
        sc.close();
    }
}
