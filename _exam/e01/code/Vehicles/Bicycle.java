public abstract class Bicycle {
	private int numGears;
	private double wheelDiameter;
	public int getNumGears() { return this.numGears; }
	public double getWheelDiameter() { return this.wheelDiameter; }
	public Bicycle(int numGears,
				   double wheelDiameter) {
		this.numGears = numGears;
		this.wheelDiameter = wheelDiameter;
	}
}
