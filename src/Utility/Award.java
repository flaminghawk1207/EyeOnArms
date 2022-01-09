package Utility;

import java.util.Date;

public class Award {
	private String name;
	private Integer prizeMoney;
	private Date date;
	
	public Award()
	{
		this.name=" ";
		this.prizeMoney=0;
		this.date= new Date();
	}
	public Award(String name, Integer prizeMoney, Date date) {
		this.name = name;
		this.prizeMoney = prizeMoney;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(Integer prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}	
	
}
