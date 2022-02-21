package org.sports;

public class Sports {
	public void acheiver(String name, int medalCount) {
		System.out.println("The name of the acheiver is " + name + " and the medal count is " + medalCount);
	}

	public void acheiver(String country, String sportName, int rank) {
		System.out.println("The country of acheiver is " + country + " and the sports is " + sportName
				+ " adn the rank is " + rank);
	}

	public void acheiver(float weight, int height, long contactNo) {
		System.out.println("The weight of the acheiver is " + weight + " and the height is " + height
				+ " and the contact number is " + contactNo);
	}

	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println("The tournament name is " + tournamentName + " and the prize money is " + prizeMoney);
	}

	public static void main(String[] args) {
		Sports sport = new Sports();
		sport.acheiver("MubasheerG", 14);
		sport.acheiver("India", "Running", 1);
		sport.acheiver(58, 171, 9791843028L);
		sport.acheiver("Olympics", 5000000000L);
	}
}
