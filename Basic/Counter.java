/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Scanner;
/**
 *
 * @author CCLAB
 */
public class Counter {
  
   static int count=0;
    Counter()
    {
        count++;
        System.out.println(count);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Counter c1=new Counter();
       Counter c2=new Counter();
       Counter c3=new Counter();
    }
    
}
