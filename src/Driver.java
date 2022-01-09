import java.util.Scanner;

import Utility.AwardRecord;
import Utility.PromotionRecord;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import personnel.Personnel;
import personnel.levelFour;
import personnel.levelOne;
import personnel.levelThree;
import personnel.levelTwo;

public class Driver {
	
	public static void LoginMenu() {
		System.out.println("Choose your designation \n1.Manager \n2.Level-3, Level-4 \n3.Exit");		
	}
	
	public static void ManagerView(Manager manager, ArrayList <levelOne> LevelOne, ArrayList <levelTwo> LevelTwo, 
			ArrayList <levelThree> LevelThree, ArrayList <levelFour> LevelFour, ArrayList<Veteran> veteran) {
		// Menu
		int choice=0;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Menu");
			System.out.println("1.Initiate retirement");
			System.out.println("2.Initiate discharge");
			System.out.println("3.Initiate payroll");
			System.out.println("4.Initiate allowance");
			System.out.println("5.Exit");
			System.out.println("Enter a valid choice");
			choice = sc.nextInt();
			while(choice<1 || choice>5)
			{
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice)
			{
				case 1:
				{
					int level=0,id=0,i=0;
					boolean flag=false;
					System.out.println("Enter the ranking level of the officer requesting retirement: ");
					level=sc.nextInt();
					while(level<=0 || level >=5)
					{
						System.out.println("Enter valid level: ");
						level=sc.nextInt();
					}
					System.out.println("Enter the ID of the officer: ");
					id=sc.nextInt();
					if(level == 1)
					{
						for(i=0;i<LevelOne.size();i++)
						{
							if(LevelOne.get(i).getID()== id)
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateRetirement(LevelOne.get(i), LevelOne, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else if(level == 2)
					{
						flag=false;
						for(i=0;i<LevelTwo.size();i++)
						{
							if(LevelTwo.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateRetirement(LevelTwo.get(i), LevelTwo, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else if(level == 3)
					{
						flag=false;
						for(i=0;i<LevelThree.size();i++)
						{
							if(LevelThree.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateRetirement(LevelThree.get(i), LevelThree, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else
					{
						flag=false;
						for(i=0;i<LevelFour.size();i++)
						{
							if(LevelFour.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateRetirement(LevelFour.get(i), LevelFour, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
						
				
				}
				break;
				case 2:
				{
					int level=0,id=0,i=0;
					boolean flag=false;
					System.out.println("Enter the ranking level of the officer to be discharged: ");
					level=sc.nextInt();
					while(level<=0 || level >=5)
					{
						System.out.println("Enter valid level: ");
						level=sc.nextInt();
					}
					System.out.println("Enter the ID of the officer: ");
					id=sc.nextInt();
					if(level == 1)
					{
						for(i=0;i<LevelOne.size();i++)
						{
							if(LevelOne.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateDischarge(LevelOne.get(i), LevelOne, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else if(level == 2)
					{
						flag=false;
						for(i=0;i<LevelTwo.size();i++)
						{
							if(LevelTwo.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateDischarge(LevelTwo.get(i), LevelTwo, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else if(level == 3)
					{
						flag=false;
						for(i=0;i<LevelThree.size();i++)
						{
							if(LevelThree.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateDischarge(LevelThree.get(i), LevelThree, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else
					{
						flag=false;
						for(i=0;i<LevelFour.size();i++)
						{
							if(LevelFour.get(i).getID())
							{
								/*
								 * TODO: check if statements where comparison of id is done
								 */
								flag=true;
								break;
							}
						}
						if(flag)
						{
							manager.initiateDischarge(LevelFour.get(i), LevelFour, veteran);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					} 			
					
				}
				break;
				case 3:
				{
					Date date = new Date();
					Integer day=date.getDay();
					Integer month = date.getMonth();
					if(day==1 && month != manager.getMonth())
					{
						manager.intiatePayroll(LevelOne, LevelTwo, LevelThree, LevelFour, veteran);
					}
					else
					{
						if(day!=1)
						{
							System.out.println("Cannot initiate payment. Its not pay day");
						}
						else
						{
							System.out.println("Paid already for this month");
						}
						
					}
					
				}
				break;
				case 4:
				{
					int level=0,id=0,i=0;
					boolean flag=false;
					System.out.println("Enter the ranking level of the officer requesting retirement: ");
					level=sc.nextInt();
					while(level<1 || level >=5)
					{
						System.out.println("Enter valid level: ");
						level=sc.nextInt();
					}
					System.out.println("Enter the ID of the officer: ");
					id=sc.nextInt();

					if(level == 2)
					{
						flag=false;
						for(i=0;i<LevelTwo.size();i++)
						{
							if(LevelTwo.get(i).getID()== id ) 
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							String allowanceName;
							System.out.println("Enter the allowance name to claim: ");
							allowanceName=sc.next();
							LevelTwo.get(i).requestAllowance(allowanceName);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else if(level == 3)
					{
						flag=false;
						for(i=0;i<LevelThree.size();i++)
						{
							if(LevelThree.get(i).getID() == id)
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{

							String allowanceName;
							System.out.println("Enter the allowance name to claim: ");
							allowanceName=sc.next();
							LevelTwo.get(i).requestAllowance(allowanceName);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
					
					else
					{
						flag=false;
						for(i=0;i<LevelFour.size();i++)
						{
							if(LevelFour.get(i).getID())
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							String allowanceName;
							System.out.println("Enter the allowance name to claim: ");
							allowanceName=sc.next();
							LevelTwo.get(i).requestAllowance(allowanceName);
						}
						else
						{
							System.out.println("Invalid details..Try again"); //later
						}
					}
				}
			}			
		}while(true);		
	}
	
	public static void Level3View(levelThree LevelThree, ArrayList <levelOne> LevelOne,  ArrayList <levelTwo> LevelTwo, 
			ArrayList<PromotionRecord> promotionRecord)
	{
		Scanner sc = new Scanner(System.in);
		char ch='N';
		int choice=0;
		do 
		{
			System.out.println("Menu");
			System.out.println("1.Recruit candidate");
			System.out.println("2.Promote candidate");
			System.out.println("3.Exit");
			System.out.println("Enter a valid choice");
			choice = sc.nextInt();
			while(choice<1 || choice>3)
			{
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice)
			{
				case 1:
				{
					String name;
					System.out.println("Enter the candinate's name");
					name=sc.next();
					Personnel personnel = new Personnel (name, 0.00);
					LevelThree.recruit(personnel, LevelOne, promotionRecord);			
				}
				break;
				case 2:
				{
					char c='N';
					do 
					{
						int id=0,i;
						boolean flag=false;
						System.out.println("enter the officer Id of level 1 to promote: ");
						id=sc.nextInt();
						for(i=0;i<LevelOne.size();i++)
						{
							if(LevelOne.get(i).getID()==id)
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							LevelThree.promote(LevelOne.get(i), LevelOne, LevelTwo, promotionRecord); 
						}
						else
						{
							System.out.println("Invalid details. \n Do you want to try again (Y/N)"); 
							c=sc.next().charAt(0);
							/*
							 * TODO: Implement try again later in multiple parts in the driver code
							 */
						}
						
					}while(c=='Y');
					
						
				}
				break;
				case 3:
					break;
				default:
					break;
			}
			System.out.println("Do you want to continue(Y/N)");
			ch=sc.next().charAt(0);
			
		}while(ch=='Y');
		
	}
	
	public static void Level4View(levelFour LevelFour, ArrayList<levelOne> LevelOne, ArrayList<levelTwo> LevelTwo,
			ArrayList<levelThree> LevelThree, ArrayList<PromotionRecord> promotionRecord, ArrayList <AwardRecord> awardRecord)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("Menu");
		System.out.println("1.Promote candidate");
		System.out.println("2.Award candidate");
		System.out.println("3.Generate reports");
		System.out.println("4.Exit");
		System.out.println("Enter a valid choice");
		choice = sc.nextInt();
		while(choice<1 || choice>4)
		{
			System.out.println("Enter a valid choice: ");
			choice = sc.nextInt();
		}
		switch(choice)
		{
			case 1:
			{
				int id=0,i=0,level=0;
				boolean flag=false;
				System.out.println("Enter the level of officer to promote: ");
				level=sc.nextInt();
				while(level<=0 || level>=3)
				{
					System.out.println("Enter a valid level");
					level=sc.nextInt();
					
				}
				if(level == 1)
				{
					System.out.println("enter the officer Id to promote: ");
					id=sc.nextInt();
					for(i=0;i<LevelOne.size();i++)
					{
						if(LevelOne.get(i).getID() == id)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						LevelFour.promote(LevelOne.get(i),LevelOne, LevelTwo, promotionRecord); 
					}
					else
					{
						System.out.println("Invalid details..Try again"); 

						/*
						 * TODO: Implement try again later in multiple parts in the driver code
						 */
					}
				}
				else
				{
					System.out.println("enter the officer Id to promote: ");
					id=sc.nextInt();
					for(i=0;i<LevelOne.size();i++)
					{
						if(LevelTwo.get(i).getID() == id)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						LevelFour.promote(LevelTwo.get(i),LevelTwo ,LevelThree, promotionRecord); 
						/*
						 * TODO: implement promote function in level 3
						 */
					}
					else
					{
						System.out.println("Invalid details..Try again"); 

						/*
						 * TODO: Implement try again later in multiple parts in the driver code
						 */
					}
				}
				
					
			}
			break;
			case 2:
			{
				int id=0,i=0,level=0;
				boolean flag=false;
				System.out.println("Enter the level of officer to award: ");
				level=sc.nextInt();
				while(level<=0 || level>=4)
				{
					System.out.println("Enter a valid level");
					level=sc.nextInt();
					
				}
				if(level == 1)
				{
					System.out.println("enter the officer Id to award: ");
					id=sc.nextInt();
					for(i=0;i<LevelOne.size();i++)
					{
						if(LevelOne.get(i).getID()== id)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						LevelFour.getAward(LevelOne.get(i), awardRecord); 
						/*
						 * TODO: implement promote function in level 3
						 * 
						 * LevelOne.get(i) is part of arrayList levelOne..Any changes in the LevelOne.get(i)
						 * will(should?) be reflected in the array list
						 */
					}
					else
					{
						System.out.println("Invalid details..Try again"); 

						/*
						 * TODO: Implement try again later in multiple parts in the driver code
						 */
					}
				}
				else if(level == 2)
				{
					System.out.println("enter the officer Id to promote: ");
					id=sc.nextInt();
					for(i=0;i<LevelOne.size();i++)
					{
						if(LevelTwo.get(i).getID() == id)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						LevelFour.getAward(LevelTwo.get(i), awardRecord); 
						/*
						 * TODO: implement promote function in level 3
						 */
					}
					else
					{
						System.out.println("Invalid details..Try again"); 

						/*
						 * TODO: Implement try again later in multiple parts in the driver code
						 */
					}
				}
				else
				{
					System.out.println("enter the officer Id to promote: ");
					id=sc.nextInt();
					for(i=0;i<LevelOne.size();i++)
					{
						if(LevelThree.get(i).getID() == id)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						LevelFour.getAward(LevelThree.get(i),awardRecord); 
						/*
						 * TODO: implement promote function in level 3
						 */
					}
					else
					{
						System.out.println("Invalid details..Try again"); 

						/*
						 * TODO: Implement try again later in multiple parts in the driver code
						 */
					}
				}
			}
			break;
			case 3:
			{
				int searchCategory=0;
				System.out.println("Enter the start date from which the report should be generated: ");
				String sd;
				sd=sc.next();
				Date startDate =new SimpleDateFormat("dd/MM/yyyy").parse(sd);
				
				System.out.println("Enter the date till which the report should be generated: ");
				String ed;
				sd=sc.next();
				Date endDate =new SimpleDateFormat("dd/MM/yyyy").parse(sd);
				
				System.out.println("Enter the search category\1. Award report\n2. Transaction report\n3. Retirement report"
						+ "\n4.Promotion report\nEnter a valid choice: ");
				searchCategory = sc.nextInt();
				while(searchCategory<=0 || searchCategory>=5)
				{
					System.out.println("Enter valid choice: ");
					searchCategory=sc.nextInt();
				}
				
				LevelFour.getReport(startDate, endDate, searchCategory, awardRecord, promotionRecord);
			}
			break;
			case 4:
				break;
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
		/*
		 * TODO read content from files
		 */
		ArrayList<Manager> manager = new ArrayList<Manager>();
		ArrayList<levelThree> LevelThree = new ArrayList<levelThree>();
		ArrayList<levelFour> LevelFour = new ArrayList<levelFour>();
		ArrayList<levelOne> LevelOne = new ArrayList<levelOne>();
		ArrayList<levelTwo> LevelTwo = new ArrayList<levelTwo>();
		ArrayList<Veteran> veteran = new ArrayList<Veteran>();
		ArrayList<PromotionRecord> promotionRecord = new ArrayList<PromotionRecord>();
		ArrayList<AwardRecord> awardRecord = new ArrayList<AwardRecord>();
		Scanner sc = new Scanner(System.in);
		int choice=-1,level;
		char ch='N';
		String username,password;
		do
		{
			Driver.LoginMenu();
			choice=sc.nextInt();
			while(choice<=0 || choice>=4){
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice) {
				case 1:
				{
					int i=0;
					do 
					{
						System.out.println("Enter your username: ");
						username=sc.next();
						System.out.println("Enter your password: ");
						password=sc.next();
						boolean flag=false;
						for(i=0;i<manager.size();i++)
						{						
							if(username==manager.get(i).getUsername() && password == manager.get(i).getPassword())
							{
								
								flag=true;
								break;
							}
						}	
						if(flag) {
							System.out.println("logged in successfully!");
							Driver.ManagerView(manager.get(i));
							break;
						}
						else {
							System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
							ch=sc.next().charAt(0); 	
							
						}
					}while(ch=='Y');

				}
				break;
				case 2:
				{
					do
					{
						int i=0;
						System.out.println("Enter your username: ");
						username=sc.next();
						System.out.println("Enter your password: ");
						password=sc.next();
						System.out.println("Enter your ranking level: ");
						level=sc.nextInt();
						if(level==3)
						{
							boolean flag=false;
							for(i=0;i<LevelThree.size();i++)
							{						
								if(username==LevelThree.get(i).getUsername() && password == LevelThree.get(i).getPassword())
								{									
									flag=true;
									break;
								}
							}	
							if(flag) {
								System.out.println("logged in successfully!");
								Driver.Level3View(LevelThree.get(i), LevelOne, LevelTwo, promotionRecord);
								break;
							}
							else {
								System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
								ch=sc.next().charAt(0); 								
							}							
						}
						if(level==4)
						{
							boolean flag=false;
							for(i=0;i<LevelFour.size();i++)
							{						
								if(username==LevelFour.get(i).getUsername() && password == LevelFour.get(i).getPassword())
								{									
									flag=true;
									break;
								}
							}	
							if(flag) {
								System.out.println("logged in successfully!");
								Driver.Level4View(LevelFour.get(i), LevelOne, LevelTwo, LevelThree, promotionRecord, awardRecord);
								break;
							
							}
							else {
								System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
								ch=sc.next().charAt(0); 			
								/*
								 * TODO: Implement try again
								 */
							}							
						}
						
					}while(ch=='Y');

				}
				break;
				case 3:
					break;
				default:
					break;
			}  		
		}while(true);  	
		
	}

}
