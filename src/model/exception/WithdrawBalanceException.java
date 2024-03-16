package model.exception;

public class WithdrawBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public WithdrawBalanceException(String msg) {
		super(msg);
	}
}
