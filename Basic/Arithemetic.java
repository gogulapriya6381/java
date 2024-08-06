/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

/**
 *
 * @author CCLAB
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int num=sc.nextInt();
        int num1=sc.nextInt();
        switch(number)
        {
            
            case 1:
        System.out.println(num+num1);
        break;
            case 2:
        System.out.println(num-num1);
        break;
            case 3:
        System.out.println(num*num1);
        break;
            case 4:
        System.out.println(num/num1);
        break;
            case 5:
        System.out.println(num%num1);
        break;
            default:
                System.out.println("Invalid number. please enter valid number");
        }
    }
    
}
