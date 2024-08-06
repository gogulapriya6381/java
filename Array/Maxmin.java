/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;
import java.util.Scanner;
public class Maxmin {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ënter no. of elements");
        int n=sc.nextInt();
        int a[]= new int[n];
        int max=0,min=0;
        for(int i=0;i<n;i++)
        {
           System.out.printf("Element of array:",i);
            a[i]=sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
    
}
