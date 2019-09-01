package com.oa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("yourname");
		User nullUser = new User(null);
		//System.out.println(u1.equals(nullUser)); // null pointer exception
		//System.out.println(nullUser.equals(u1)); // false
		//System.out.println(nullUser.equals(nullUser)); //null pointer exception
	}

}
