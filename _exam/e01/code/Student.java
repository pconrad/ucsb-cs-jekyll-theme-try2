public class Student {
 private String name;
	private int perm;
	public Student(String name, int perm) {
		this.name = name;
		this.perm = perm;
	}
	public static void main(String [] args) {
  Student s = new Student("Chris Gaucho",1234567);
  System.out.println("s=" + s);

	}
}

