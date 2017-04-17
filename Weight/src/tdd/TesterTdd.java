package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TesterTdd {
	
	@Test
	public void CreateMan(){
		new Man(57,167,21);
	}
	
	@Test
	public void IdealWight() 
	{
		Man m=new Man(57,167,21);
		assertEquals(57.0,m.getIW(m.h),0.1);
			
	}
	
	@Test
	public void IdealWight2() 
	{
		Man m2=new Man(74,150,21);
		assertEquals(74.0,m2.getIW(m2.h),0.1);
	}
	
	@Test
	public void BMT()
	{
		Man m=new Man(57,167,21);
		assertEquals(20.07960127648894,m.getBMT(m.w,m.h),0.0001);
	}

	@Test
	public void C()
	{
		Man m=new Man(57,167,21);
		assertEquals(1115.0,m.getC(m.w,m.h,m.old),0.0001);
	}
}
