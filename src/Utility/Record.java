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

	public static Integer getRecordCount() {
		return recordCount;
	}

	public static void setRecordCount(Integer recordCount) {
		Record.recordCount = recordCount;
	}

	public Integer getOfficerID() {
		return officerID;
	}

	public void setOfficerID(Integer officerID) {
		this.officerID = officerID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
