package collectionrevision.day8;

public enum Planet {
	
	MERCURY(5.0,50.0),
	VENUS(8.0,80.0),
	EARTH(10.0,98.0),
	MARS(7.0,70.0),
	JUPITER(20.0,200.0),
	SATURN(15.0,150.0),
	URANUS(13.0,130.0),
	NEPTUNE(12.0,120.0);
	
	private double radius;
	private double mass;
	private double gravity;
	

	private Planet(double radius,double mass)
	{
		this.radius=radius;
		this.mass=mass;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getMass() {
		return mass;
	}
	
	public double getGravity() {
		return gravity;
	}
	
	
	public double calculateGravity()
	{
		return (this.radius*this.radius)/this.mass;
	}
	@Override
	public String toString() {
		return "Graha [radius=" + radius + ", mass=" + mass + ", gravity=" + gravity + "]";
	}
}
