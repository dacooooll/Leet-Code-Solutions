class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for (int i = 0; i < n; i++) {
            int[] doubled = new int[2 * n];
            System.arraycopy(grid[i], 0, doubled, 0, n);
            System.arraycopy(grid[i], 0, doubled, n, n);
            
            int shift = rowShift[i] % n;
            System.arraycopy(doubled, shift, grid[i], 0, n);
        }
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }   
            int[] doubledCol = new int[2 * n];
            System.arraycopy(col, 0, doubledCol, 0, n);
            System.arraycopy(col, 0, doubledCol, n, n);
            int shift = colShift[j] % n;
            int[] shiftedCol = new int[n];
            System.arraycopy(doubledCol, shift, shiftedCol, 0, n);
            for (int i = 0; i < n; i++) {
                grid[i][j] = shiftedCol[i];
            }
        }
        return grid;
    }
}
