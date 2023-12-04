import java.util.Scanner;

public class Main {

    //tìm phần tử lớn nhất trong mảng
    public static void FindLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }

    //Xác định xem một mảng có phải là một dãy số tăng dần không.

    public static void CheckIncreasingSequence(int[] arr) {

            boolean check= true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println("Mảng là một dãy số tăng dần.");
            } else {
                System.out.println("Mảng không phải là một dãy số tăng dần.");
            }
    }



        //Đảo ngược thứ tự các phần tử trong mảng mà không sử dụng mảng phụ.
    public static void ReverseArray(int[] arr) {
        System.out.println("Mảng ban đầu:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }


    //tính tổng các số nguyên tố
    public static void SumOfPrimeNumbers(int num) {
        int n = 100; // khoảng từ 1 đến n
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố từ 1 đến " + n + " là: " + sum);

    }




    // In ra một tam giác vuông sử dụng ký tự '*' với chiều cao được người dùng nhập vào.
    public static void PrintTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //tìm UCLN và BCNN

    public static void findBCNN(int num1, int num2) {
        int ucln = findUCLN(num1, num2);
        int bcnn = (num1 * num2) / ucln;
    }



    public static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //đảo ngược chuỗi
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    //Tính tổng của các chữ số trong một số nguyên.
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            number /= 10; // Loại bỏ chữ số cuối cùng
        }
        return sum;
    }


    //Viết chương trình để sắp xếp một mảng số nguyên theo thứ tự tăng dần.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi giá trị của arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //Tìm phần tử lớn thứ k trong một mảng.
    public static int findKthDistinctLargest(int[] arr, int k) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int distinctCount = 1;
        int prev = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != prev) {
                distinctCount++;
                if (distinctCount == k) {
                    return arr[i];
                }
            }
            prev = arr[i];
        }
        return -1; // Trả về -1 nếu không tìm thấy phần tử lớn thứ k
    }

    //Viết hàm để tìm tất cả các số nguyên tố trong một mảng và in chúng ra.
    public static void findAndPrintPrimeNumbers(int[] arr) {
        System.out.print("Các số nguyên tố trong mảng: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    //kiểm tra 1 số có phải là số nguyên tố không
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
