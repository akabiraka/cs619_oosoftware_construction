import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class AbsoluteComparatorTest {

	@Test
	void test_absComparator() {
		List<Integer> integers = Arrays.asList(10, 2, -10, 1, -1, 3, 5, -7, -5, 4, -6);
//		Collections.sort(integers, (i1, i2) -> Integer.valueOf(Math.abs(i1)).compareTo(Integer.valueOf(Math.abs(i2))));
		Collections.sort(integers, new AbsoluteComparator());
		System.out.println(integers);
	}

	@Test
	void test_violationOfComparatorContract() {
		List<Integer> integers = Arrays.asList(10, 2, -10, 1, -1, 3, 5, -7, -5, 4, -6);
		Set<Integer> treeSet = new TreeSet<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		treeSet.addAll(integers);
		hashSet.addAll(integers);
		assertEquals(treeSet, hashSet);
		System.out.println(hashSet);
		System.out.println(treeSet);
		
		treeSet = new TreeSet<Integer>(
				(i1, i2) -> Integer.valueOf(Math.abs(i1)).compareTo(Integer.valueOf(Math.abs(i2))));
		treeSet.addAll(integers);
		assertNotEquals(treeSet, hashSet);
		System.out.println(hashSet);
		System.out.println(treeSet);
	}

}
