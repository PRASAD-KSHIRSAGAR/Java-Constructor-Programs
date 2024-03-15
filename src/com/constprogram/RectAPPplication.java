package com.constprogram;

 class RectAPP
{
	 int length;
	 int breadth;
	
	
	public RectAPP() {
		
		int length=0;
		int breadth=0;
		
	}
	
	public RectAPP(int no,int no2)
	{
		this.length=no;
		this.breadth=no2;
	}
	
	public RectAPP(int no)
	{
		this.length=no;
		this.breadth=no;
	}
	
	public int showData()
	{
		
		return length*breadth;
	}

}
public class RectAPPplication
{
	public static void main(String[] args)
	{
		RectAPP x=new RectAPP();
		x.showData();
        System.out.println("Area of rectangle with no parameters: " + x.showData());

		
		RectAPP x1=new RectAPP(5,3);
		x1.showData();
        System.out.println("Area of rectangle with no parameters: " + x1.showData());

		
		RectAPP x3=new RectAPP(78);
		x3.showData();
        System.out.println("Area of rectangle with no parameters: " + x3.showData());

		
		
		
		 
		
	}


}