public class TaskSixMatrixAddition {
    public static void main(String args[]){
        int a[][] = {{1,3,5},{7,9,11},{13,15,17}};
        int b[][] = {{2,4,6},{8,10,12},{14,16,18}};

        int c[][] = new int[3][3];

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
