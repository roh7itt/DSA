package PW;

import java.util.Scanner;

import static PW.Transpose.printMatrix;

public class GenerateSpiral {
    static int[][] generateSpiralMatrix(int n){
        int [][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int curr = 1;
        while(curr <= n*n){
            //top row -> leftCol to RightCol
            for(int j = leftCol; j<= rightCol && curr <= n*n; j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;
            for(int i = topRow; i <= bottomRow && curr <= n*n; i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;
            for(int j = rightCol; j>= leftCol && curr <= n*n; j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;
            for(int i = bottomRow; i>= topRow && curr <= n*n; i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;
        }


        return matrix;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int [][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
