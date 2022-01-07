import java.lang.Math; 
public abstract class Personnel{
	private double  id;
	private String name;
	private BankAccount bankaccount;
	private static int PersonnelCount=0;
	Personnel(String name,double balance ){
		this.name=name;
		id=Math.random();
		bankaccount=new BankAccount(balance);
		PersonnelCount=PersonnelCount+1;
	}
	int GetPersonnelCount() {
		int k=PersonnelCount;
		return k;
	}
	abstract double CalculateIncome();
}
