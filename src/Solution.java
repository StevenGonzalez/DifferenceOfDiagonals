/*
 * Author: Steven Gonzalez
 * Last modified: 11/05/16
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {        
        // Variables
        Scanner in = new Scanner(System.in);
        int size;

        
        // Get size of matrix
        System.out.print("Please enter the size of the matrix");
        size = in.nextInt();
        
        // Initialize matrix
        int[][] matrix =  new int[size][size];
        
        // Add numbers to matrix
        System.out.print("Please enter the numbers for the matrix pressing enter for each new row.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        // Calculate the difference of the sum of the diagonals
        System.out.print(DifferenceOfDiagonals (matrix, size));
        
        // Close scanner
        in.close();
    }
    
    static int DifferenceOfDiagonals (int[][] matrix, int size) {
        int sum1 = 0;    	// Sum of the diagonal 1 
        int sum2 = 0;    	// Sum of the diagonal 2
        
        // Add first diagonal from left
        for (int i = 0; i < size; i++) {
        	sum1 += matrix[i][i];
        }
        
        // Add second diagonal from right
        int index = size - 1;
        for (int i = 0; i < size; i++) {
    			sum2 += matrix[i][index];
    			index--;
        }
        
        // Return the difference
        if(sum1 > sum2) {
        	return (sum1 - sum2);
        }
        else {
        	return (sum2 - sum1);
        }
    }
}