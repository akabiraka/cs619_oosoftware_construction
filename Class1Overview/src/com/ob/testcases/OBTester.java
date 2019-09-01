package com.ob.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ob.OB;

class OBTester {
	
	public void setup() {
		
	}

	@Test
	public void min_HappyPaths_minValue() {
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		assertEquals(OB.min(intList), 1);
		intList = Arrays.asList(2, 1, 3);
		assertEquals(OB.min(intList), 1);
		intList = Arrays.asList(2, 3, 1);
		assertEquals(OB.min(intList), 1);
	}

	@Test
	public void min_testNullList_ThrowsNPE() {
		List<Integer> list = null;
		assertThrows(NullPointerException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				OB.min(list);
			}
		});
	}
	
	@Test
	public void min_testNullInList_ThrowsNPE() {
		List<Integer> list = Arrays.asList(1, null, 3);
		assertThrows(NullPointerException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				OB.min(list);
			}
		});
	}
	
	@Test
	public void min_testEmptyList_ThrowsIAE() {
		List<Integer> list = new ArrayList<Integer>();
		assertThrows(IllegalArgumentException.class, new Executable() {			
			@Override
			public void execute() throws Throwable {
				OB.min(list);
			}
		});
	}
	
	@Test
	public void min_testClassCasting_CCE() {
//		List list = new ArrayList();
//		list.add(1);
//		list.add("name");
//		list.add(2.3);
		List list = Arrays.asList(1, "name", 3.1416);
		assertThrows(ClassCastException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				OB.min(list);
			}
		});
	}
}
