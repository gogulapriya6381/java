/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.util.Scanner;

/**
 *
 * @author CCLAB
 */
public class Students {

    
    int rollno;
    String name;
static String college="MCET";
 void change()
{
     college="NPT";
}
Students(int r,String n){
rollno=r;
name=n;
}
Students (String n,int l)
{
    rollno=l;
    name=n;
}
 void display()
{
    System.out.println(rollno+" "+name+" "+college);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Scanner sc=new Scanner(System.in);
     Students.change();
     Students stud1=new Students(545,"xxx");
     Students stud2=new Students(123,"yyy");
     stud1.display();
     stud2.display();
    
     
     
    }
    
    
}
