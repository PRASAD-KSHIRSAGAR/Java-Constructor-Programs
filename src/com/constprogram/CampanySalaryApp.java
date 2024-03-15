package com.constprogram;

import java.util.*;
public class CampanySalaryApp {
	private String Name;
	private int id;
	private String contact;
	private int PresentDay;
	private int PerDaySal;
	int sal=0;
	
	
	public CampanySalaryApp(String name, int id, String contact, int presentDay, int perDaySal) 
	{
		this.Name = name;
		this.id = id;
		this.contact = contact;
		this.PresentDay = presentDay;
		this.PerDaySal = perDaySal;
	}
	
	public void CalculateSal()
	{
		this.sal=PresentDay*PerDaySal;
	}
	void show()
	{
		System.out.println("EMP Name "+Name+"\t EMP Id "+id+"\t Contact "+contact+"\t total Present days "+PresentDay+"\t Per day salary "+PerDaySal);
		
	}
	

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String Name=xyz.nextLine();
		
		System.out.println("Enter emp ID");
		int id=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter the Contact");
		String contact=xyz.nextLine();
		
		
		System.out.println("Present Days");
		int presentday=xyz.nextInt();
		
		System.out.println("Per day salary");
		int perDaySal=xyz.nextInt();
		
		CampanySalaryApp cm=new CampanySalaryApp(Name, id, contact, presentday, perDaySal);
		 
		cm.show();
		cm.CalculateSal();
		
		System.out.println("total sal "+cm.sal);
		

	}

}
