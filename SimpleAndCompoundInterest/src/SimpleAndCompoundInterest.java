	/**
	 * 
	 * @author saieswari
	 *
	 */
public class SimpleAndCompoundInterest {
	double principalAmount;
	double timeperiod;
	double rateOfInterest;
	/**
	 * 
	 * @param principalAmount
	 * @param timeperiod
	 * @param rateOfInterest
	 */
	public SimpleAndCompoundInterest(double principalAmount, double timeperiod,double rateOfInterest ){
		this.principalAmount = principalAmount;
		this.timeperiod = timeperiod;
		this.rateOfInterest = rateOfInterest;
	}
	/**
	 * 
	 * @return double simple interest
	 */
	public double SimpleInterest(){
		return (principalAmount*timeperiod*rateOfInterest)/100;
	}
	/**
	 * 
	 * @return double compound interest
	 */
	public double CompoundInterest(){
		return principalAmount*(Math.pow((1+rateOfInterest)/100,timeperiod));
	}
	
}
