package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("It is 24'inch desktop");
	}

	public static void main(String[] args) {
		Desktop computer = new Desktop();
		computer.computerModel();
		computer.desktopSize();
	}
}
