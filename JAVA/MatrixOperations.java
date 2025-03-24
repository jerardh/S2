import java.util.Scanner;

class Matrix {
    int m;
    int n;
    int[][] matrix;

    // Empty Constructor for reading the input matrix
    Matrix() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter m:");
        m = s1.nextInt();
        System.out.println("Enter n:");
        n = s1.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element (" + i + "," + j + "):");
                matrix[i][j] = s1.nextInt();
            }
        }
    }

    // parameterized constructor for result matrix
    Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    // adding two matrices
    Matrix add(Matrix m2) {
        Matrix res = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return res;
    }

    // returns the transpose of matrix
    Matrix getTranspose() {
        Matrix res = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.matrix[i][j] = this.matrix[j][i];
            }
        }
        return res;
    }

    // returns product of 2 matrices, first matrix being the current object iteslf
    Matrix getProduct(Matrix m2) {
        Matrix res = new Matrix(this.m, m2.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < m2.n; j++) {
                int[] col = new int[m2.m];
                for (int k = 0; k < m2.m; k++) {
                    col[k] = m2.matrix[k][j];
                }
                res.matrix[i][j] = getElement(this.matrix[i], col, this.n);
            }
        }
        return res;
    }

    // helper method to calculate individual element for product
    int getElement(int[] a, int[] b, int len) {
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += (a[i] * b[i]);
        }
        return res;
    }

    // Displays the matrix
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
        Scanner s1 = new Scanner(System.in);
        Matrix m1, m2, m3;
        boolean flag = true;
        while (flag) {
            System.out.println("Matrix Operations\n1.Addition\n2.Multiplication\n3.Transpose\n4.Exit");
            System.out.println("Choose your option");
            int op = s1.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Matrix 1");
                    m1 = new Matrix();
                    System.out.println("Matrix 2");
                    m2 = new Matrix();
                    if (m1.m == m2.m && m1.n == m2.n) {
                        m3 = m1.add(m2);
                        System.out.println("Result");
                        m3.display();
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.println("Matrix 1");
                    m1 = new Matrix();
                    System.out.println("Matrix 2");
                    m2 = new Matrix();
                    if (m1.n == m2.m) {
                        m3 = m1.getProduct(m2);
                        System.out.println("Result");
                        m3.display();
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    System.out.println("Enter matrix");
                    m1 = new Matrix();
                    m3 = m1.getTranspose();
                    System.out.println("\nTranspose");
                    m3.display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("\nEnter a valid choice");
            }
        }
    }
}
