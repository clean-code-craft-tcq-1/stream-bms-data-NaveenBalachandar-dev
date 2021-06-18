package batteryevaluator;

import java.util.Collections;
import java.util.List;

public class BatteryPropertyEvaluator {
	public Float getMaxSocValue(List<Float> socList) {
		if(checkIfListIsValid(socList)) {
			return 0.0f;
		}
		return Collections.max(socList);	
	}

	private boolean checkIfListIsValid(List<Float> listToBeChecked) {
		if(null == listToBeChecked || listToBeChecked.isEmpty()) {
			return true;
		}
		return false;
	}
	
	private boolean checkIfListIsValidForAveraging(List<Float> listToBeChecked) {
		if(checkIfListIsValid(listToBeChecked) || listToBeChecked.size() < 5) {
			return true;
		}
		return false;
	}
	
	public Float getMinSocValue(List<Float> socList) {
		if(checkIfListIsValid(socList)) {
			return 0.0f;
		}
		return Collections.min(socList);	
	}
	
	public Float getMaxChargeRateValue(List<Float> chargeRateList) {
		if(checkIfListIsValid(chargeRateList)) {
			return 0.0f;
		}
		return Collections.max(chargeRateList);	
	}
	
	public Float getMinChargeRateValue(List<Float> chargeRateList) {
		if(checkIfListIsValid(chargeRateList)) {
			return 0.0f;
		}
		return Collections.min(chargeRateList);	
	}
	
	
	public Double getAverageOfChargeRateList(List<Float> chargeRateList) {
		if(checkIfListIsValidForAveraging(chargeRateList)) {
			return 0.0;
		}
		
		List<Float> chargeRateSubList = chargeRateList.subList(chargeRateList.size() - 5, chargeRateList.size());
		return chargeRateSubList.stream().mapToDouble(chargeRate -> chargeRate).average().orElse(0.0f);
	}
	
	public Double getAverageOfSocList(List<Float> socList) {
		if(checkIfListIsValidForAveraging(socList)) {
			return 0.0;
		}
		
		List<Float> socSubList = socList.subList(socList.size() - 5, socList.size());
		return socSubList.stream().mapToDouble(chargeRate -> chargeRate).average().orElse(0.0f);
	}
	
	
}
