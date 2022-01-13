package personnel;

import java.util.ArrayList;
import Utility.Allowance;

public class levelTwo extends levelOne {
	private Integer month;
	public ArrayList<Allowance>allowance = new ArrayList<Allowance>();
	levelTwo(String name,String wing,String location,Double BaseSalary, Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.level=2;
		this.month=-1;
	}
	public void requestAllowance(String allowancename) {
		/*
		 * TODO: check request allowance function
		 */
		boolean flag=Allowance.eligibleforAllowance(allowancename, this);
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
