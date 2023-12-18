package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student s=new Student("tom",101,91);
        Student s1=new Student("john",102,97);
        Student s2=new Student("harsh",103,77);
        Student s3=new Student("hem",104,90);
        Student s4=new Student("alex",105,78);
        Student s5=new Student("xyz",106,89);
        //create HashSet object and add all the students object inside it
        Set<Student> set=new HashSet<Student>();
        set.add(s);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        //return the HashSet object
        return set;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String>  tree=new TreeSet<String>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator=studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while (iterator.hasNext()){
            Student std=iterator.next();
            tree.add(std.getName());
        }
      //return the TreeSet object;
        return tree;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator=studentSet.iterator();
        //retrieve the Student object from the iterator
        //Use getter method to get TotalMarks of each student. calculate the average
        //add the student name and average marks in the HashMap object created in the
        while (iterator.hasNext()){
            Student std=iterator.next();
            int avg= std.getTotalMarks()/ studentSet.size();
            hashMap.put(std.getName(),avg);
        }
        //first line and return the map

           return hashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
