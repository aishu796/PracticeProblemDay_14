package com.hashtableexample.java;
import java.security.Key;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class StudentMain
{

        public static void main(String[] args) {
            Map<Integer,Student> h=new Hashtable<>();
            Student s1=new Student(1,"Jagdish","Mumbai","Chandra@123");
            Student s2=new Student(2,"Bharat","Thane","b@123");
            Student s3=new Student(3,"xyz","Worli","xyz@123");
            h.put(s1.getId(),s1);
            h.put(s2.getId(),s2);
            h.put(s3.getId(),s3);
            for(Map.Entry<Integer,Student> val:h.entrySet()){
                int stdid=val.getKey();
                Student st=val.getValue();
                System.out.println("Student id "+stdid+" "+"student name "+st.getName()+" "+"Student address "+st.getAddress()+" Email "+st.getEmail());
            }
        }
    }

