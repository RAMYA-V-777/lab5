/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class hiererchialexecution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       student1 obj=new student1();
        staff obj1=new staff();
         //obj.getbookdetails();
         //obj.show();
        obj.getstudent1details();
        obj.show1();
        obj1.getstaffdetails();
        obj1.show2();
              
       
        
    }
    
}
class book
{
    String name;
    int accno;
    String a;
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
        System.out.println("Enter the name of the book:");
        name=obj.next();
        System.out.println("Enter the access no::");
        accno=obj.nextInt();
        System.out.println("Enter the author name:");
        a=obj.next();
    }
    public void show()
    {
        System.out.println("*BOOK DETAILS*");
         System.out.println("Name of the book:"+name);
          System.out.println("Access no of the book:"+accno);
           System.out.println("Author name:"+a);
         
    }
}
class student1 extends book
{
    String name;
    String rollno;
    String dept;
    public void getstudent1details()
    {
        super.getbookdetails();
        System.out.println("Enter the name of the student:");
        name=obj.next();
        System.out.println("Enter the roll number of the student:");
         rollno=obj.next();
         System.out.println("Enter the department of the student:");
         dept=obj.next();
    }
    public void show1()
    {
        super.show();
           System.out.println("*STUDENT DETAILS*");
         System.out.println("Name of the student:"+name);
          System.out.println("Rollno of the student"+rollno);
           System.out.println("Department of the student:"+dept);
    }
}
class staff extends book
{
    String name;
    String sid;
    String dept;
    public void getstaffdetails()
    {
        super.getbookdetails();
        System.out.println("Enter the name of the staff:");
        name=obj.next();
        System.out.println("Enter the ID of the staff:");
         sid=obj.next();
         System.out.println("Enter the department of the staff:");
         dept=obj.next();
    }
        public void show2()
        {
            super.show();
        System.out.println("*STAFF DETAILS*");
         System.out.println("Name of the staff:"+name);
          System.out.println("ID of the staff:"+sid);
           System.out.println("Department of the staff:"+dept);
        }
            
              
}