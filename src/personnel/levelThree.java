package personnel;

import java.util.ArrayList;

public class levelThree extends levelTwo {
	levelThree(String name,String wing,String location,Double BaseSalary, Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.level=3;
	}
	public void recruit(Personnel candidate, ArrayList<levelOne> LevelOne) {
		String w;
		System.out.println("enter the wing name");
		w=sc.next();
		String l;
		System.out.println("enter the location");
		l=sc.next();
		levelOne officer=new levelOne(candidate.name,w,l,20000.0,candidate.getBalance());
		LevelOne.add(officer);
		
	}
	public levelTwo promote(levelOne off) {
		/*
		 * TODO: add the newly promoted record to the level two arrayList and remove the record from level one array list
		 */
		levelTwo officer=new levelTwo(off.name,off.wing,off.location,25000.0,1000000.0);
		return officer;
	}

}
