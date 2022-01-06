package Utility;

import java.util.Date;

public class RetirementRecord extends Record{
	private String rankDuringRetirement;

	public RetirementRecord(Integer officerID, Date date, String rankDuringRetirement) {
		super(officerID, date);
		this.rankDuringRetirement = rankDuringRetirement;
	}	
}
