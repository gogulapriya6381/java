/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neon;
import java.util.Scanner;
public class Neon {
    public static boolean isNeon(int n){
    
    int a=n*n;
    int m=0;
    //int p=0;
    while(a>0)
    {
        m+=a%10;
        a=a/10;
    }
     return m==n;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          System.out.println(isNeon(n));
        
    }
    
}
