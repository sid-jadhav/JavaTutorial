package src.lesson1;

public class Student {
		int RollNo;
		String Name;
		String Town;
		
		public Student(int i, String n, String t) {
			RollNo= i;
			Name= n;
			Town= t;
			
		}
		public Student(int i, String string){
			
		}
		public Student() {
			System.out.println("Do Nothing");
		}
		public int getRollNo() {
			return RollNo;
		}
		public void setRollNo(int rollNo) {
			RollNo = rollNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getTown() {
			return Town;
		}
		public void setTown(String town) {
			Town = town;
		}
		public void print(){
			System.out.println("His name is "+Name+" his Roll number is "+RollNo+" and he is from "+Town+".");
		}
	
}
