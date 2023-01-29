public class TaskFour {
    public static void main(String args[]) {

        int[][] array = {{-1, -3, 5}, {7, -9, 11}, {-13, 0, -17}};
        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > 0) {
                    sumPositive++;
                }
                if (array[i][j] < 0) {
                    sumNegative++;
                }
            }
        }
        if (sumPositive < sumNegative) {
            System.out.println("More negative numbers");
        }
        if (sumPositive > sumNegative) {
            System.out.println("More positive numbers");
        }
        if (sumPositive == sumNegative) {
            System.out.println("Equal number of positive and negative numbers");
        }
    }
}