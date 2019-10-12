package com.ch8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class OrderedListUnitTests {

	@Test
	void test_addE1() {
		OrderedList list = new OrderedList();
		list.addE1(1);
		list.addE1(2);
		assertThrows(IllegalArgumentException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				list.addE1(1);
			}
		});
		System.out.println(list.toString());
	}

}
