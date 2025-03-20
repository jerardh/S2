import java.util.Scanner;

class Matrix {
    int m;
    int n;
    int[][] matrix;

    Matrix(int m, int n) {
        matrix = new int[m][n];
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element (" + i + "," + j + "):");
                matrix[i][j] = s1.nextInt();
            }
        }
    }
    Matrix(int m, int n,boolean flag) {
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] =0;
            }
        }
    }

    int getM() {
        return m;
    }

    int getN() {
        return n;
    }

    Matrix add(Matrix m2) {
        Matrix res = new Matrix(m, n,true);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return res;
    }

    Matrix getTranspose() {
        Matrix res = new Matrix(n, m,true);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.matrix[i][j] = this.matrix[j][i];
            }
        }
        return res;
    }

    Matrix getProduct(Matrix m2) {
        Matrix res = new Matrix(m, m2.getN(),true);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m2.getN(); j++) {
                int temp = 0;
                int col = 0;
                while (col < this.getN()) {
                    temp += this.matrix[i][col] + m2.matrix[col][j];
                    col++;
                }
                res.matrix[i][j] = 1;
            }
        }
        return res;
    }

    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);
        Matrix m3 = m1.getProduct(m2);
        m3.display();
    }
}
