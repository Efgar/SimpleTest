package com.vp.algorithms;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.vp.algorithms.Utils;


public class UtilsTest {
	
	@Test
	@Ignore
	public void isPalindrome_itIs(){
		Assert.assertEquals(true, Utils.isPalindrome("ALA"));
		Assert.assertEquals(true, Utils.isPalindrome("SALAS"));
		Assert.assertEquals(true, Utils.isPalindrome("SUGUS"));
		Assert.assertEquals(true, Utils.isPalindrome("ANITALAVALATINA"));
	}
	
	@Test
	@Ignore
	public void isPalindrome_itIsNot(){
		Assert.assertEquals(false, Utils.isPalindrome("ALAS"));
		Assert.assertEquals(false, Utils.isPalindrome("SALAS1"));
		Assert.assertEquals(false, Utils.isPalindrome("UGUS"));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void isPalindrome_invalidInputNull(){
		Utils.isPalindrome(null);
	}
	
	
	
	@Test
	@Ignore
	public void isPrimeNumber_itIs(){
		Assert.assertEquals(true, Utils.isPrimeNumber(2));
		Assert.assertEquals(true, Utils.isPrimeNumber(3));
		Assert.assertEquals(true, Utils.isPrimeNumber(7));
	}
	
	@Test
	@Ignore
	public void isPrimeNumber_itIsNot(){
		Assert.assertEquals(false, Utils.isPrimeNumber(1));
		Assert.assertEquals(false, Utils.isPrimeNumber(6));
		Assert.assertEquals(false, Utils.isPrimeNumber(10));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void isPrimeNumber_invalid(){
		Utils.isPrimeNumber(-3);
	}
	
	
	
	@Test
	@Ignore
	public void camelCaseCount_valid(){
		Assert.assertEquals(4, Utils.camelCaseCount("thisAwesomeWordHasFour"));
		Assert.assertEquals(0, Utils.camelCaseCount("none"));
		Assert.assertEquals(16, Utils.camelCaseCount("thisAwesomeWordHasFourthisAwesomeWordHasFourthisAwesomeWordHasFourthisAwesomeWordHasFour"));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void camelCaseCount_invalidInputNull(){
		Utils.camelCaseCount(null);
		
	}
	
	
	
	@Test
	@Ignore
	public void smallestSum_valid(){
		Assert.assertEquals(3, Utils.smallestSum("1,2,3,4"));
		Assert.assertEquals(2, Utils.smallestSum("1,2,3,1"));
		Assert.assertEquals(5, Utils.smallestSum("10,2,3,4"));
		Assert.assertEquals(5, Utils.smallestSum("1,22,33,4"));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void smallestSum_invalidInputNull(){
		Utils.smallestSum(null);
	}
	

	
	
	@Test
	@Ignore
	public void sumDigits_valid(){
		Assert.assertEquals(2, Utils.sumDigits(12345));
		Assert.assertEquals(5, Utils.sumDigits(0));
		Assert.assertEquals(5, Utils.sumDigits(1));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void sumDigits_invalid(){
		Utils.sumDigits(-2);
	}
	
	
	
	@Test
	@Ignore
	public void fizzBuzz_valid(){
		Assert.assertEquals("1,2", Utils.fizzBuzz(2));
		Assert.assertEquals("1,2,fizz", Utils.fizzBuzz(3));
		Assert.assertEquals("1,2,fizz,4,buzz", Utils.fizzBuzz(5));
		Assert.assertEquals("1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizzbuzz", Utils.fizzBuzz(15));
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void fizzBuzz_invalid(){
		Utils.fizzBuzz(-1);
		
	}
}
