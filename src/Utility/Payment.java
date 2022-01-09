package Utility;

import personnel.levelOne;
import personnel.levelTwo;
import personnel.levelThree;
import personnel.levelFour;


public class Payment {
	private static Integer PaymentCount=0;
	private Integer ID, accountNo;
	private Double amount;
	private String type;
	
	/*
	 * TODO: Constructors after officer classes are complete - Completed check the constructors
	 */
	public Payment(levelOne officer, Double amount, String type) {
		this.ID=PaymentCount++;
		this.accountNo=officer.bankaccount.getBankAccountId();
		this.amount=amount;
		this.type=type;		
	}
	
	public Payment(levelTwo officer, Double amount, String type) {
		this.ID=PaymentCount++;
		this.accountNo=officer.bankaccount.getBankAccountId();
		this.amount=amount;
		this.type=type;		
	}
	
	public Payment(levelThree officer, Double amount, String type) {
		this.ID=PaymentCount++;
		this.accountNo=officer.bankaccount.getBankAccountId();
		this.amount=amount;
		this.type=type;		
	}
	public Payment(levelFour officer, Double amount, String type) {
		this.ID=PaymentCount++;
		this.accountNo=officer.bankaccount.getBankAccountId();
		this.amount=amount;
		this.type=type;		
	}
	
}
