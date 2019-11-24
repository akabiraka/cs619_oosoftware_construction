package com.ch6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.ch6.Text.Style;

class UnitTests {

	@Test
	void test() {
		IntEnumPattern enumPattern = new IntEnumPattern();
		enumPattern.isFUJIApple(Apple.FUJI);
	}

	@Test
	void test_Planet() {
		double marsMass = Planet.EARTH.JUPITER.MARS.mass();
		System.out.println(marsMass);
		System.out.println(Planet.values()[0]);
	}

	@Test
	void test_Operation() {
		System.out.println(Operation.PLUS.apply(1, 2));
		System.out.println(Operation.XXX.apply(1, 2));
		double x = 1;
		double y = 2;
		for (Operation op : Operation.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
	
	@Test
	void test_Ensemble() {
		for (Ensemble ensemble : Ensemble.values()) {
			System.out.println(ensemble.numberOfMusicians());
		}
	}
	
	@Test
	void test_Text() {
		Text text = new Text();
//		text.applyStyles(Text.STYLE_BOLD | Text.STYLE_UNDERLINE);
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
		System.out.println(Style.ITALIC.compareTo(Style.BOLD));
	}

}
