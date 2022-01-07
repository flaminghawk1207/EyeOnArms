package personnel;

import java.util.ArrayList;
import Utility.Allowance;

public class levelTwo extends levelOne {
	public ArrayList<Allowance>allowance = new ArrayList<Allowance>();
	levelTwo(String name,String wing,String location,Double BaseSalary, Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.level=2;
	}
	public Allowance requestAllowance(String allowancename) {
		/*
		 * TODO: complete request allowance function
		 */
	}

}
