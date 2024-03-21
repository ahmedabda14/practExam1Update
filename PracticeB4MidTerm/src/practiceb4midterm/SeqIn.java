/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author ahmed
 */
public class SeqIn {
            public static void main(String[] args)throws IOException {

    FileOutputStream out = new FileOutputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\tt.txt");
        FileOutputStream out2 = new FileOutputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\t.txt");
    ByteArrayOutputStream boute = new ByteArrayOutputStream();
    
        FileInputStream  in = new FileInputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\ahmed.txt");
 FileInputStream in2 = new FileInputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\2.txt");
SequenceInputStream seq = new SequenceInputStream(in,in2);
int i;
while((i=seq.read())!=-1){
    out.write(i);
}
String s = "ByteArraySucccesss";
byte[]b=s.getBytes();
boute.write(b);
boute.writeTo(out);
boute.writeTo(out2);
seq.close();
in.close();
in2.close();
System.out.print("success");
}
}
