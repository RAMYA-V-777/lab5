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
public class Bankprgrm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        
      Scanner p=new Scanner(System.in);
        char ch,t;
         Bank n;//DYNAMIC METHOD DISPATCH
        do{
        System.out.println("\nEnter the bank in which the boy deposited the money:");
         t=p.next().charAt(0);
        switch(t)
        {
                case 'A':
                 n=new BankA();
        System.out.println(n.getBalance());
                break;
            case 'B':
                
            n=new BankB();
        System.out.println(n.getBalance());
                break;
            case 'C':
              n=new BankC();
                    System.out.println(n.getBalance());
                break;
                 default:
                  System.out.println("Enter option from 1 to 3");
                break;
            }
        System.out.println("Do u want to conitue");
        ch=p.next().charAt(0);
        }while(ch=='y'||ch=='Y');
                
  
    }
}
class Bank//super class
{
    int getBalance()
    {
        return 0;
    }
}
class BankA extends Bank//sub class
{
    int getBalance()
    {
        return 1000;
    }
}
class BankB extends Bank
{
    int getBalance()
    {
        return 1500;
    }
}
class BankC extends Bank
{
    int getBalance()
    {
        return 2000;
    }
}

