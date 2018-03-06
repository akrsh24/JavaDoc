package application;

import java.util.Scanner;

import model.AccountRepositoryI;

import model.Person;
import model.Transfer;

public class App extends Thread implements Runnable {

	@Override
	public synchronized void run() {

		System.out.println("Enter the account number");
		Scanner ac = new Scanner(System.in);
		int account = ac.nextInt();
	
		Transfer.SetAccount(account);

		System.out.println("Enter Your Choice");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposite");
		System.out.println("Get balance");

		Scanner c = new Scanner(System.in);
		int choice = c.nextInt();

		int amount;
		switch (choice) {
		case 1:
			System.out.println("Type the amount you want to enter");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextInt();

			Transfer.Transferfunds(amount, choice);
			break;
		case 2:
			System.out.println("Type the amount you want to enter");
			Scanner sc2 = new Scanner(System.in);
			amount = sc2.nextInt();

			Transfer.Transferfunds(amount, choice);
			break;
		case 3:

		}

	}
}