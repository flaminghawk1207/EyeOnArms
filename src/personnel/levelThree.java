package personnel;

public class levelThree extends levelTwo {
	levelThree(String name,String wing,String location,Double BaseSalary, Double balance){
		super(name,wing,location,BaseSalary,balance);
		this.level=3;
	}
	public levelOne recruit(Personnel candidate) {
		String w;
		System.out.println("enter the wing name");
		w=sc.next();
		String l;
		System.out.println("enter the location");
		l=sc.next();
		levelOne officer=new levelOne(candidate.name,w,l,20000.0,100000.0);
		return officer;
	}
	public levelTwo promote(levelOne off) {
		levelTwo officer=new levelTwo(off.name,off.wing,off.location,25000.0,1000000.0);
		return officer;
	}

}
