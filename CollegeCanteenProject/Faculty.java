class Faculty extends Person{
	private static String institute;
	private int eno;
	private String esub;
	private double esal;

    public static void setInstitute(String institute){
		Faculty.institute=institute;
    }
	public String getInstitute(){
		return institute;
	}
	public void setEno(int eno){
		this.eno=eno;
	}
	public int getEno(){
		return eno;
	}
	public void setEsub(String esub){
		this.esub=esub;
	}
    public String getEsub(){
		return esub;
    }
	public void setEsal(double esal){
		this.esal=esal;
	}
	public double getEsal(){
		return esal;
	}
	public void display(){
		super.display();
		System.out.println("Institute\t: "+getInstitute());
		System.out.println("Name\t\t: "+getName());
		System.out.println("Eno\t\t: "+getEno());
		System.out.println("Esub\t\t: "+getEsub());
		System.out.println("Esal\t\t: "+getEsal());
		System.out.println( );
	}
}
