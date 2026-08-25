package day37;

public class Room {

	private int length;
	private int width;
	
	public Room() {}
	public Room(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	
	public int calculateArea()
	{
		return this.length*this.width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
