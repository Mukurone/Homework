public class task13 {
    public static void arr(){
        int n = 9;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            array[i][i] = 1;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
