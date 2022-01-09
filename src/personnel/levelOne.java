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
	levelOne(String name,String wing,String location,Double BaseSalary, Double balance){
		super(name, balance);
		this.level=1; 
		this.wing=wing;
		this.location=location;
		this.BaseSalary=BaseSalary;
		 OfficerCount= OfficerCount+1;
	}

	public Award AddAward() throws Exception{
		String aname;
		int pmoney;
		System.out.println("enter the award name");
		aname=sc.next();
		System.out.println("enter the prize money");
		pmoney=sc.nextInt();
		Date d=new Date();
		Award dw=new Award(aname,pmoney,d);
		awardsRecieved.add(dw);	
		return dw;
	}

	double CalculateIncome() {
		return this.BaseSalary;
	}
	public int getID() {
		return this.id;
	}

}
