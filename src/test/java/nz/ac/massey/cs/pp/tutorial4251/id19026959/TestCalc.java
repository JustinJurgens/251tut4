package nz.ac.massey.cs.pp.tutorial4251.id19026959;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalc{

	@Test
	public void testAdd() {
		assertEquals(3, Calc.add(1, 2));
	}
	
	@Test
	public void testSub() {
		assertEquals(4, Calc.subtract(5, 1));
	}

}
