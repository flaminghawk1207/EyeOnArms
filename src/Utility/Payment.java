package Utility;

public class Payment {
	private Integer ID, accountNo;
	private Double amount;
	private String type;
	
	/*
	 * TODO: Constructors after officer classes are complete
	 */
	public Payment(Integer iD, Integer accountNo, Double amount, String type) {
		this.ID = iD;
		this.accountNo = accountNo;
		this.amount = amount;
		this.type = type;
	}
	
	
}
