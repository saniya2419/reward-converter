
public class RewardValue {
	private double cashValue;
	private double milesValue;
	private static final double Miles_To_Cash_Rate=0.0035;
	
	public RewardValue(double cashValue) {
		this.cashValue=cashValue;
		this.milesValue=cashValue/Miles_To_Cash_Rate;
		}
	
	public RewardValue(int milesValue) {
		this.milesValue=milesValue;
		this.cashValue=milesValue*Miles_To_Cash_Rate;
		
	}
	
	public double getCashValue() {
		return cashValue;
	}
	
	public double getMilesValue() {
		return milesValue;
	}
}
