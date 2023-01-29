public class TaskTwo {
    public static void main(String[] args) {

        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = 7;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}

