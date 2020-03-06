package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Hi, FJCU Kuo-Hua Wang!");
        System.out.println("I am a teacher. You are students!");
        System.out.println("Good Morning! Happy New Year!");

        List<String> list = new ArrayList<>();
        list.add("Boy"); list.add("Girl"); list.add("Old Man");
        for (String str: list) {
            System.out.println(str);
        }
        Integer[] IntArray = {1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, IntArray);
        for (Integer a : list1) {
            System.out.println(a);
        }
    }
}
