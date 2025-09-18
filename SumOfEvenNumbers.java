import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: upper limit
        int n = sc.nextInt();
        int sum = 0;

        // Add even numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        // Output
        System.out.println(sum);

        sc.close();
    }
}
