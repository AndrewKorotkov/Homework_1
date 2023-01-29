public class Task_3 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();

        int n = array.length;
        int reverse;

        for (int i = 0; i < n/2; i++) {
            reverse = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = reverse;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
}