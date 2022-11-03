package lab9;

public class Cylinder {
	private double radius;
	private double height;
	//Constructor
	public Cylinder(double radius,double height) {
		this.radius=radius;
		this.height=height;
	}
	//Getters
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	//Setters
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double volCyl() {
		double vol=Math.PI*Math.pow(radius,2)*height;
		return vol;
	}
	public double areaCyl() {
		double area = (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
		return area;
	}

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(10,5);
		System.out.println("Volume: "+ c1.volCyl());
		System.out.println("Area: "+ c1.areaCyl());

	}

}
