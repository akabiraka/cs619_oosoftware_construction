package Inclass7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class UnitTests {

	@Test
	void test_ReverseComparator() {
		ReverseComparator x = new ReverseComparator();
		assertEquals(0, x.compare(5, 5));
		assertEquals(1, x.compare(1, 5));
		assertEquals(-1, x.compare(5, 1));
		assertEquals(1, x.compare("abc", "bcd"));
		assertThrows(ClassCastException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				x.compare(5, "d");
			}
		});

	}

	@Test
	void test_AbsoluteValuesComparator() {
		AbsoluteValuesComparator comparator = new AbsoluteValuesComparator();
		assertEquals(0, comparator.compare(1, -1));
		assertEquals(1, comparator.compare(-2, 1));
		assertEquals(1, comparator.compare(2, 1));
		assertEquals(-1, comparator.compare(1, -2));
		assertEquals(-1, comparator.compare(1, 2));
		assertThrows(NullPointerException.class, () -> comparator.compare(1, null));
//		assertThrows(NullPointerException.class, new Executable() {
//			@Override
//			public void execute() throws Throwable {
//				// TODO Auto-generated method stub
//				comparator.compare(1, null);
//			}
//		});
	}

	@Test
	void test_EvensB4OddsComparator() {
		EvensB4OddsComparator comparator = new EvensB4OddsComparator();
		assertEquals(0, comparator.compare(-3, -3));
		assertEquals(1, comparator.compare(-3, 8));
		assertEquals(-1, comparator.compare(-3, -1));
		assertEquals(-1, comparator.compare(-5, -3));
		assertEquals(1, comparator.compare(-5, 2));
	}

	@Test
	void test_reverse() {
		List<Integer> integers = Arrays.asList(10, 4, -1, 2);
		Collections.sort(integers, (i1, i2) -> -i1.compareTo(i2));
//		Collections.sort(integers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer arg0, Integer arg1) {
//				// TODO Auto-generated method stub
//				return -arg0.compareTo(arg1);
//			}
//		});
		System.out.println(integers);
	}

	@Test
	void test_absolute() {
		List<Integer> integers = Arrays.asList(10, -10, 1, -1, 3, 5, -7, -5);
		Collections.sort(integers, (i1, i2) -> Integer.valueOf(Math.abs(i1)).compareTo(Integer.valueOf(Math.abs(i2))));
//		Collections.sort(integers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer arg0, Integer arg1) {
//				// TODO Auto-generated method stub
//				return Integer.valueOf(Math.abs(arg0)).compareTo(Integer.valueOf(Math.abs(arg1)));
//			}
//		});
		System.out.println(integers);
	}

	@Test
	void test_evensB4Odds() {
		List<Integer> integers = Arrays.asList(1, 2, -2, 3, -3, 4, 4, 5);
		Collections.sort(integers, (e1, e2) -> {
			if (Math.abs(e1) % 2 == 0 && Math.abs(e2) % 2 == 1) {
				return -1;
			} else if (Math.abs(e1) % 2 == 1 && Math.abs(e2) % 2 == 0) {
				return 1;
			}
			return e1.compareTo(e2);
		});
//		Collections.sort(integers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer e1, Integer e2) {
//				// TODO Auto-generated method stub
//				if (Math.abs(e1) % 2 == 0 && Math.abs(e2) % 2 == 1) {
//					return -1;
//				} else if (Math.abs(e1) % 2 == 1 && Math.abs(e2) % 2 == 0) {
//					return 1;
//				}
//				return e1.compareTo(e2);
//			}
//		});
		System.out.println(integers);
	}

	@Test
	void test_sortingWordsOnLength() {
		List<String> words = new ArrayList<String>();
		words.add("asfg");
		words.add("c");
		words.add("a");
		words.add("alhumdulillah");
//		Collections.sort(words, new Comparator<String>() {
//
//			@Override
//			public int compare(String arg0, String arg1) {
//				// TODO Auto-generated method stub
//				return Integer.compare(arg0.length(), arg1.length());
//			}
//		});
//		Collections.sort(words, (w1, w2) -> Integer.compare(w1.length(), w2.length()));
//		Collections.sort(words, Comparator.comparingInt(String::length));
		words.sort(Comparator.comparing(String::length));
		System.out.println(words);
	}

}
