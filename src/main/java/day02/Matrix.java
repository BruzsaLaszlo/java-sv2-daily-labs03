package day02;

public class Matrix {

    public boolean isZeroAllUnderDiagonal(int[][] matrix) {

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        int[][] m5True = {
                {1, 2, 3, 4, 5},
                {0, 2, 3, 4, 5},
                {0, 0, 3, 4, 5},
                {0, 0, 0, 4, 5},
                {0, 0, 0, 0, 5},
        };

        int[][] m4True = {
                {1, 2, 3, 4},
                {0, 2, 3, 4},
                {0, 0, 3, 4},
                {0, 0, 0, 4},
        };

        System.out.println(matrix.isZeroAllUnderDiagonal(m5True));
        System.out.println(matrix.isZeroAllUnderDiagonal(m4True));

        int[][] m5False = {
                {1, 2, 3, 4, 5},
                {0, 2, 3, 4, 5},
                {0, 0, 3, 4, 5},
                {0, 0, 0, 4, 5},
                {0, 0, 0, 4, 5},
        };

        int[][] m4False = {
                {1, 2, 3, 4},
                {0, 2, 3, 4},
                {0, 0, 3, 4},
                {0, 0, 3, 4},
        };

        System.out.println(matrix.isZeroAllUnderDiagonal(m5False));
        System.out.println(matrix.isZeroAllUnderDiagonal(m4False));

    }

}
