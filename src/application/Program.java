package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions2.Account;
import model.exception.WithdrawBalanceException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
		System.out.print("With draw limit: ");
        Double withdrawLimit = sc.nextDouble();
        
        Account ac = new Account(number,name,initialBalance,withdrawLimit);
        
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		sc.close();
		
		try {
			ac.withdraw(amount);
			System.out.println("New balance: " + ac.getBalance());
		}
		catch(WithdrawBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
		
}


