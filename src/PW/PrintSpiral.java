package PW;

import java.util.Scanner;

import static PW.RotateMatrix.printMatrix;

public class PrintSpiral {
        static void printSpiralOrder(int[][] matrix, int r, int c){
            int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
            int totalElements = 0;
            while(totalElements < r*c){
                for(int j = leftCol; j<= rightCol && totalElements < r*c; j++){
                    System.out.print(matrix[topRow][j] + " ");
                    totalElements++;
                }
                topRow++;
                for(int i = topRow; i <= bottomRow && totalElements < r*c; i++){
                    System.out.print(matrix[i][rightCol] + " ");
                    totalElements++;
                }
                rightCol--;
                for(int j = rightCol; j>= leftCol && totalElements < r*c; j--){
                    System.out.print(matrix[bottomRow][j] + " ");
                    totalElements++;
                }
                bottomRow--;
                for(int i = bottomRow; i>= topRow && totalElements < r*c; i--){
                    System.out.print(matrix[i][leftCol] + " ");
                    totalElements++;
                }
                leftCol++;
            }

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of  r and c");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int [r][c];
            int total = r*c;
            System.out.println("enter" + total + " Values");
            for(int i = 0; i<r; i++){
                for(int j =0; j<c; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Input Matrix");
            printMatrix(matrix);

            System.out.println("Spiral order");
            printSpiralOrder(matrix, r, c);

        }
    }
