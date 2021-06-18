package batteryevaluatorreporter;

import batteryproperties.Battery;


public class ConsolePropertyReporter implements PropertyReporter {

	@Override
	public void printReport(Battery battery) {
		
		System.out.println("Maximum charge rate: "+ battery.getMaxChargeRate());
		System.out.println("Minimum charge rate: "+ battery.getMinChargeRate());
		System.out.println("Average charge rate: "+ battery.getAverageChargeRate());
		System.out.println("Maximum soc: "+ battery.getMaxSoc());
		System.out.println("Minimum soc: "+ battery.getMinSoc());
		System.out.println("Average soc: "+ battery.getAverageSoc());
	}
}
