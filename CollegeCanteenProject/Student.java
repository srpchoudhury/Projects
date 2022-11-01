class Student extends Person{
	private static String institute;

	private int  sno;
	private String scourse;
	private double sfee;

	public static void setInstitute(String institute){
		Student.institute=institute;
	}
	public static String getInstitute(){
		return institute;
	}
	public void setSno(int sno){
		this.sno=sno;
	}
	public int getSno(){
		return sno;
	}
	public void setScourse(String scourse){
		this.scourse=scourse;
	}
	public String getScourse(){
		return scourse;
	}
	public void setSfee(double sfee){
		this.sfee=sfee;
	}
	public double getSfee(){
		return sfee;
	}
	public void read(){
		System.out.println(getName()+" is reading "+scourse);
	}
	public void write(){
		System.out.println(getName()+" is writting notes of "+scourse);
	}
	public void display(){
		super.display();
	    System.out.println("Institute \t:"+getInstitute());
	    System.out.println("Name \t\t:"+getName());
		System.out.println("Sno\t\t:"+getSno());
		System.out.println("Scourse\t\t:"+getScourse());
		System.out.println("Sfee\t\t:"+getSfee());
		System.out.println( );
	}

	/*@Override
	public String toString(){
		return " student serial no\t:"+this.sno;
	}*/

	
}
