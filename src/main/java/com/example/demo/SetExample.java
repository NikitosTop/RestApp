package com.example.demo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

    public void testSet(){
        SortedSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(4);
        set.add(13);
        set.headSet(10);
        set.forEach(System.out::println);

    }

}
