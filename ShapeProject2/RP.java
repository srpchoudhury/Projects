/*Below Project explains  implementing abstraction,inheritance,
  polymorphism and implementing run time polymorphism and its 
   advantages*/

//RP.java
public class RP{
	public static void main(String... args){
		/*Rectangle r=new Rectangle(10,20);
		r.area();
		r.perimeter();
		r.printLB();
		System.out.println();
		Square s=new Square(10);
		s.area();
		s.perimeter();
		s.printS();
		System.out.println();
        Circle c=new Circle(20);
		c.area();
		c.perimeter();
		c.printRadius();*/

		/*//upcasting
		Shape s;
		s=new Rectangle(10,20);
		s.area();
		s.perimeter();
		//s.printLB();
		//using super class reference variable we can not 
		//access subclass specific members
		//should implement downcasting
		((Rectangle)s).printLB();
        System.out.println();
		s=new Square(10);
		s.area();
		s.perimeter();
		((Square)s).printS();
        System.out.println();
		s=new Circle(20);2
		s.area();
		s.perimeter();
		((Circle)s).printRadius();
		//still we hava one more code desing issue
		//three time we have to invoke the method
		//to avoid code Redundancy we must write a 
		//separate method*/

     callAP(new Rectangle(10,20));
     callAP(new Square(10));
     callAP(new Circle(20));

	}
	static void callAP(Shape s){
		System.out.println();
		s.area();
		s.perimeter();
		//implementing downcasting to invoke sub
		//class specific members
		/*((Rectangle)s).printLB();
		((Square)s).printS();
		((Circle)s).printRadius();*/
		//to solve CCE we must use instanceOf operator

		if(s instanceof Rectangle){
			((Rectangle)s).printLB();
		}
	    else if(s instanceof Square){
		  ((Square)s).printS();
	    }
	    else if(s instanceof Circle){
		   ((Circle)s).printRadius();
	    }
		System.out.println();
	}
}


