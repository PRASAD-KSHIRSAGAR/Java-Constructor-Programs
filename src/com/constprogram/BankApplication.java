package com.constprogram;

class AddAmount {
	int ammount = 50;

	public AddAmount() {
		this.ammount = 50;
		System.out.println("----------------------------");
		System.out.println("NO ammount is added");
		
		System.out.println("----------------------------");
	}

	public AddAmount(int Addammount) {
		this.ammount = 50 + Addammount;

	}

	public int TotalMoney() {
		return ammount;

	}

}

public class BankApplication {

	public static void main(String[] args) {
		AddAmount am = new AddAmount();
		System.out.println("Initial Ammount is $" + am.TotalMoney());
		System.out.println("----------------------------");

		AddAmount am2 = new AddAmount(20);
		System.out.println("Final Ammount is $" + am2.TotalMoney());

	}

}
