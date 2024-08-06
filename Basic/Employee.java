/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.Scanner;
/**
 *
 * @author CCLAB
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       String name=sc.nextLine();
       int id=sc.nextInt();
        long salary; 
        salary = sc.nextLong();
        int experience=sc.nextInt();
        if(experience>8)
        {
            long update =salary+10000;
            System.out.println(update);
        }
        else
        {
            System.out.println(salary);
        }
    }
    
}
