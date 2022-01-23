package week1.day1;

public class Student {
	String studentName = "shanmugam";
	int rollno = 43;
	public void college() {
		System.out.println("--SNS college of engineering--");
		
	}
	public static void main(String[] args) {
		Student object = new Student();
		System.out.println("College name is ");
		object.college();
		System.out.println("studentName=" + object.studentName );
		System.out.println("Roll no =" +object.rollno);

			
	}		
	
}
 