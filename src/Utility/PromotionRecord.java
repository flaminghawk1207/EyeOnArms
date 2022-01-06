package Utility;

import java.util.Date;

public class PromotionRecord extends Record {
	private Integer nextLevel;

	public PromotionRecord(Integer officerID, Date date, Integer nextLevel) {
		super(officerID, date);
		this.nextLevel = nextLevel;
	}
}
