public class MaxValueInMatrix {

    // Ma Trận Cực Đại
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxValue = findMaxValue(matrix);
        System.out.println("Giá trị lớn nhất trong ma trận là: " + maxValue);

        System.out.println("Các chỉ số của ô có giá trị lớn nhất là:");
        printMaxValueIndices(matrix, maxValue);
    }

    public static int findMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }

        return maxValue;
    }

    public static void printMaxValueIndices(int[][] matrix, int maxValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == maxValue) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }



    //kiểm tra ma trận đối xứng
    public static boolean isSymmetricMatrix(int[][] matrix) {

        for (int i = 0; i <  matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


}
