/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcharray;
import java.util.Scanner;
public class Searcharray {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ënter no. of elements");
        int n=sc.nextInt();
        int a[]= new int[n];
       // boolean present=false;
        for(int i=0;i<n;i++)
        {
           System.out.printf("Element of array:",i);
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search number:");
        int search=sc.nextInt();
        boolean present =false;
         for(int i=0;i<n;i++)
         {
             if(search==a[i])
             {
                present=true;
               //  present=true;
                 //break;
           //  }
            // if(present)
            // {
                  System.out.println("the given value is present in the array");
                 
             }
            
             
         }
         if(present==false)
         {
             System.out.println("the given value is not present in the array");
         }
    }
    
}
