package Utility;

public class BankAccount {
	private static Integer accountCount = 0;
	private Integer accountNumber;
	private Double balance;
	
	public BankAccount(Double balance) {
		this.accountNumber = accountCount++;
		this.balance = balance;
	}
	
	/**
	 * @param amount Amount to be transferred (should be positive)
	 * @return boolean Validity of transaction
	 */
	public boolean tranferAmount(Double amount) {
		if(amount < 0) return false;
		this.balance += amount;
		return true;
	}
	public Integer getBankAccountId() {
		return this.accountNumber;
	}
	public Double getbalance()
	{
		return balance;
	}
}
