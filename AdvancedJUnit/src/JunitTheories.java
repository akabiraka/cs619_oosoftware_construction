import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class JunitTheories {

	@DataPoints
	public static List<Integer> values = Arrays.asList(1, 2, 3);
	@DataPoints
	public static List<String> str = Arrays.asList("ant", "bee", "cat");
	
	@Theory
	public void test(int a, String b) {
		System.out.println(a + " " + b);
	}
}
