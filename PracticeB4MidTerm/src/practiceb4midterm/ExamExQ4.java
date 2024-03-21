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
public class ExamExQ4 {
   public static void main(String[] args) {
       ArrayList <Integer> el = new ArrayList<>();
       Random random = new Random();
       for(int i=0;i<10;i++){
        int rand = random.nextInt(100);
            el.add(rand);

       }
        for(int t : el){
           System.out.println(t);
       }
                   System.out.println();

       for(int j=0;j<el.size();j++){
                       if(el.get(j)%2!=0){
                el.remove(j);
                       j--;
                       }
       }
       for(int t : el){
           System.out.println(t);
       }
                        }
}
