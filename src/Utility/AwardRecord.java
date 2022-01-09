package Utility;

import java.util.Date;

public class AwardRecord extends Record{
	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public Integer getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(Integer prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	private String awardName;
	private Integer prizeMoney;
	
	public AwardRecord(Integer officerID, Date date, String awardName, Integer prizeMoney) {
		super(officerID, date);
		this.awardName = awardName;
		this.prizeMoney = prizeMoney;
	}	
}
