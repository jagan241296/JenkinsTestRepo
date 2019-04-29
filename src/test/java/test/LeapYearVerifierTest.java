package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.LeapYearVerifier;

public class LeapYearVerifierTest {

	private LeapYearVerifier leapYearVerifier;
	
	@Before
	public void setup()
	{
		leapYearVerifier = new LeapYearVerifier();
	}
	@Test
	public void isGivenYearIsLeapYearTest() {
		Assert.assertTrue("Check if Year is leap year", leapYearVerifier.isGivenYearIsLeapYear(1996));
	}
	
	@Test
	public void isGivenYearIsNotLeapYearTest() {
		Assert.assertFalse("Check if Year is  NOT leap year", leapYearVerifier.isGivenYearIsLeapYear(1997));
	}

}
