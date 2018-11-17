/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;

/**
 *
 * @author t0ni
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File ("text.txt");
        Counter c = new Counter();
        c.count(f);
        System.out.print(c.toString());
    }
    
}
