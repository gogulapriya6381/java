/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;
import java.util.Scanner;

/**
 *
 * @author CCLAB
 */
public class Evenodd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int ecount=0;
     int ocount=0;
     for( int num = 0;num<=4;num++)
     {
          int n=sc.nextInt();
        if(n%2==0)
        {
          
           ecount++;
           
        }
        else
        {
         
            ocount++;
            
        }
     }
        
     System.out.println("Even numbers: " +ecount);
     System.out.println("odd numbers: " +ocount);
    }
}
     
    

