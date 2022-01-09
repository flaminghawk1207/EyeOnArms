package personnel;

import java.util.ArrayList;
import java.util.Date;

import Utility.PromotionRecord;

public class levelThree extends levelTwo {
	private String username,password;
	levelThree(String username, String password, String name,String wing,String location,
			Double BaseSalary, Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.username = username;
		this.password = password;
		this.level=3;
	}
	public void recruit(Personnel candidate, ArrayList<levelOne> LevelOne, ArrayList<PromotionRecord> promotionRecord) {
		String w;
		System.out.println("enter the wing name");
		w=sc.next();
		String l;
		System.out.println("enter the location");
		l=sc.next();
		levelOne officer=new levelOne(candidate.name,w,l,20000.0,candidate.getBalance());
		LevelOne.add(officer);
		Date date = new Date();
		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 1); 
		promotionRecord.add(prObject);
	}
	public void promote(levelOne off, ArrayList<levelOne> LevelOne, ArrayList<levelTwo> LevelTwo, 
			ArrayList<PromotionRecord> promotionRecord) {

		levelTwo officer=new levelTwo(off.name,off.wing,off.location,25000.0,1000000.0);
		LevelTwo.add(officer);
		Date date = new Date();
		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 2); 
		promotionRecord.add(prObject);
		int i=0;
		for(i=0;i<LevelOne.size();i++)
		{
			if(off.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelOne.size())
		{
			LevelOne.remove(i);
		}
		/*
		 * TODO: Check creation of new record and deletion of previous one
		 */
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
