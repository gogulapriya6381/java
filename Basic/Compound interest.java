/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compund;
import java.util.*;
/**
 *
 * @author CCLAB
 */
public class Compond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        int n=sc.nextInt();
       double ci=(p(1+(r/100))*n)-p;
     // double ci=res-p;
        System.out.println(ci);
        
    }

    

   
