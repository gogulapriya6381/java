/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;


/**
 *
 * @author CCLAB
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        int t=sc.nextInt();
       double si=(p*r*t)/100;
        System.out.println(si);
        double amount=si+p;
        System.out.println(amount);
    }
    
}
