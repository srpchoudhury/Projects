//Circle.java
public class Circle implements Shape{
    public static final float PI=3.14f;
	private double radius;

	public Circle(double radius){
		this.radius=radius;
	}
	public void area(){
		System.out.println("Circle area:"+(PI*radius*radius));
	}
	public void perimeter(){
		System.out.println("Circle perimeter:"+(2*PI*radius));
	}
	public void printRadius(){
		System.out.println("Radius:"+radius);
	}
}