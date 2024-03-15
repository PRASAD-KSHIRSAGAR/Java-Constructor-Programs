package com.constprogram;

class Programming
{
	String Str;
	public Programming(String str)
	{
		
		if(str==null || str.isEmpty())
		{
			System.out.println("I love programming languages");
		}
		else
		{
			this.Str=str;
			System.out.println("I love "+str);
		}
	}
//	public void showData()
//	{
//		//System.out.println(Str);
//	}
}



public class programminAPPlication {

	public static void main(String[] args) {
		
		Programming pro=new Programming(".Net");
		//pro.showData();
	}

}
