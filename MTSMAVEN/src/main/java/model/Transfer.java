package model;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transfer extends Thread implements Runnable {
	static int amount;
	 static int account;
	 static int choice;
private Person person;

public Transfer(Person p) {
    this.person = p;
}
public static int SetAccount(int account1){
	
	account=account1;
	
	return account;
}
public static int getAccount() {
	return account;
}

 public static void Transferfunds(int amount2, int choice1) {
amount=amount2;
choice =choice1;
Transfer ts1 = new Transfer(new Person(Transfer.getAccount()));
ts1.start();
   
  
}


@Override
public synchronized void run() {
  
        try {
        	
        	  Account acc = Account.getAccount(person);
         if(choice==1)
         {   acc.withdraw(amount);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                }
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
            
         else if(choice ==2)
         {
         acc.deposit(200);

        }
    }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    System.out.println("Final Acc balance is Rs." + Account.getBal());
}}