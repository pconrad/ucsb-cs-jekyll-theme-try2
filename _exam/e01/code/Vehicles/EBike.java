public class EBike extends Bicycle implements Rentable, Electric {
	private String batteryType;
	
	public double getCost(int miles, int time) {
		// $1.00 for first thirty minutes, and any portion of 30 min after
		return 1.00 + (time / 30 ); 
	}
	public int getChargeTime() { return 30; }
	// REMOVE THIS NEXT LINE
	public String getBatteryType() { return batteryType;}

	private String name;
	public String getName() { return this.name;}
	public EBike( int numGears,
				  double wheelDiameter,
				  String name,
				  String batteryType) {

		// LEAVE BLANK HERE
		super(numGears, wheelDiameter);
		this.name = name;
		this.batteryType = batteryType;
	}

  

	

}
