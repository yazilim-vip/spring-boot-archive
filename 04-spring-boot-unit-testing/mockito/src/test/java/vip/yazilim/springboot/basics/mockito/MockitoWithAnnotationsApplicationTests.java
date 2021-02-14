package vip.yazilim.springboot.basics.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MockitoWithAnnotationsApplicationTests {
	
	@Mock
	private IDataService dataService;
	
	@InjectMocks
	private SomeBusinessService businessService;
	
	
	@Test
	public void testFindMaxNumber() {
		when(dataService.getAllData()).thenReturn(new int[] {23,50,0,2,9});
		int actual = businessService.findTheGreatestNumber();
		assertEquals(23, actual);
	}

}
