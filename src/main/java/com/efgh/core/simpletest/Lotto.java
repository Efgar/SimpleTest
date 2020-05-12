package com.efgh.core.simpletest;

public interface Lotto {
	
	/**
	 * This method shall return the lotto value to be used
	 * 
	 * This should never ever return an exception! if there is one, return instead "Too Easy"
	 * 
	 * @return String containing the value to be returned when calling the lottery
	 */
	public abstract String getRandomLottoValue();
}
