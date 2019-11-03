package nineA;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import nineB.IntSet;
import nineB.SubIntSet;

class UnitTests {

	@Test
	void test_ListkovSubstitutionPrincipal() {
		Point point = new Point(1, 2);
		ColorPoint colorPoint = new ColorPoint(1, 2, Color.BLACK);
		System.out.println(colorPoint.equals(point));
		System.out.println(point.equals(colorPoint));
	}

	@Test
	void test_violating_equals_symmetric_contract() {
		Point point = new Point(1, 2);
		ColorPoint colorPoint = new ColorPoint(1, 2, Color.BLACK);
		System.out.println(point.equals(colorPoint));
		System.out.println(colorPoint.equals(point));
		assertFalse(point.equals(colorPoint) && colorPoint.equals(point));
	}

	@Test
	void test() {
		ColorPoint2ndAttempt colorPoint1 = new ColorPoint2ndAttempt(1, 2, Color.BLACK);
		Point point = new Point(1, 2);
		ColorPoint2ndAttempt colorPoint2 = new ColorPoint2ndAttempt(1, 2, Color.RED);
		System.out.println(colorPoint1.equals(point));
		System.out.println(point.equals(colorPoint2));
		System.out.println(colorPoint1.equals(colorPoint2));
	}
	
	@Test
	void test_withoutOverridingHashCode(){
		IntSet xIntSet = new IntSet();
		IntSet yIntSet = new IntSet();
		System.out.println(xIntSet.equals(yIntSet));
		System.out.println(xIntSet.hashCode());
		System.out.println(yIntSet.hashCode());
		Map<IntSet, String> map = new HashMap<IntSet, String>();
		map.put(xIntSet, "x int set");
		System.out.println(map.get(yIntSet));
		
		IntSet zIntSet = new IntSet();
		System.out.println(xIntSet.equals(zIntSet));
		zIntSet.put(100);
		System.out.println(xIntSet.equals(zIntSet));
		System.out.println(map.get(zIntSet));
		
		xIntSet.put(-1);
		xIntSet.put(1);
		System.out.println(xIntSet);
		System.out.println(xIntSet.hashCode());
		
		yIntSet.put(-2);
		yIntSet.put(2);
		System.out.println(yIntSet);
		System.out.println(yIntSet.hashCode());
		
		System.out.println(xIntSet.equals(yIntSet));
		
	}
	
	
	@Test
	void test_cannotDoNewInClone() throws CloneNotSupportedException{
		SubIntSet subIntSet = new SubIntSet("name");
//		assertThrows(ClassCastException.class, ()->subIntSet.clone());
//		SubIntSet subIntSet2 = subIntSet.clone();
		assertTrue(subIntSet.clone().equals(subIntSet));
	}

}
