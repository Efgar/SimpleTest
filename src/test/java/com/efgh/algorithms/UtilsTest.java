package com.efgh.algorithms;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static com.efgh.algorithms.Utils.*;


public class UtilsTest {

    @Test
    @Ignore
    public void isPalindrome_itIs() {
        Assert.assertTrue(isPalindrome("ALA"));
        Assert.assertTrue(isPalindrome("SALAS"));
        Assert.assertTrue(isPalindrome("SUGUS"));
        Assert.assertTrue(isPalindrome("ANITALAVALATINA"));
    }

    @Test
    @Ignore
    public void isPalindrome_itIsNot() {
        Assert.assertFalse(isPalindrome("ALAS"));
        Assert.assertFalse(isPalindrome("SALAS1"));
        Assert.assertFalse(isPalindrome("UGUS"));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void isPalindrome_invalidInputNull() {
        isPalindrome(null);
    }

    @Test
    @Ignore
    public void isPrimeNumber_itIs() {
        Assert.assertTrue(isPrimeNumber(2));
        Assert.assertTrue(isPrimeNumber(3));
        Assert.assertTrue(isPrimeNumber(7));
    }

    @Test
    @Ignore
    public void isPrimeNumber_itIsNot() {
        Assert.assertFalse(isPrimeNumber(1));
        Assert.assertFalse(isPrimeNumber(6));
        Assert.assertFalse(isPrimeNumber(10));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void isPrimeNumber_invalid() {
        isPrimeNumber(-3);
    }


    @Test
    @Ignore
    public void camelCaseCount_valid() {
        Assert.assertEquals(4, Utils.camelCaseCount("thisAwesomeWordHasFour"));
        Assert.assertEquals(0, Utils.camelCaseCount("none"));
        Assert.assertEquals(16, Utils.camelCaseCount("thisAwesomeWordHasFourthisAwesomeWordHasFourthisAwesomeWordHasFourthisAwesomeWordHasFour"));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void camelCaseCount_invalidInputNull() {
        Utils.camelCaseCount(null);

    }


    @Test
    @Ignore
    public void smallestSum_valid() {
        Assert.assertEquals(3, smallestSum("1,2,3,4"));
        Assert.assertEquals(2, smallestSum("1,2,3,1"));
        Assert.assertEquals(5, smallestSum("10,2,3,4"));
        Assert.assertEquals(5, smallestSum("1,22,33,4"));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void smallestSum_invalidInputNull() {
        smallestSum(null);
    }


    @Test
    @Ignore
    public void sumDigits_valid() {
        Assert.assertEquals(15, sumDigits(12345));
        Assert.assertEquals(0, sumDigits(0));
        Assert.assertEquals(1, sumDigits(1));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void sumDigits_invalid() {
        sumDigits(-2);
    }


    @Test
    @Ignore
    public void fizzBuzz_valid() {
        Assert.assertEquals("1,2", fizzBuzz(2));
        Assert.assertEquals("1,2,fizz", fizzBuzz(3));
        Assert.assertEquals("1,2,fizz,4,buzz", fizzBuzz(5));
        Assert.assertEquals("1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizzbuzz", fizzBuzz(15));
    }

    @Test(expected = RuntimeException.class)
    @Ignore
    public void fizzBuzz_invalid() {
        fizzBuzz(-1);
    }
}
