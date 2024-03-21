/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.util.Random;

/**
 *
 * @author ahmed
 */
public class ExamExQ6 {
           public static void main(String[] args) {
               int arr[][]= {{1,2,1},{2,2,3},{4,5,3}};
               findRepeatedNumbers(arr);
          
           
           
           }
           private static void findRepeatedNumbers(int[][] matrix) {
        int[] counts = new int[1000]; // assuming numbers in the matrix are between 1 and 1000

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                counts[num]++;
            }
        }

        System.out.println("The repeated numbers are:");
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 1) {
                System.out.printf("%d ( %d times )%n", i, counts[i]);
            }
        }
           
           }
}

           
           
           

