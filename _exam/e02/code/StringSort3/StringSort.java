import java.util.ArrayList;
import java.util.function.Function;
import java.util.Comparator;
public class StringSort {

    public static void main(String [] args) {

	String [] words = {"duck","pig","cat","dog","moose",
			   "goose","cow","a","an","to","be"};
	ArrayList<String> wlist = new ArrayList<String>();
	for (String w : words)
	    wlist.add(w);

	// Insert code to sort here

	// wlist.sort();  // WRONG
	
	// wlist.sort((s1,s2)->s1.compareTo(s2)); // OK
	
	// java.util.Collections.sort(wlist);  // OK

	Comparator<String> byLex = (s1,s2)->s1.compareTo(s2);
	Comparator<String> byLength = (s1,s2)->s1.length()-s2.length();
	//Comparator <String> byLengthThenLex = byLength.thenComparing(byLex);
	Comparator<String> byLengthThenLex = (s1,s2)->byLength.thenComparing(byLex).compare(s1,s2);

	wlist.sort(byLengthThenLex);

	
	System.out.println(wlist);
    }

}
