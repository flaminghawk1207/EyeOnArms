package personnel;

public class Veteran extends Personnel {
	public double pensionAmount;
	public static int veteranCount=0;
	public Veteran(String name, Integer id, Integer accountNumber, Double balance, double pensionAmount)
	{
		super(name, balance);
	}
	public Veteran(levelOne officer,double pensionAmount, Double balance ) {
		super(officer.getName(), balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelTwo officer,double pensionAmount,Double balance ) {
		super(officer.getName(), balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelThree officer,double pensionAmount,Double balance ) {
		super(officer.getName(), balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelFour officer,double pensionAmount, Double balance ) {
		super(officer.getName(), balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}

	public static int getVeteranCount() {
		return veteranCount;
	}





}