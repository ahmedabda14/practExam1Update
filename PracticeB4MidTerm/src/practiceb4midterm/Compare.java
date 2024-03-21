/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ahmed
 */
class Student implements Comparable <Student>{
int id;
String name;
double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", score=" + score + '}';
    }
    
}
class scoreComparator implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
if(o1.getScore()==o2.getScore())
    return 0;
else if (o1.getScore()>o2.getScore())
        return 1;
else
    return -1;
    }
    
}
public class Compare {
              public static void main(String[] args) {
    ArrayList <Student> st = new ArrayList<>();
    st.add(new Student(2270576,"medd",50));
        st.add(new Student(2270578,"medd",25));
    st.add(new Student(2270577,"medd",40));
Collections.sort(st,new scoreComparator());
for(Student l:st){
    System.out.println(l.toString());
}
              }
}
