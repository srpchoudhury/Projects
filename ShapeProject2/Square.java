//Square.java
public class Square implements Shape{
	private double s;

	public Square(double s){
		this.s=s;
	}
	public void area(){
		System.out.println("Square area:"+(s*s));
	}
	public void perimeter(){
		System.out.println("Square perimeter:"+(4*s));
	}
	public void printS(){
		System.out.println("s:"+s);
	}
}
