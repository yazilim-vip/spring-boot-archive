package vip.yazilim.springboot.basics.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoApplicationTests {
	
	@Test
	public void testFindMaxNumber() {
		IDataService mockDataService = mock(IDataService.class);
		when(mockDataService.getAllData()).thenReturn(new int[] {23,43,0,2,9});
		SomeBusinessService sbs = new SomeBusinessService(mockDataService);
		
		int actual = sbs.findTheGreatestNumber();
		assertEquals(43, actual);
	}

}
