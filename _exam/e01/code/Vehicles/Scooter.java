public class Scooter implements Rentable, Electric {
	public String getBatteryType() { return "12V"; }
	public double getCost(int miles, int time) {
		// $1.00 for first thirty minutes, and any portion of 30 min after
		return 1.00 + (time / 30 ); 
	}
	public int getChargeTime() { return 30; }
	private String name;
	public String getName() { return this.name;}
	public Scooter(String name) {
		this.name = name;
	}
}
