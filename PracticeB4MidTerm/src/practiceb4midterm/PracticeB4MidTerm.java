/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceb4midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ahmed
 */
 class book implements Comparable<book>{
int publication;
String name;
int units;

    public book(int publication, String name, int units) {
        this.publication = publication;
        this.name = name;
        this.units = units;
    }

    public int getPublication() {
        return publication;
    }

    public String getName() {
        return name;
    }

    public int getUnits() {
        return units;
    }

    @Override
    public int compareTo(book o) {
        return this.name.compareToIgnoreCase(o.getName());
    }
    
}
 class compareUnits implements Comparator<book>{

    @Override
    public int compare(book o1, book o2) {
        return Integer.compare(o1.getUnits(), o2.getUnits());

    }
    
}
public class PracticeB4MidTerm {

    public static void main(String[] args) {
        ArrayList <book> books = new ArrayList<>();
books.add(new book(1992,"Mahmoud Darwish",200));
    books.add(new book(2014,"Derome",100));
        books.add(new book(2014,"Wilfrid",10));
Collections.sort(books);
Collections.sort(books, new compareUnits());
for(book l:books){
    System.out.print(l.getName());
    System.out.print("\n"+l.getUnits());
}
    }
    
}
