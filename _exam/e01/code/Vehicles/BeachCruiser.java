public class BeachCruiser extends Bicycle {
	private String color;
	public String getColor() { return this.color; }
	public BeachCruiser(double wheelDiameter,
						String color) {
		super(1,wheelDiameter); // beach cruisers have 1 gear
		this.color = color;	
	}
}
