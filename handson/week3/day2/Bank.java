package week3.day2;

public class Bank extends SBI implements PNB, Cibil {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.bankBalance();
		bank.cibilScore();
		bank.creditScore();
		bank.maximumLoanAmount();
		bank.minimumBalance();
		bank.ITLoan();
	}

	public void creditScore() {
		System.out.println("92%");
	}

	public void minimumBalance() {
		System.out.println("Rs:1000");
	}

	public void cibilScore() {
		System.out.println("92.3%");
	}

	public void bankBalance() {
		System.out.println("Rs:85223.36");
	}

	public void maximumLoanAmount() {
		System.out.println("Rs:1000000");
	}
}
