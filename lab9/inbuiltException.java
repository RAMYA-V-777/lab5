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
public class inbuiltException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner obj=new Scanner(System.in);
         int choice;
        char ch;
        do
        {
            System.out.println("Choose the Exception:");
            System.out.println("____________________________________________________________________________________________________________________");
            System.out.println("1.ArithmeticException\n2.ArrayIndexOutOfBoundsException\n3.NumberFormatException\n4.StringIndexOutOfBoundsException");
            System.out.println("____________________________________________________________________________________________________________________");
            choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                        //try and catch block for Arithmetic Exception
                          try
                             {
                 System.out.println("Enter the first integer:");                        int n=obj.nextInt();
                  System.out.println("Enter the second integer:");
                 int j=obj.nextInt();
                 int k=n/j;
                 k =Integer.parseInt( obj.next());
                System.out.println(k);
                System.out.println("No Exceptions!!!!!");
          }
          catch(ArithmeticException e)
          {
                System.out.println("Arithmetic Exception--->"+e);
          }
                break;
                case 2:
          //try and catch block for ArrayIndexOutOfBounds Exception
          try
          {
                int a[]=new int[5];
                a[11]=7;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
                System.out.println("ArrayIndexOutOfBounds Exception--->"+e);
          }
                break;
                case 3:
          //try and catch block for NumberFormat Exception
          try
          {
                 System.out.println("Enter the string:");
                 String y=obj.next();
                 int s=Integer.parseInt(y);
                 System.out.println(s);
                 System.out.println("No Exceptions!!!!!");
          }
           catch(NumberFormatException e)
           {
                 System.out.println("NumberFormat Exception--->"+e);
           }
                break;
                case 4:
          //try and catch block for StringIndexOutOfBounds Exception
          try
          {
                 System.out.println("Enter the string:");
                 String r=obj.next();
                  System.out.println(r.substring(78,67));
                 System.out.println("No Exceptions!!!!!");
          }
          catch(StringIndexOutOfBoundsException e)
          {
              System.out.println("StringIndexOutOfBounds Exception--->"+e);
          }
                break;
                default:
                     System.out.println("Enter option from 1 to 4:");
                    break;
            }
             System.out.println("Do you want to continue:");
             ch=obj.next().charAt(0);
        }while(ch=='y' || ch=='Y');
          
      }
    }

    
    

