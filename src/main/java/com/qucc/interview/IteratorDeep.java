package com.qucc.interview;

import com.qucc.pojo.Student;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDeep {

    private static void failFast(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("A", (short) 23));
        list.add(new Student("B", (short) 23));
        list.add(new Student("C", (short) 23));
        list.add(new Student("D", (short) 23));
        list.add(new Student("E", (short) 23));
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println(list);
    }

    private static void failSafe(){
        CopyOnWriteArrayList<Student> list = new CopyOnWriteArrayList<>();
        list.add(new Student("A", (short) 23));
        list.add(new Student("B", (short) 23));
        list.add(new Student("C", (short) 23));
        list.add(new Student("D", (short) 23));
        list.add(new Student("E", (short) 23));
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        //failFast();
        failSafe();
        Vector<Student> vs = new Vector<>();
    }
}
