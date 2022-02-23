package org.computer;

public class PC extends Laptop {
	public void getSystemInfo() {
		System.out.println("The OS of PC is iOS");
	}

	public static void main(String[] args) {
		PC pc = new PC();
		pc.getSystemInfo();

	// used to call the method in laptop class	
	//	Laptop laptop = new Laptop();
	//	laptop.getSystemInfo();
	}
}
