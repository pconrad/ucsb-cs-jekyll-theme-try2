import java.util.ArrayList;
public class StudentMain {
    public static void main(String [] args) {
	ArrayList<Student> roster = new ArrayList<Student>();
	roster.add(new Student("Chris",3456789,"CMPSC"));
	roster.add(new Student("Taylor",1234567,"MATH"));
	roster.add(new Student("Sandy",5678901,"CMPEN"));
	java.util.Collections.sort(); // sort by perm number
	System.out.println(roster);
    }
}
