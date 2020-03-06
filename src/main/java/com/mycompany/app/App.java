package com.mycompany.app;

import java.util.ArrayList;
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

        List<String> list = new ArrayList<String>();
        list.add("Boy"); list.add("Girl"); list.add("Old Man");
        for (String str: list) {
            System.out.println(str);
        }
        Integer IntArray[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (Integer i : IntArray) {
            list1.add(i);
        }
        for (Integer a : list1) {
            System.out.println(a);
        }

        for (int i = 0; i < 10; ++i)
            System.out.print(i + " ");
        System.out.println();
    }
}
