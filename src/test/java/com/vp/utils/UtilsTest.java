package com.vp.utils;

import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {
	
	@Test
	public void isPalindrome_itIs(){
		Assert.assertEquals(true, Utils.isPalindrome("ALA"));
		Assert.assertEquals(true, Utils.isPalindrome("SALAS"));
		Assert.assertEquals(true, Utils.isPalindrome("SUGUS"));
		Assert.assertEquals(true, Utils.isPalindrome("ANITALAVALATINA"));
	}
	
	@Test
	public void isPalindrome_itIsNot(){
		Assert.assertEquals(false, Utils.isPalindrome("ALAS"));
		Assert.assertEquals(false, Utils.isPalindrome("SALAS1"));
		Assert.assertEquals(false, Utils.isPalindrome("UGUS"));
	}
	
	@Test(expected=RuntimeException.class)
	public void isPalindrome_invalidInputNull(){
		Utils.isPalindrome(null);
	}
}
