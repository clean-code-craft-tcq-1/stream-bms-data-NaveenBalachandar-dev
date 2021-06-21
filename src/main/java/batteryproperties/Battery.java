package batteryproperties;

public class Battery {
	private Float maxChargeRate;
	private Float maxSoc;
	private Float minChargeRate;
	private Float minSoc;

	private Double averageChargeRate;
	private Double averageSoc;
	
	
	public Float getMaxChargeRate() {
		return maxChargeRate;
	}
	public void setMaxChargeRate(Float maxChargeRate) {
		this.maxChargeRate = maxChargeRate;
	}
	public Float getMaxSoc() {
		return maxSoc;
	}
	public void setMaxSoc(Float maxSoc) {
		this.maxSoc = maxSoc;
	}
	public Double getAverageChargeRate() {
		return averageChargeRate;
	}
	public void setAverageChargeRate(Double averageChargeRate) {
		this.averageChargeRate = averageChargeRate;
	}
	public Double getAverageSoc() {
		return averageSoc;
	}
	public void setAverageSoc(Double averageSoc) {
		this.averageSoc = averageSoc;
	}
	public Float getMinChargeRate() {
		return minChargeRate;
	}
	public void setMinChargeRate(Float minChargeRate) {
		this.minChargeRate = minChargeRate;
	}
	public Float getMinSoc() {
		return minSoc;
	}
	public void setMinSoc(Float minSoc) {
		this.minSoc = minSoc;
	}
	
}