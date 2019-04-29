package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.WeightConverter;

public class WeightConverterTest {
	private WeightConverter weightConverter;
	
	@Before
	public void setup()
	{
		weightConverter = new WeightConverter();
	}
	
	@Test
	public void convertedWeightFromKgToLbsTest()
	{
		float weightinKgs = 50f;
		Assert.assertEquals("Checking if the conversion was successful", 111.15f,	weightConverter.convertedWeightFromKgToLbs(weightinKgs), 0.0001f);
	}
	
	@Test
	public void convertedWeightFromLbsToKgsTest()
	{
		float weightinlbs = 88.92f;
		Assert.assertEquals("Checking if the conversion was successful", 40f,	weightConverter.convertedWeightFromLbsToKgs(weightinlbs), 0.0001f);
	}

}
