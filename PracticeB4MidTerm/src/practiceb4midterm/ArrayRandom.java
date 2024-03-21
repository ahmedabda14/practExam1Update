/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ahmed
 */
public class ArrayRandom {
                  public static void main(String[] args) {
ArrayList <Integer> arr = new ArrayList<>();
Random random = new Random();
for(int i=0;i<10;i++){
    int p = random.nextInt(100);
    if(p%2!=0){
        arr.add(p);
    }
}
for(int j:arr){
    System.out.println(j);
}
                  }
}
