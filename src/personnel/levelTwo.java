package personnel;

import java.util.ArrayList;
import Utility.Allowance;
import Utility.Award;
import Utility.TransactionRecord;

public class levelTwo extends levelOne {
	public ArrayList<Allowance>allowance = new ArrayList<Allowance>();
	public levelTwo(String name,String wing,String location,Double BaseSalary, Double balance, ArrayList<Award> award){
		super(name,wing,location,BaseSalary,balance, award);
		this.level=2;
	}
	public void requestAllowance(String allowancename, ArrayList<TransactionRecord> transactionRecord) {
		/*
		 * TODO: check request allowance function
		 */
		boolean flag=Allowance.eligibleforAllowance(allowancename, this, transactionRecord);
		if(flag)
		{
			System.out.println("Allowance claimed");
		}
		else
		{
			System.out.println("Officer not eligible for allowance");
		}
	}

}
