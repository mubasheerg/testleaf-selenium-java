package org.system;

public class StudentsInfo {
	public void id(int id) {
		System.out.println("Student id is " + id);
	}

	public void idName(int id, String name) {
		System.out.println("Student id is " + id + " and name is " + name);
	}

	public void emailPhone(String email, String phone) {
		System.out.println("Student email is " + email + " and phone number is " + phone);
	}

	public static void main(String[] args) {
		StudentsInfo info = new StudentsInfo();
		info.id(101);
		info.idName(101, "MubasheerG");
		info.emailPhone("mubasheer1401@gmail.com", "9791843028");
	}
}
