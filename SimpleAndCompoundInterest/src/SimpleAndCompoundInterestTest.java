import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleAndCompoundInterestTest {

	@Test
	public void testSimpleInterest() {
		SimpleAndCompoundInterest simple = new SimpleAndCompoundInterest(10000,5,5);
		assertEquals(2500,simple.SimpleInterest(),2500-simple.SimpleInterest());
		simple = new SimpleAndCompoundInterest(3000,1,7);
		assertEquals(210,simple.SimpleInterest(),210-simple.SimpleInterest());
	}
	@Test
	public void testCompoundInterest(){
		SimpleAndCompoundInterest compound = new SimpleAndCompoundInterest(1200,2,5.4);
		assertEquals(1333.099243,compound.CompoundInterest(),1333.099243-compound.CompoundInterest());
		compound = new SimpleAndCompoundInterest(100,2,10);
		assertEquals(210.00000000000023,compound.CompoundInterest(),210.00000000000023-compound.CompoundInterest());		
	}

}
