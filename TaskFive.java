public class TaskFive {
    public static void main(String[] args) {
        int rows, cols;
        int array[][] = {{5, 2, 6}, {9, 6, 4}, {4, 15, 3}};
        rows = array.length;
        cols = array[0].length;

        if (rows != cols) {
            System.out.println("Matrix should be a square matrix");
        } else {
            System.out.println("Lower triangular matrix: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j > i)
                        System.out.print("0 ");
                    else
                        System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}