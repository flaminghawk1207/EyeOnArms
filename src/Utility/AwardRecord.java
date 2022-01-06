package Utility;

import java.util.Date;

public class AwardRecord extends Record{
	private String awardName;
	private Integer prizeMoney;
	
	public AwardRecord(Integer officerID, Date date, String awardName, Integer prizeMoney) {
		super(officerID, date);
		this.awardName = awardName;
		this.prizeMoney = prizeMoney;
	}	
}
