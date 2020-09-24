package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculatorTest {

	@Test
	public void testSimpleInterest1() {
		InterestCalculator calc = new InterestCalculator();
		double amt = calc.simpleInterest(100000, 4, 12);
		assertEquals(4000.0, amt,0.01);
	}

}
