package Utility;

import java.util.Map.Entry;;

public class Allowance {
	private String name;
	private Entry<String, Integer> amount;
	private Integer minLevel;
	private String wing;
	
	public Allowance(String name, Entry<String, Integer> amount, Integer minLevel, String wing) {
		this.name = name;
		this.amount = amount;
		this.minLevel = minLevel;
		this.wing = wing;
	}
	
	/*
	 * TODO: functions to check eligibility (after officer classes)
	 */
}
