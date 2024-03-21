/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ahmed
 */
class Employee implements Comparable<Employee>{
    String fname;
    String lname;
    int age;

    public Employee(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Employee{" + "fname=" + fname + ", lname=" + lname + ", age=" + age + '}';
    }
    
  
}
public class ExamExQ7Classes {
                   public static void main(String[] args) {
   ArrayList <Employee>ees= new ArrayList<>();
   ees.add(new Employee("medd","abd",19));   
   ees.add(new Employee("pete","poro",22));
   ees.add(new Employee("amadou","manga",32));
   ees.add(new Employee("pop","lil",90));
   ees.add(new Employee("jeff","geezer",80));
   ees.add(new Employee("sakho","wakanda",34));
   ees.add(new Employee("nano","momo",17));
int count=0;
   for(Employee p:ees){
       if(p.getAge()>30&&p.getAge()<40){
           System.out.println(p.getLname());
       }
       else if(p.getAge()>40){
           count++;
       }   
   }
   System.out.println("Employees older than 40: "+count);
   Collections.sort(ees);
   int max=0;
   int min=1000;
  for(Employee p:ees){
      if(p.getAge()>max){
          max = p.getAge();
      }
 if(p.getAge()<min){
          min = p.getAge();
      }  }
     System.out.println(" max: "+max+" Min: "+min);

                   }
    
}
