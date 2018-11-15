/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author t0ni
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(5, "aaa", "comp");
        Student s2 = new Student(2, "kaa", "comp");
        Student s3 = new Student(1, "bak", "comp");
        Student[] arrStudents = {s3,s2,s1} ;
        String [] arrStrings = {"zoro" ,"mahmoud","toni","ahmed","lolo","essam", "abdo","abanob"} ;
        int [] arrInt = {5,2,6,8,1,56,2,9,};
        
     ////////////section of student objects ///////////////
     
        System.out.println("******************************************");
        System.out.println("arrayOfStu before sorting");
        for (Student arr1 : arrStudents){
            System.out.println(arr1.getId() + " : " + arr1.getName() + " : " + arr1.getDep());
        }
        System.out.println("######");
        System.out.println("arrayOfStu after sorting");
        SimpleSort.sortStudent(arrStudents);
        System.out.println("******************************************");
        
        
     //////////section of strings /////////////////////////
        System.out.println("arrayOfStrings before sorting");
        System.out.println(Arrays.toString(arrStrings));
        System.out.println("######");
        System.out.println("arrayOfStrings after sorting");
        SimpleSort.sortStrings(arrStrings);
        System.out.println(Arrays.toString(arrStrings));
        System.out.println("******************************************");
        
     //////////section of int /////////////////////////
       System.out.println("arrayOfInt before sorting");
        System.out.println(Arrays.toString(arrInt));
        System.out.println("######");
        System.out.println("arrayOfInt after sorting");
        SimpleSort.sortInt(arrInt);
        System.out.println(Arrays.toString(arrInt));
        System.out.println("******************************************");
    }
    
}
