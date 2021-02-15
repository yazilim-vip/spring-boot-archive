package vip.yazilim.springboot.basics.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitApplicationTests {

	@Test
	public void testFindMaxNumber() {
		IDataService ds = new DataStub();
		SomeBusinessService sbs = new SomeBusinessService(ds);
		int actual = sbs.findTheGreatestNumber();
		assertEquals(21, actual);
	}

}
