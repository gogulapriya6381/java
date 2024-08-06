/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysum;
import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        int n;
        float avg;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements" );
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the all elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum: "+sum);
      avg=(float)sum/n;
        System.out.println("Average:"+avg);
        
    }
    
}
