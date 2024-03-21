/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ahmed
 */
public class directory {
        public static void main(String[] args)throws IOException {
            File file=null;
            String[] paths;
        try{
            file = new File("C:\\Users\\ahmed\\OneDrive\\Desktop\\mo");
         paths=file.list();
        for(String path:paths) 
            System.out.println(path);
        }catch(Exception e)  {System.out.print(e);}  
        }
}
