package demo.helloworld;

import static org.junit.Assert. * ;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class MainTest {

	 @ Test
	public void test() {
		assertEquals("Hello! Have a great weekend", Main.printOne());
		
		@RunWith(Parameterized.class) class JunitAdditionTest {

			private int expected;
			private int first;
			private int second;

			@Parameters
			public Collection<Integer[]> addedNumbers() {
				return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
						{ 7, 3, 4 }, { 9, 4, 5 }, });
			}

			@Test
			public void sum() {
				Main1 add1 = new Main1();
				System.out.println("Addition with parameters : " + first + " and "
						+ second);
				assertEquals(expected, Main1.add());
			}
		}

		}

}