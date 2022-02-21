package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("This account belongs to Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank axisbank = new AxisBank();
		axisbank.saving(10000);
		axisbank.fixed("MubasheerG");
		axisbank.deposit();

		BankInfo bankinfo = new BankInfo();
		bankinfo.deposit(5000);
	}

}
