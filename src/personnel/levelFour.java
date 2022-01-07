package personnel;

public class levelFour extends levelThree {
	levelFour(String name,String wing,String location,Double BaseSalary,Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.level=4;
	}
	public levelThree promote(levelTwo off) {
		levelThree officer=new levelThree(off.name,off.wing,off.location,25000.0,100000.0 );
		return officer;
	}
	/*
	 * TODO: get report to be done later
	 */
	public void getaward(levelOne officer) {
		try {
		officer.AddAward();
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}

	public void getaward(levelTwo officer) {
		try {
		officer.AddAward();
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
	public void getaward(levelThree officer) {
		try {
		officer.AddAward();
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
}


