/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark;
import java.util.Scanner;
/**
 *
 * @author CCLAB
 */
public class Mark {
    static class Student{
        String name;
        int m1,m2,m3,m4,m5;
        Student(String name,int m1,int m2,int m3,int m4,int m5){
            this.name=name;
            this.m1=m1;
            this.m2=m2;
             this.m3=m3;
              this.m4=m4;
               this.m5=m5;
        }
        void display()
        {
            int totalmark=m1+m2+m3+m4+m5;
            int average=totalmark/5;
            System.out.println("Total mark: "+totalmark);
            System.out.println("Average: "+average);
            if(average>=90)
            {
                System.out.println("A Grade");
            }
            else if(average>=80 && average<90)
            {
                System.out.println("B Grade");
            }
            else if(average>=70 && average<80)
            {
                System.out.println("C Grade");
            }
            else if(average>=60 && average<70)
            {
                System.out.println("D Grade");
            }
            else
            {
                System.out.println("Fail");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int m1=sc.nextInt();
         int m2=sc.nextInt();
          int m3=sc.nextInt();
           int m4=sc.nextInt();
            int m5=sc.nextInt();
            Student stud=new Student(name,m1,m2,m3,m4,m5);
            stud.display();
        
    }
    
}
