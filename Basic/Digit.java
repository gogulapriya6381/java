/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digit;
import java.util.Scanner;

public class Digit {
     public static int sum(int n) {
    int sum=0;
    while(n>0)
    {
       sum+=n%10;
        n=n/10;
    }
return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    
}
