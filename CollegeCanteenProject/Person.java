public class Person{
	private static  int hand;
	private static  int leg;
	private static  int  eye;
	private static  int ear;

	private String name;

	public void setHand(int hand){
		this.hand=hand;
	}
	public int getHand(){
		return hand;
	}
	public void setLeg(int leg){
		this.leg=leg;
	}
	public int getLeg(){
		return leg;
	}
	public void setEye(int eye){
		this.eye=eye;
	}
	public int getEye(){
		return eye;
	}
	public void setEar(int ear){
		this.ear=ear;
	}
	public int getEar(){
		return ear;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void eat(){
		System.out.println(name+" is eating");
	}
	public void sleep(){
		System.out.println(name+" is in deep sleeping");
	}
	public void run(){
		System.out.println(name+" is running");
	}
	public void display(){
		System.out.println("Hands \t:"+hand);
		System.out.println("Legs \t:"+leg);
		System.out.println("Eyes \t:"+eye);
		System.out.println("Ears \t:"+ear);
		//System.out.println("Name \t:"+name);
	}
	
}
