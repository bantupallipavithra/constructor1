package constructors.com;

public class Student {
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public void updateDetails(String name) {
		
		System.out.println("new name:"+name);
	}
	public void Display() {
		System.out.println("rollno:"+rollno+"\nname:"+name);
	}
	public static void main(String[] args) {
		Student S1=new Student(21,"pavi");
		System.out.println("before updating");
		S1.Display();
		System.out.println("After updating");
		S1.updateDetails("cherry");
		
	}

}
