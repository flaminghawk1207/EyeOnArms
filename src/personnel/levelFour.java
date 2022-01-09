package personnel;

import java.util.ArrayList;
import java.util.Date;

import Utility.Award;
import Utility.AwardRecord;
import Utility.PromotionRecord;

public class levelFour extends levelThree {
	levelFour(String username, String password, String name,String wing,String location,Double BaseSalary,Double balance){
		super(username, password, name,wing,location,BaseSalary,balance);
		this.level=4;
	}
	public void promote(levelTwo off, ArrayList <levelTwo> LevelTwo, ArrayList<levelThree> LevelThree,
			ArrayList<PromotionRecord> promotionRecord) {
		/*
		 * For now - when creation of a new level 3 officer - User name will be name and password will be id
		 */
		levelThree officer=new levelThree(off.name, off.id.toString() ,off.name,off.wing,off.location,25000.0,100000.0 );
		LevelThree.add(officer);
		Date date = new Date();
		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 3); 
		promotionRecord.add(prObject);
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(off.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
		/*
		 * TODO: Check creation of new record and deletion of previous one
		 */
	}
	/*
	 * TODO: get report to be done later
	 */
	public void getAward(levelOne officer, ArrayList<AwardRecord> awardRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}

	public void getAward(levelTwo officer, ArrayList<AwardRecord> awardRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
	public void getAward(levelThree officer, ArrayList<AwardRecord> awardRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
	public void getReport(Date startDate, Date endDate, int searchCategory, ArrayList<AwardRecord> awardRecord,
			ArrayList<PromotionRecord> promotionRecord)
	{
		if(searchCategory == 1)
		{
			//award report
			int i=0;
			ArrayList<AwardRecord> awardRecordReport = new ArrayList<AwardRecord>();
			for(i=0;i<awardRecord.size();i++)
			{
				if(!startDate.after(awardRecord.get(i).getDate()) && !endDate.before(awardRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					awardRecordReport.add(awardRecord.get(i));
				}
				/*
				 * TODO: Print the awardRecordReport
				 */

			}
		}
		else if(searchCategory ==  2)
		{
			//transaction report
			
		}
		else if(searchCategory == 3)
		{
			//Retirement report
			
		}
		else
		{
			//Promotion report
			int i=0;
			ArrayList<PromotionRecord> promotionRecordReport = new ArrayList<PromotionRecord>();
			for(i=0;i<promotionRecord.size();i++)
			{
				if(!startDate.after(promotionRecord.get(i).getDate()) && !endDate.before(promotionRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					promotionRecordReport.add(promotionRecord.get(i));
				}
				/*
				 * TODO: Print the awardRecordReport
				 */

			}
		}
		
		
	}
}


