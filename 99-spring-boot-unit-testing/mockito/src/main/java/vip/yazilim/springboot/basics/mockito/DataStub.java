package vip.yazilim.springboot.basics.mockito;

public class DataStub implements IDataService {

	@Override
	public int[] getAllData() {
		return new int[] { 21, 10, 5, 7 };
	}

}