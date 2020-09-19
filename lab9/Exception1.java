/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab9;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name:");
        String s = obj.next();
         System.out.println("******************************************");
        System.out.println("Enter the age:");
        int age = obj.nextInt();
          System.out.println("******************************************");
        System.out.println("Enter the email id:");
        String email = obj.next();
        try
        {
            Person info=new Person(s);
            info.verify();
        }
        catch(Exception t)
        {
            System.out.println(t.getMessage());
        }
        
        
}
}
class Person
{
    String name;
    int age;
    String email;
   Person(String t)
   {
   
   name=t;
   }
void verify() throws Exception
{
    for(int i=0;i<name.length();i++)
        {
            if(((name.charAt(i)>=97)&&(name.charAt(i)<=122)) || ((name.charAt(i)<=90)&&(name.charAt(i)>=65)))//Ascii value
            {
                
              
            }
            else
            {
                  System.out.println("******************************************");
                throw new Exception("NameIncorrectFormatException->" + name);
                 
            }
        }
      System.out.println("******************************************");
     System.out.println("No exceptions found in "+name);
}
}
class NameIncorrectFormatException extends Exception
{

    NameIncorrectFormatException(String s)
    {
        super(s);
    }
}