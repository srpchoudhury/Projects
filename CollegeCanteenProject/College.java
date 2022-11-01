/*Develop a project to creating real world object with its super
 type and sub types by developing encapsulation and inheritance*/
class College {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		// Student s2=new Student();
		Faculty f = new Faculty();
		System.out.println("===============================================");
		s.setHand(2);
		s.setLeg(2);
		s.setEye(2);
		s.setEar(2);
		s.setInstitute("GIFT");
		s.setName("Rudra");
		s.setSno(101);
		s.setScourse("CJ");
		s.setSfee(2500);
		s.display();
		// s.eat();
		// System.out.println(s);
		// System.out.println(s2);
		System.out.println("===============================================");
		f.setHand(2);
		f.setLeg(2);
		f.setEye(2);
		f.setEar(2);
		f.setInstitute("GIFT");
		f.setName("Sudhara");
		f.setEno(01);
		f.setEsub("CN");
		f.setEsal(3500);
		f.display();
		System.out.println("===============================================");
		Canteen c = new Canteen();
		c.eat(s);
		c.eat(f);
		System.out.println("===============================================");
	}
}
          
