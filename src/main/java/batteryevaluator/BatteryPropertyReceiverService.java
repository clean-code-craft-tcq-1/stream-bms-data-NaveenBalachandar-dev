package batteryevaluator;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import batteryproperties.Battery;
import batteryevaluatorreporter.ConsolePropertyReporter;
import batteryevaluatorreporter.PropertyReporter;

public class BatteryPropertyReceiverService {
	public static void main(String args[]) {
		System.out.println("I am gere!" + args.length);
	
		List<Float> socList = new ArrayList<Float>();
		List<Float> chargeRateList = new ArrayList<Float>();
		Battery battery = new Battery();
        BatteryPropertyEvaluator propertyEvaluator = new BatteryPropertyEvaluator();
		
		 try {
            // Wrap the System.in inside BufferedReader
            // But do not close it in a finally block, as we 
            // did no open System.in; enforcing the rule that
            // he who opens it, closes it; leave the closing to the OS.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = in.readLine()) != null) {
                // TODO: Handle input line
		    System.out.println(line);
            }

            // Null was received, so loop was aborted.

        } catch (IOException e) {
            // TODO: Add error handler
        }
        
		 if (args.length > 0) {       
			 	for (String consoleInput : args) {
					System.out.println("I am again here!" + consoleInput);
					String batteryProperties[] = consoleInput.split("; ");
					socList.add(Float.valueOf(batteryProperties[0]));
					chargeRateList.add(Float.valueOf(batteryProperties[1]));
				}      
			 
	            evaluateBatteryChargeRate(chargeRateList, battery, propertyEvaluator);
	            evaluateBatterySoc(socList, battery, propertyEvaluator);
	            
	            PropertyReporter consoleReporter = new ConsolePropertyReporter();
	            consoleReporter.printReport(battery);
	            
	        }
	          
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
