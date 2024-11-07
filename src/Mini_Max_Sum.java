import java.util.List;

public class Mini_Max_Sum {

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Calcule a soma total e, ao mesmo tempo, encontre o mínimo e o máximo
        for (int i : arr) {
            totalSum += i;
            if (i > max) max = i;
            if (i < min) min = i;
        }

        // A soma mínima é a soma total menos o maior elemento
        // A soma máxima é a soma total menos o menor elemento
        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.printf("%d %d", minSum, maxSum);
    }

    public static void main(String[] args) {
        
    }
}
