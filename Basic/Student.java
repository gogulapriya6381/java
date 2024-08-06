/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author CCLAB
 */
public class Student {

    private String name;
    private int age;
   
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    
      public String getname() {
        return name;
    }
     public int getage(){
        return age;
    }
      public void setname(String name) {
        this.name=name;
      }
      public void setage(int age) {
        this.age=age;
      }
    public void display()
    {
        if(age>17)
       {
           System.out.println(name+" is eligible for voting");
       }
       else
       {
           System.out.println("Sorry."+name+" is not eligible for voting");
       }
    }

    private static class stud extends Student {

        public stud(String ram, int 25) {
        }
    }

    /**
     *
     */
    public class Student{
    public static void main(String[] args) {
   Student stud=new stud("ram",25);
   stud.display();
    }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
}
}
