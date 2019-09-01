package com.oa.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.oa.User;
class TestUser {
	
	@Test 
	public void testNonNullReference() {
		User u1 = new User("Kabir");
		assertEquals(u1.equals(null), false);
	}
	
	@Test
	public void testNullReference() {
		User nullUser = new User(null);
		User u1 = new User("Kabir");
		System.out.println(nullUser.equals(u1));
		System.out.println(u1.equals(nullUser));
		assertEquals(u1.equals(nullUser), false);
	}
	
	@Test
	public void testReflexivity() {
		User u1 = new User(null);
		assertEquals(u1.equals(u1), false);
	}

}
