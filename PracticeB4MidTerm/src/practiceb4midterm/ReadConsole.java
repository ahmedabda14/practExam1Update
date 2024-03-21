/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author ahmed
 */
public class ReadConsole {
    public static void main(String[] args)throws IOException {
     InputStreamReader cin=null; 
     FileWriter n =null;
     try{
        cin = new InputStreamReader(System.in);
      n = new FileWriter("C:\\Users\\ahmed\\OneDrive\\Desktop\\t.txt");
    System.out.println("enter text to print in file (q to exit)");  
    char c;
        do{
             c = (char)cin.read();
            System.out.print(c);
                  n.write(c);

        }while(c!='q');
     
     }finally{
         if(cin!=null)
             cin.close();
         if(n!=null)
             n.close();
     }
                        }
}
