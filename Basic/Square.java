/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;
import java.util.Scanner;
public class Square {
    public static int squ(int n){
        int a=n*n;    
           return a;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
System.out.println(squ(n));

    }
}

    

