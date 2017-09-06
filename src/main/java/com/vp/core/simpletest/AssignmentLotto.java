package com.vp.core.simpletest;

import java.util.Random;

public class AssignmentLotto extends LottosParent implements Lotto{
	
	public AssignmentLotto(){
		addLottoValue("HelloWorld");
		addLottoValue("camelCaseCount");
		addLottoValue("isPalindrome");
		addLottoValue("isPrimeNumber");
		addLottoValue("smallestSum");
		addLottoValue("sumDigits");
		addLottoValue("fizzBuzz");
	}
	
	/**
	 * This method returns the lotto value to be used
	 * 
	 * @return String containing the value to be returned when calling the lottery
	 */
	private String getAssignment(){
		Random rnd = new Random();
		return this.getLottoValue(1 + rnd.nextInt(this.getLottoSize() - 2));
	}
}
