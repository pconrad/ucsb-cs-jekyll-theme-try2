import java.util.ArrayList;
public class BoxUnbox {
    public static void main(String [] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(3);
		mylist.add(new Integer(2));
		Integer a = mylist.get(0);
		int b = mylist.get(1);
		mylist.add(a);
		mylist.add(b);
		mylist.add(a+1);		
		mylist.set(mylist.get(1),7);
		int c = mylist.get(2);
		Integer d = mylist.get(mylist.get(0));
		System.out.println("a=" + a + " b= " + b + " c=" + c + " d=" + d);
		System.out.println(mylist.size());
    }
}
