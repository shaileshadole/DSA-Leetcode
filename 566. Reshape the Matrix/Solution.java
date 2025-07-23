class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[] string = new int[r * c];
        int[][] ans = new int[r][c];
        int z = 0;

        // Filling the string
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                string[z] = mat[i][j];
                z++;
            }
        }

        z = 0;
        // Filling the Ans
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = string[z];
                z++;
            }
        }

        // Printing the answer
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;

        Solution s1 = new Solution();
        s1.matrixReshape(mat, r, c);
    }
}