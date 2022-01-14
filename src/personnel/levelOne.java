package personnel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Utility.Award;

public class levelOne extends Personnel {
	public Integer level;
	public String wing;
	public String location;
	public Double BaseSalary;
	public ArrayList<Award>awardsRecieved = new ArrayList<Award>();
	public static Integer OfficerCount=0;
	public static Integer GetOfficerCount() {
		return OfficerCount;
	}
	public levelOne(String name,String wing,String location,Double BaseSalary, Double balance, ArrayList<Award> awards){
		super(name, balance);
		this.level=1; 
		this.wing=wing;
		this.location=location;
		this.BaseSalary=BaseSalary;
		 OfficerCount= OfficerCount+1;
		 this.awardsRecieved=awards;
	}

	public Award AddAward() throws Exception{
		String aname;
		Double pmoney;
		System.out.println("enter the award name");
		aname=sc.next();
		System.out.println("enter the prize money");
		pmoney=sc.nextDouble();
		this.bankaccount.setBalance(this.bankaccount.getBalance()+pmoney);
		Date d=new Date();
		Award dw=new Award(aname,pmoney,d);
		awardsRecieved.add(dw);	
		return dw;
	}
	/*
	 * How to implement calculateIncome 
	 */

	double CalculateIncome() {
		return this.BaseSalary;
	}

	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getBaseSalary() {
		return BaseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}
	public ArrayList<Award> getAwardsRecieved() {
		return awardsRecieved;
	}
	public void setAwardsRecieved(ArrayList<Award> awardsRecieved) {
		this.awardsRecieved = awardsRecieved;
	}
	public static Integer getOfficerCount() {
		return OfficerCount;
	}
	public static void setOfficerCount(Integer officerCount) {
		OfficerCount = officerCount;
	}
	

}
