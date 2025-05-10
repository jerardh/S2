import java.util.Scanner;

class Matrix {
    int m;
    int matrix[][];

    Matrix() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        m = obj.nextInt();
        matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element " +i+","+j+":");
                matrix[i][j] = obj.nextInt();
            }

        }
    }

    void display() {
        System.out.println("Matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    boolean isSymmetric() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

}

class MatrixSymmetric {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        m1.display();
        if (m1.isSymmetric()) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrx is not symmetric");
        }
    }
}