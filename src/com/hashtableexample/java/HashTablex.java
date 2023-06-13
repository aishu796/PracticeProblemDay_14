package com.hashtableexample.java;

import java.util.Hashtable;
import java.util.Map;

public class HashTablex
{
    public static void main(String[] args) {
            Hashtable<Integer,String> hashtable = new Hashtable<>();
            hashtable.put(1,"Goutham");
            hashtable.put(2,"XYZ");
            hashtable.put(3,"Raju");
            hashtable.put(4,"");
            hashtable.put(3,"Allen");
            hashtable.put(3,"Raju");

            hashtable.put(5,"Gani");

            boolean presentKey = hashtable.contains("Goutham");
            System.out.println("The value is "+presentKey);

            for (Map.Entry val :hashtable.entrySet()){
                System.out.println(val.getValue() +" "+ val.getKey());
// System.out.println(val.getKey());
            }
            System.out.println("Remove value is"+hashtable.remove("XYZ"));

        }

    }



