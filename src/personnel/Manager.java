package personnel;

import java.util.ArrayList;
import java.util.Date;

import Utility.Login;
import Utility.RetirementRecord;

public class Manager implements Login{
	public String name;
	public int ID;
	public static int managerCount=0;

	Manager (String name, int ID){
		this.name=name;
		ID= managerCount++;
	}
	public void initiateRetirement(levelOne officer,ArrayList<levelOne> LevelOne, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		 Veteran vt = new Veteran(officer, 8000.00, 0.00);
		 Date date = new Date();
		 RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		 retirementRecord.add(rt);
		 veteran.add(vt);
		 int i=0;
		 for(i=0;i<LevelOne.size();i++)
		 {
			if(officer.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		 }
		 if(i!=LevelOne.size())
		 {
			LevelOne.remove(i);
		 }
		 
	}
	public void initiateDischarge(levelOne officer,ArrayList<levelOne> LevelOne, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		 Veteran vt = new Veteran(officer, 8000.00, 0.00);
		 Date date = new Date();
		 RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		 retirementRecord.add(rt);
		 veteran.add(vt);
		 int i=0;
		 for(i=0;i<LevelOne.size();i++)
		 {
			if(officer.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		 }
		 if(i!=LevelOne.size())
		 {
			LevelOne.remove(i);
		 }
		 /*
		  * TODO: Check if both retirement and discharge differ in any way?
		  */
	}

	public void initiateRetirement(levelTwo officer,ArrayList<levelTwo> LevelTwo, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 10000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(officer.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
	}
	public void initiateDischarge(levelTwo officer,ArrayList<levelTwo> LevelTwo, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 10000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(officer.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
	}

	public void initiateRetirement(levelThree officer,ArrayList<levelThree> LevelThree, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelThree.size();i++)
		{
			if(officer.getID()==LevelThree.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelThree.size())
		{
			LevelThree.remove(i);
		}	
	}
	public void initiateDischarge(levelThree officer,ArrayList<levelThree> LevelThree, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelThree.size();i++)
		{
			if(officer.getID()==LevelThree.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelThree.size())
		{
			LevelThree.remove(i);
		}	
	}

	public void initiateRetirement(levelFour officer,ArrayList<levelFour> LevelFour, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelFour.size();i++)
		{
			if(officer.getID()==LevelFour.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelFour.size())
		{
			LevelFour.remove(i);
		}		
	}
	public void initiateDischarge(levelFour officer,ArrayList<levelFour> LevelFour, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelFour.size();i++)
		{
			if(officer.getID()==LevelFour.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelFour.size())
		{
			LevelFour.remove(i);
		}		
	}
	public boolean validate(String username,String password)
	{
		/*
		 * TODO: implement validate function and integrate
		 */
		return true;
	}
	public void initiatePayroll() {
		//
	}

	public boolean validateUsername(String password) {
		//
		return true;
	}
} 