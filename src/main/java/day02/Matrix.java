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

        int[][] mTrue = {
                {1, 2, 3, 4, 5},
                {0, 2, 3, 4, 5},
                {0, 0, 3, 4, 5},
                {0, 0, 0, 4, 5},
                {0, 0, 0, 0, 5},
        };

        System.out.println(matrix.isZeroAllUnderDiagonal(mTrue));

        int[][] mFalse = {
                {1, 2, 3, 4, 5},
                {0, 2, 3, 4, 5},
                {0, 0, 3, 4, 5},
                {0, 0, 0, 4, 5},
                {0, 0, 0, 4, 5},
        };

        System.out.println(matrix.isZeroAllUnderDiagonal(mFalse));

    }

}
