package com.oa.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.oa.SpecialUser;
import com.oa.User;

class TestSpecialUser {

	@Test
	public void testSymmetricity() {
		User user = new User("kabir");
		User spUser = new SpecialUser("kabir", 1);
//		System.out.println(user.equals(spUser)); // true
//		System.out.println(spUser.equals(user)); // false
		assertEquals(user.equals(spUser), !spUser.equals(user)); // violating symmetric property
	}

}
