/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author t0ni
 */
public class SimpleSort {
    
    public static void sortStudent (Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            int movrCursor = i ;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(arr[movrCursor].getName().compareTo(arr[j].getName()) > 0 ){
                    movrCursor = j ; 
                }
                //////initalize temp  , swap arr[j] to temp///
                Student temp  = new Student();
                temp.setId(arr[movrCursor].getId());
                temp.setName(arr[movrCursor].getName());
                temp.setDep(arr[movrCursor].getDep());
                //swap arr[i] to arr [j] ////
                arr[movrCursor].setId(arr[i].getId());
                arr[movrCursor].setName(arr[i].getName());
                arr[movrCursor].setDep(arr[i].getDep());
                //swap temp to arr [j] ////
                arr[i].setId(temp.getId());
                arr[i].setName(temp.getName());
                arr[i].setDep(temp.getDep());
            }
            
        }
        for (Student arr1 : arr) {
            System.out.println(arr1.getId() + " : " + arr1.getName() + " : " + arr1.getDep());
        }
    }
    public static void sortStrings (String [] arr){
        for (int i = 0; i < arr.length; i++) {
            int movrCursor = i ;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[movrCursor].compareTo(arr[j]) > 0 ){
                    movrCursor = j ;
                }
                String temp ;
                temp = arr[movrCursor];
                arr[movrCursor] = arr[i];
                arr[i] = temp ;
            }
            
        }
    }
    public static void sortInt (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp ;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } 
        }
    }
}
