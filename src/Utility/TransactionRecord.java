package Utility;

import java.util.Date;

public class TransactionRecord extends Record {
	private Integer bankAccountNumber;
	private Double amount;
	private String type;
	
	public TransactionRecord(Integer officerID, Date date, Integer bankAccountNumber, Double amount, String type) {
		super(officerID, date);
		this.bankAccountNumber = bankAccountNumber;
		this.amount = amount;
		this.type = type;
	}
}
