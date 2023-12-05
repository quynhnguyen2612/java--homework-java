import java.util.Scanner;


//Viết một chương trình java để tạo một mảng số nguyên chứa n số Fibonacci đầu tiên (n là một số nguyên được người dùng nhập vào). In ra mảng này.
public class FibonacciArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số Fibonacci cần tạo: ");
        int n = scanner.nextInt();

        int[] fibonacciArray = generateFibonacciArray(n);

        System.out.println("Mảng chứa " + n + " số Fibonacci đầu tiên:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }

    public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        if (n >= 1) {
            fibonacciArray[0] = 0;
        }
        if (n >= 2) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }
}
