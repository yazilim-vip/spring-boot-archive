package vip.yazilim.springboot.basics.mockito;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessService {

	@Autowired
	private IDataService dataService;
	
	public SomeBusinessService(IDataService dataService) {
		this.dataService = dataService;
	}

	public int findTheGreatestNumber() {
		int max = Integer.MIN_VALUE;
		for(int v : dataService.getAllData()) {
			if(v > max) {
				max = v;
			}
		}
		return max;
	}
}
