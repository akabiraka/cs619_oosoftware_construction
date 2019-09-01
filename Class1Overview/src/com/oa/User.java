package com.oa;


public class User {
	private String name;
	public User (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User)) return false;
		if (((User)obj).name == null) return false; // this line solve the problem
		//System.out.println(this.name);
		//System.out.println(((User)obj).name);
		/*
		 * if(((User)obj).name == this.name) return true; else return false; // bad things. should not do
		 */  
		return ((User)obj).name.equals(this.name); // null.equals() makes the problem
	}

}

/*
 * Hi. I think everyone understands it except me. In class, we learned class
 * User violates non-null object reference implementation, which means User u1 =
 * new User("yourName"); u1.equals(null) should return false which it does as
 * contract states. Then how are we actually violating? The problem occurs when
 * User nullUser = new Use(null); u1.equals(nullUser); // having null pointer
 * exception But not for nullUser.equals(u1); // it returns false So it is
 * having trouble for null attribute value, not for null object reference. Or
 * does non-null object reference indicate that any of the attributes of the
 * object can not be null?
 */