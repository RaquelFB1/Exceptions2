package exceptions2;

import model.exception.WithdrawBalanceException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Integer getNumber() {
		return number;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	 public void deposit(Double amount) {
		 balance += amount;
	 }
	 public void withdraw(Double amount) throws WithdrawBalanceException {
		 if(amount > getBalance()) {
			 throw new WithdrawBalanceException("Withdraw error: not enough balance");
		 }
		 else if (amount > getWithdrawLimit()){
			 throw new WithdrawBalanceException("Withdraw error: the amount exceeds withdraw limit");
		 }
		 else {
			 amount -= balance;
		 }
	 }
	
}
