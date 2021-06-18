package batteryreceiver;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import batteryevaluator.BatteryPropertyEvaluator;

public class TestBatteryPropertyReceiver {
	BatteryPropertyEvaluator propertyEvaluator;
	List<Float> socList;
	List<Float> emptySocList;
	List<Float> nullSocList;
	List<Float> socListWith3Items;
	
	List<Float> chargeRateList;
	List<Float> emptyChargeRateList;
	List<Float> nullChargeRateList;
	List<Float> chargeRateListWith3Items;
	
 	@Before
	public void setup() {
 		propertyEvaluator = new BatteryPropertyEvaluator();
 		
 		socList = new ArrayList<Float>();
 		socList.add(78.66838f);
 		socList.add(52.88753f);
 		socList.add(44.716034f);
 		socList.add(74.336235f);
 		socList.add(76.90123f);
 		
 		emptySocList = new ArrayList<Float>();
 		nullSocList = null;
 		
 		socListWith3Items = new ArrayList<Float>();
 		socListWith3Items.add(78.66838f);
 		socListWith3Items.add(52.88753f);
 		socListWith3Items.add(44.716034f);
 		
 		
 		chargeRateList = new ArrayList<Float>();
 		chargeRateList.add(0.12779322f);
 		chargeRateList.add(0.572595f);
 		chargeRateList.add(0.65613645f);
 		chargeRateList.add(0.024554348f);
 		chargeRateList.add(0.72287005f);
 		
 		emptyChargeRateList = new ArrayList<Float>();
 		nullChargeRateList = null;
 		
 		chargeRateListWith3Items = new ArrayList<Float>();
 		chargeRateListWith3Items.add(0.12779322f);
 		chargeRateListWith3Items.add(0.572595f);
 		chargeRateListWith3Items.add(0.65613645f);
 		
	}
	
	
	@Test
	public void givenSocListisNull_whenEvaluatingMaxOfSoc_thenReturnZero() {
		Float maxSoc = propertyEvaluator.getMaxSocValue(nullSocList);
		assertEquals(Float.valueOf(0), maxSoc);
	}
	
	@Test
	public void givenSocListisNull_whenEvaluatingMinOfSoc_thenReturnZero() {
		Float minSoc = propertyEvaluator.getMinSocValue(nullSocList);
		assertEquals(Float.valueOf(0), minSoc);
	}
	
	@Test
	public void givenSocListisNull_whenEvaluatingAvgOfSoc_thenReturnZero() {
		Double averageSoc = propertyEvaluator.getAverageOfSocList(nullSocList);
		assertEquals(Double.valueOf(0), averageSoc);
	}
	
	@Test
	public void givenSocListisEmpty_whenEvaluatingMaxOfSoc_thenReturnZero() {
		Float maxSoc = propertyEvaluator.getMaxSocValue(emptySocList);
		assertEquals(Float.valueOf(0), maxSoc);
	}
	
	@Test
	public void givenSocListisEmpty_whenEvaluatingMinOfSoc_thenReturnZero() {
		Float minSoc = propertyEvaluator.getMinSocValue(emptySocList);
		assertEquals(Float.valueOf(0), minSoc);
	}
	
	@Test
	public void givenSocListisEmpty_whenEvaluatingAvgOfSoc_thenReturnZero() {
		Double averageSoc = propertyEvaluator.getAverageOfSocList(emptySocList);
		assertEquals(Double.valueOf(0), averageSoc);
	}
	
	@Test
	public void givenSocList_whenEvaluatingMaxOfSoc_thenReturnMax() {
		Float maxSoc = propertyEvaluator.getMaxSocValue(socList);
		assertEquals(Float.valueOf(78.66838f), maxSoc);
	}
	
	@Test
	public void givenSocList_whenEvaluatingMinOfSoc_thenReturnMin() {
		Float minSoc = propertyEvaluator.getMinSocValue(socList);
		assertEquals(Float.valueOf(44.716034f), minSoc);
	}
	
	@Test
	public void givenSocList_whenEvaluatingAvgOfSoc_thenReturnAverage() {
		Double averageSoc = propertyEvaluator.getAverageOfSocList(socList);
		assertEquals(Math.round(66), Math.round(averageSoc));
	}
	
	
	@Test
	public void givenChargeRateListisNull_whenEvaluatingMaxOfChargeRate_thenReturnZero() {
		Float maxChargeRate = propertyEvaluator.getMaxChargeRateValue(nullChargeRateList);
		assertEquals(Float.valueOf(0), maxChargeRate);
	}
	
	@Test
	public void givenChargeRateListisNull_whenEvaluatingMinOfChargeRate_thenReturnZero() {
		Float minChargeRate = propertyEvaluator.getMinChargeRateValue(nullChargeRateList);
		assertEquals(Float.valueOf(0), minChargeRate);
	}
	
	@Test
	public void givenChargeRateListisNull_whenEvaluatingAvgOfChargeRate_thenReturnZero() {
		Double averageChargeRate = propertyEvaluator.getAverageOfChargeRateList(nullChargeRateList);
		assertEquals(Double.valueOf(0), averageChargeRate);
	}
	
	@Test
	public void givenChargeRateListisEmpty_whenEvaluatingMaxOfChargeRate_thenReturnZero() {
		Float maxChargeRate = propertyEvaluator.getMaxChargeRateValue(emptyChargeRateList);
		assertEquals(Float.valueOf(0), maxChargeRate);
	}
	
	@Test
	public void givenChargeRateListisEmpty_whenEvaluatingMinOfChargeRate_thenReturnZero() {
		Float minChargeRate = propertyEvaluator.getMinChargeRateValue(emptyChargeRateList);
		assertEquals(Float.valueOf(0), minChargeRate);
	}
	
	@Test
	public void givenChargeRateListisEmpty_whenEvaluatingAvgOfChargeRate_thenReturnZero() {
		Double averageChargeRate = propertyEvaluator.getAverageOfChargeRateList(emptyChargeRateList);
		assertEquals(Double.valueOf(0), averageChargeRate);
	}
	
	@Test
	public void givenChargeRateList_whenEvaluatingMaxOfChargeRate_thenReturnMax() {
		Float maxChargeRate = propertyEvaluator.getMaxChargeRateValue(chargeRateList);
		assertEquals(Float.valueOf(0.72287005f), maxChargeRate);
	}
	
	@Test
	public void givenChargeRateList_whenEvaluatingMinOfChargeRate_thenReturnMin() {
		Float minChargeRate = propertyEvaluator.getMinChargeRateValue(chargeRateList);
		assertEquals(Float.valueOf(0.024554348f), minChargeRate);
	}
	
	@Test
	public void givenChargeRateList_whenEvaluatingAvgOfChargeRate_thenReturnAverage() {
		Double averageChargeRate = propertyEvaluator.getAverageOfChargeRateList(chargeRateList);
		assertEquals(Math.round(0.420789815), Math.round(averageChargeRate));
	}
	
	@Test
	public void givenChargeRateListWith3Items_whenEvaluatingAvgOfChargeRate_thenReturnZero() {
		Double averageChargeRate = propertyEvaluator.getAverageOfChargeRateList(chargeRateListWith3Items);
		assertEquals(Double.valueOf(0), averageChargeRate);
	}
	
	@Test
	public void givenSocListWith3Items_whenEvaluatingAvgOfSocList_thenReturnZero() {
		Double averageChargeRate = propertyEvaluator.getAverageOfChargeRateList(socListWith3Items);
		assertEquals(Double.valueOf(0), averageChargeRate);
	}
	
	

}
