package Utility;

import java.util.HashMap;
import java.util.Map.Entry;


import personnel.levelFour;
import personnel.levelThree;
import personnel.levelTwo;;

public class Allowance {
	private String name;
	private Pair amount;
	private Integer minLevel;
	private String wing;
	
	public Allowance(String name, Pair amount, Integer minLevel, String wing) {
		this.name = name;
		this.amount = amount;
		this.minLevel = minLevel;
		this.wing = wing;
	}
	public static HashMap<String, Allowance> map = new HashMap<>();
	public static void intializeAllowanceMap()
	{		
		//Army
		map.put("Classification Allowance", new Allowance("Classification Allowance", new Pair("Fixed", 225), 2, "Army"));
		map.put("Rum Allowance", new Allowance("Rum Allowance", new Pair("Fixed", 360), 2, "Army"));
		
		map.put("CPM Allowance", new Allowance("CPM Allowance", new Pair("Fixed", 90), 3, "Army"));
		map.put("Dress Allowance", new Allowance("Dress Allowance", new Pair("Fixed", 1700), 3, "Army"));
		map.put("Extra Allowance", new Allowance("Extra Allowance", new Pair("Variable", 2), 3, "Army"));
		
		map.put("Language Allowance", new Allowance("Language Allowance", new Pair("Fixed", 2025), 4, "Army"));
		map.put("PG Allowance", new Allowance("PG Allowance", new Pair("Fixed", 2250), 4, "Army"));
		
		//Navy
		map.put("Diving Allowance", new Allowance("Diving Allowance", new Pair("Fixed", 1800), 2, "Navy"));
		map.put("Dip Allowance", new Allowance("Dip Allowance", new Pair("Fixed", 3500), 2, "Navy"));
		map.put("Diving attendant Allowance", new Allowance("Diving attendant Allowance", new Pair("Fixed", 700), 2, "Navy"));
		
		map.put("ISD Allowance", new Allowance("ISD Allowance", new Pair("Variable", 16), 3, "Navy"));
		map.put("Sea going Allowance", new Allowance("Sea going Allowance", new Pair("Fixed", 10500), 3, "Navy"));
		
		map.put("Submarine duty Allowance", new Allowance("Submarine duty Allowance", new Pair("Fixed", 5300), 4, "Navy"));
		map.put("Submarine technical Allowance", new Allowance("Submarine technical Allowance", new Pair("Fixed", 1000), 4, "Navy"));
		
		//Air force
		map.put("Air worthiness Allowance", new Allowance("Air worthiness Allowance", new Pair("Fixed", 338), 2, "Airforce"));
		map.put("High altitude Allowance", new Allowance("High altitude Allowance", new Pair("Fixed", 5300), 2, "Airforce"));		
		map.put("Flying Allowance", new Allowance("Flying Allowance", new Pair("Fixed", 17300), 2, "Airforce"));
		
		map.put("CPM Allowance", new Allowance("CPM Allowance", new Pair("Fixed", 1700), 3, "Airforce"));		
		map.put("Dress Allowance", new Allowance("Dress Allowance", new Pair("Fixed", 1700), 3, "Airforce"));
		
		map.put("Piloting Allowance", new Allowance("Piloting Allowance", new Pair("Fixed", 25000), 4, "Airforce"));		
	}
	
	/*
	 * TODO: functions to check eligibility (after officer classes)
	 */
	public static boolean eligibleforAllowance(String allowanceName, levelTwo officer)
	{
		
		if(Allowance.map.containsKey(allowanceName))
		{
			Allowance temp = map.get(allowanceName);
			if(officer.getLevel()>=temp.minLevel && officer.getWing().equals(temp.wing))
			{
				if( temp.amount.getKey().equals("Fixed"))
				{
					officer.bankaccount.setBalance(officer.getBalance()+temp.amount.getValue());   
					return true;
				}
				else
				{
					Double allowMoney = (officer.getBaseSalary()*temp.amount.getValue())/100; 
					officer.bankaccount.setBalance(officer.getBalance()+allowMoney); 
					return true;					
				}				
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}	
		
	}
	public static boolean eligibleforAllowance(String allowanceName, levelThree officer)
	{
		if(Allowance.map.containsKey(allowanceName))
		{
			Allowance temp = map.get(allowanceName);
			if(officer.getLevel()>=temp.minLevel && officer.getWing().equals(temp.wing))
			{
				if( temp.amount.getKey().equals("Fixed"))
				{
					officer.bankaccount.setBalance(officer.getBalance()+temp.amount.getValue());   
					return true;
				}
				else
				{
					Double allowMoney = (officer.getBaseSalary()*temp.amount.getValue())/100; 
					officer.bankaccount.setBalance(officer.getBalance()+allowMoney); 
					return true;					
				}				
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}	
	}
	public static boolean eligibleforAllowance(String allowanceName, levelFour officer)
	{
		if(Allowance.map.containsKey(allowanceName))
		{
			Allowance temp = map.get(allowanceName);
			if(officer.getLevel()>=temp.minLevel && officer.getWing().equals(temp.wing))
			{
				if( temp.amount.getKey().equals("Fixed"))
				{
					officer.bankaccount.setBalance(officer.getBalance()+temp.amount.getValue());   
					return true;
				}
				else
				{
					Double allowMoney = (officer.getBaseSalary()*temp.amount.getValue())/100; 
					officer.bankaccount.setBalance(officer.getBalance()+allowMoney); 
					return true;					
				}				
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}	
		
	}
}
