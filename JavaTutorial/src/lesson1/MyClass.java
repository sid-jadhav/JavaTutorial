package lesson1;

public class MyClass {
/* This is a new start for me in Java */
	public static void main(String[] args) {
		Student Abhi= new Student();
		Abhi.Name="Abhijeet Patil";
		Abhi.RollNo=11736;
		Abhi.Town="Kolhapur";
		Abhi.print();
		Student sid=new Student(11712, "sid","Kolhapur");
		sid.print();
		Student nits= new Student(11745, "nitu");
		String n= sid.getName();
		System.out.println(n);
		Rectangle rec=new Rectangle();
		rec.SetPara(10, 20);
		System.out.println("Rectangle : "+rec.area());
		
		triangle tri= new triangle();
		tri.SetPara(10, 20);
		System.out.println("Triangle : "+tri.area());
	}
}