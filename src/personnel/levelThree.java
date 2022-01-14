package personnel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Utility.Award;
import Utility.Login;
import Utility.PromotionRecord;

public class levelThree extends levelTwo implements Login {
	private String username,password;
	/*
	 * TODO: should user name and password be private or protected?
	 */
	public levelThree(String username, String password, String name,String wing,String location,
			Double BaseSalary, Double balance, ArrayList<Award> award){
		super(name,wing,location,BaseSalary,balance,award);
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
		/*
		 * TODO: Check logic here
		 */
		levelOne officer=new levelOne(candidate.name,w,l,20000.0,candidate.getBalance());
		LevelOne.add(officer);
//		Date date = new Date();
//		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 1); 
//		promotionRecord.add(prObject);
	}
	public void promote(levelOne off, ArrayList<levelOne> LevelOne, ArrayList<levelTwo> LevelTwo, 
			ArrayList<PromotionRecord> promotionRecord) {

		levelTwo officer=new levelTwo(off.name,off.wing,off.location,25000.0,1000000.0,off.awardsRecieved);
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
	
	public boolean validate(String username,String password)
	{
		/*
		 * TODO: check validate function and integrate
		 */
		
		return (this.username.equals(username) && this.password.equals(password));
	}
	
	public void changeCredentials()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new username: ");
		this.username=sc.next();
		System.out.println("Enter the new password: ");
		this.password=sc.next();
		sc.close();
	}
	

}
