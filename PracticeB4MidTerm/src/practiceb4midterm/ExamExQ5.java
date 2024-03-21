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
public class ExamExQ5 {
       public static void main(String[] args) {
  ArrayList <Integer>el= new ArrayList<>();
  Random random = new Random();
  for(int i=0;i<10;i++){
  el.add(random.nextInt(3));
  System.out.println(el.get(i));
  }
  int target =2;
  for(int j=0;j<el.size();j++){
      if(el.get(j)==target){
          System.out.print(target+" is found at: "+j+" ");
      }
  }
       }
}
