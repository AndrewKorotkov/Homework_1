public class Task_1 {
    public static void main(String[] args) {

        int[] array = {3, 5, 7, 12, 8, 9, -5};
        int n = 8;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n)
                sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
