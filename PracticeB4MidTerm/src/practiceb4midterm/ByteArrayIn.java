/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ahmed
 */
public class ByteArrayIn {
                public static void main(String[] args)throws IOException {
                    byte[]buf={31,32,33,34,35,36};
                    ByteArrayInputStream byt = new ByteArrayInputStream(buf);
                    int i;
        while((i=byt.read())!=-1){
            System.out.println(i+": "+(char)i);
        }
        FileOutputStream out = new FileOutputStream("ds");
        DataOutputStream data = new DataOutputStream(out);
        String s = "Data compl";
        byte[]b=s.getBytes();
        data.write(b);
        data.flush();
        data.close();
        System.out.println("s");
FileInputStream in = new FileInputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\tt.txt");
        DataInputStream d = new DataInputStream(in);
    int count = d.available();
     byte[] bi = new byte[count];
      d.read(bi);
    for(byte bii:bi){
        System.out.println(bii+":  "+(char)bii);
    }
                }
}
