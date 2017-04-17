package pas;

import org.junit.*;
import static org.junit.Assert.*;

public class Tester {
	private Calculator calculator= new Calculator();
	private Man man=new Man(21,56,167);
	
	@Test
	public void testIdealW() throws Exception
	{
		assertEquals(57.0,calculator.IdealW(167.0),0.1);
	}
	
	@Test
	public void testBMT() throws Exception
	{
		assertEquals(20.07960127648894,calculator.BMT(man),0.0001);
	}

}
