

//Rectangle.java
public class Rectangle implements Shape{
	private double l;
	private double b;

	public Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		System.out.println("Rectangle area:"+(l*b));
	}
	public void perimeter(){
		System.out.println("Rectangle perimeter:"+(2*(l+b)));
	}
	public void printLB(){
		System.out.println("l:"+l);
		System.out.println("b:"+b);
	}
}