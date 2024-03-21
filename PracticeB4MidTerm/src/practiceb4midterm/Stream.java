package practiceb4midterm;


import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmed
 */
public class Stream {
    public static void main(String[] args)throws IOException {
     FileInputStream in = null;
    FileOutputStream out=null;
    try{
       in= new FileInputStream("sds"); 
       out= new FileOutputStream("ds");
       int i;
       while( (i=in.read())!=-1){
           if((char)i!='A'){
        out.write(i);
           }
       }
    }catch(IOException e){System.out.println(e);}
    finally{
        if(in!=null)
            in.close();
           if(out!=null)
                out.close();
    }
            
    }    
}
