package batteryevaluator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import batteryproperties.Battery;
import batteryevaluatorreporter.ConsolePropertyReporter;
import batteryevaluatorreporter.PropertyReporter;

public class BatteryPropertyReceiverService {
	public static void main(String args[]) throws NumberFormatException, IOException {
		List<Float> socList = new ArrayList<Float>();
		List<Float> chargeRateList = new ArrayList<Float>();
		Battery battery = new Battery();
		BatteryPropertyEvaluator propertyEvaluator = new BatteryPropertyEvaluator();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			if (line.contains(";")) {
				String batteryProperties[] = line.split("; ");
				socList.add(Float.valueOf(batteryProperties[0]));
				chargeRateList.add(Float.valueOf(batteryProperties[1]));
			}
		}
		evaluateBatteryChargeRate(chargeRateList, battery, propertyEvaluator);
		evaluateBatterySoc(socList, battery, propertyEvaluator);

		PropertyReporter consoleReporter = new ConsolePropertyReporter();
		consoleReporter.printReport(battery);

	}

	private static void evaluateBatterySoc(List<Float> socList, Battery battery,
			BatteryPropertyEvaluator propertyEvaluator) {
		battery.setMaxSoc(propertyEvaluator.getMaxSocValue(socList));
		battery.setMinSoc(propertyEvaluator.getMinSocValue(socList));
		battery.setAverageSoc(propertyEvaluator.getAverageOfSocList(socList));
	}

	private static void evaluateBatteryChargeRate(List<Float> chargeRateList, Battery battery,
			BatteryPropertyEvaluator propertyEvaluator) {
		battery.setAverageChargeRate(propertyEvaluator.getAverageOfChargeRateList(chargeRateList));
		battery.setMinChargeRate(propertyEvaluator.getMinChargeRateValue(chargeRateList));
		battery.setMaxChargeRate(propertyEvaluator.getMaxChargeRateValue(chargeRateList));
	}

}
