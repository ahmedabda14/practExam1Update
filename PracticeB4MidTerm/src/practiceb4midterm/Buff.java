/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.io.FileOutputStream;
import java.io.*;
import java.io.BufferedReader; 

/**
 *
 * @author ahmed
 */
public class Buff {
        public static void main(String[] args)throws Exception {
                 FileOutputStream out =null;
         FileInputStream in = null;
     
         out = new FileOutputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\ahmed.txt");
                BufferedOutputStream bout = new BufferedOutputStream(out);
        String s = "First Line\nsecond line\nthird line";
        byte b[]= s.getBytes();
        bout.write(b,0,b.length);
        bout.close();
 in = new FileInputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\ahmed.txt");
BufferedInputStream bin = new BufferedInputStream(in);
int i;
System.out.println("Bytes availabale: "+bin.available());


    bin.mark(bin.available());
bin.skip(3); //skips first 3 bytes

System.out.println("File contents: ");

while((i=bin.read())!=-1)  
    System.out.print((char)i);
System.out.println();
bin.reset(); //default
while((i=bin.read())!=-1)
    System.out.print((char)i);
bout.flush();
bin.close();
     }
        }            

