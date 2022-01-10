package personnel;

import Utility.Login;

public class Manager implements Login{
	public String name;
	public int ID;
	public static int managerCount=0;

	Manager (String name, int ID){
		this.name=name;
		ID= managerCount++;
	}
	public void initiateRetirement(levelOne officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		 Veteran v1(officer)= new Veteran(officer); // create veteran record (need to change)
		 officer=null;  	// delete record
	}
	public void Discharge (levelOne officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		officer=null; //delete record
	}

	public void initiateRetirement(levelTwo officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		 Veteran v1(officer)= new Veteran(officer); // create veteran record
		 officer=null;  	// delete record
	}
	public void Discharge (levelTwo officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		officer=null; //delete record
	}

	public void initiateRetirement(levelThree officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		 Veteran v1(officer)= new Veteran(officer); // create veteran record
		 officer=null;  	// delete record
	}
	public void Discharge (levelThree officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		officer=null; //delete record
	}

	public void initiateRetirement(levelFour officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		 Veteran v1(officer)= new Veteran(officer); // create veteran record
		 officer=null;  	// delete record
	}
	public void Discharge (levelFour officer) {
		levelOne.OfficerCount=levelOne.OfficerCount-1;
		officer=null; //delete record
	}

	public void initiatePayroll() {
		//
	}

	public boolean validateUsername(String password) {
		//
		return true;
	}
} 