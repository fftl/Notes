class fun {
    // 90 rotate
    static int[][] rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] rotate = new int[m][n];

        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[i].length; j++) {
                rotate[i][j] = arr[n - 1 - j][i];
            }
        }

        return rotate;
    }
}