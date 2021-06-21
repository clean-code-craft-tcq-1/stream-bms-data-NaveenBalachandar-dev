package batteryevaluatorreporter;

import batteryproperties.Battery;

public interface PropertyReporter {
	void printReport(Battery battery);
}
