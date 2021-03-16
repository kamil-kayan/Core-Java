/*Addition of two matrix*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Matrix {
    private final int r;
    private final int c;
    private final int[][] arr;

    //Initializing the rows and columns and the 2D array;
    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }


    public int[][] acceptMatrix() {
        Scanner sc = new Scanner(System.in);

        //String tokenizer to accept each row as a single string;
        StringTokenizer st;

        //Accepting the elements from the Keyboard;

        for (int i = 0; i < r; i++) {
            String s = sc.nextLine();
            st = new StringTokenizer(s);
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }

    //Accepting two 2D arrays and finding the sum of the Matrix;
    public int[][] addMatrices(int[][] a, int[][] b) {
        int[][] temp = new int[r][c];

        //adding the two Matrices;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }

    //Displaying the matrix;
    public void displayMatrix(int[][] res) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}

class MatrixSum{
    public static void main(String[] args) {
            //Creating two Objects of Matrix Class;
        Matrix one = new Matrix(4,4);
        Matrix two = new Matrix(4,4);


            //Accepting the respective Matrices;
        System.out.println("Elements of the First Matrix: ");
        int [][] _1 = one.acceptMatrix();
        System.out.println("Element of the Second Matrix: ");
        int [][] _2 =two.acceptMatrix();

            //Passing em to the Adding method;
        int [][] sum =one.addMatrices(_1,_2);
        System.out.println("The Sum of the Matrix is: ");
        one.displayMatrix(sum);


    }
}