package Utility;
import java.util.Date;

public class Record {
	static Integer recordCount = 0;
	Integer officerID;
	Date date;
	
	protected Record(Integer officerID, Date date) {
		this.officerID = officerID;
		this.date = date;
	}
}
