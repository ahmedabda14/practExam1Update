/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.util.*;

/**
 *
 * @author ahmed
 */
public class ExamExQ1 {
            public static void main(String[] args) {
ArrayList <Integer> el = new ArrayList<>();
Random random = new Random();
for(int t=0;t<10;t++){
    int l = random.nextInt(100);
el.add(l);
            }
for(int i:el){
    System.out.print(i+" ");
}
System.out.println("enter number to be replaced");
Scanner kb = new Scanner(System.in);
int o= kb.nextInt();
for(int p =1;p<el.size();p+=2){
    el.set(p, o);
}
for(int i:el){
    System.out.print(i+" ");
}
            
            }
}
