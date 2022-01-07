package personnel;

import java.util.Scanner;
import Utility.BankAccount;

public abstract class Personnel{
	Scanner sc=new Scanner(System.in);
	public Integer  id;
	public String name;
	public BankAccount bankaccount;
	//give bank account belonging to the class bank account
	public static int PersonnelCount=0;
	Personnel(String name, Double balance){
		this.name=name;
		this.id=PersonnelCount+1;
		this.bankaccount=new BankAccount(balance);
		PersonnelCount=PersonnelCount+1;
	}
	int GetPersonnelCount() {
		return PersonnelCount;
	}
	abstract double CalculateIncome();
	
	
}
