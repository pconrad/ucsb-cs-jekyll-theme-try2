import java.util.ArrayList;
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
	
	java.util.Collections.sort(wlist);  // OK
	
	/*
	  wlist.sort( (s1,s2)->{
		int diff = s1.length() - s2.length();
		if (diff!=0)
		    return diff;
		else
		    return s1.compareTo(s2);
	    });
	*/		
	System.out.println(wlist);
    }

}
