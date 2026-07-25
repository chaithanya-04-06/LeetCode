class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int col = 0;

            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < matrix[i][col])
                    col = j;
            }

            int k;
            for (k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > matrix[i][col])
                    break;
            }

            if (k == matrix.length)
                list.add(matrix[i][col]);
        }

        return list;
    }
}