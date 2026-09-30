package collectionrevision.day8;

public class Graha {
	
	private double radius;
	private double mass;
	private double gravity;
	
	public Graha() {}
	public Graha(double radius,double mass)
	{
		this.radius=radius;
		this.mass=mass;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
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
