/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author t0ni
 */
public class Counter {
    private int numOfLines ;
    private int numOfWords ;
    private int numOfCharacters ;

    public Counter() {
        this.numOfLines = 0;
        this.numOfWords = 0;
        this.numOfCharacters = 0;
    }

    public int getNumOfLines() {
        return numOfLines;
    }

    public int getNumOfWords() {
        return numOfWords;
    }

    public int getNumOfCharacters() {
        return numOfCharacters;
    }
    
    
    
    public void count (File f ){
        try {
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                String line = reader.next();
                ///count lines ///
                numOfLines ++ ;
                try {
                    ///loop throught every line ///
                    Scanner words = new Scanner(line);
                    ///lopp throught every word in line //
                    while (words.hasNext()) {
                        String word = words.next();
                    /// count char of each word ///
                        for (int i = 0; i < word.length(); i++) {
                            numOfCharacters++ ;
                        }
                     ///count words of every line ///
                        numOfWords++;
                        
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
    
    @Override
    public String toString(){
        return "*************************** \n"
                + "number of lines : " + (getNumOfLines()-1) + "\n" /// bcz it count the initial line ///
                + "number of words : " + getNumOfWords()+ "\n"
                + "number of characters : " + getNumOfCharacters()+ "\n"
                +"***************************";
                
    }
}
