---
layout: examHandoutNoName
num: e02
ready: true
desc: "Handout C"
qtr: F18
---

<style>
div.page1 { font-size: 100%;
 line-height: 97%;
}

div.page1 h2 {
 font-size: 105%;
 font-family: Arial, sans-serif;
 padding-top: 0px; padding-bottom: 0px;
 margin-top: 0px; margin-bottom: 0px;
}

div.page2 {
 font-size: 100%;
 line-height: 103%;
}

div.page2 h2 {
 font-size: 105%;
 font-family: Arial, sans-serif;
 padding-top: 2px; padding-bottom: 2px;
 margin-top: 2px; margin-bottom: 2px;
}


td  {
  padding-left:5px; padding-right: 5px;
}

hr { display:none;}

</style>
<div class="page1">
##  StudentMain.java

{% highlight java linenos %}
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
{% endhighlight %}


<div style="clear:both;">
</div>

## `StudentMain.java` compile output

{% highlight java linenos %}
StudentMain.java:10: error: no suitable method found for sort(no arguments)
	java.util.Collections.sort();
	                     ^
    method Collections.<T#1>sort(List<T#1>) is not applicable
      (cannot infer type-variable(s) T#1
        (actual and formal argument lists differ in length))
    method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
      (cannot infer type-variable(s) T#2
        (actual and formal argument lists differ in length))
  where T#1,T#2 are type-variables:
    T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
    T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
1 error
{% endhighlight %}


## `StringSort.java` output
											   
{% highlight java linenos %}
import java.util.ArrayList;
public class StringSort {

    public static void main(String [] args) {

	String [] words = {"duck","pig","cat","dog","moose",
			   "goose","cow","a","an","to","be"};
	ArrayList<String> wlist = new ArrayList<String>();

	for (String w : words)
	    wlist.add(w);

	// Insert code to sort here 






	System.out.println(wlist);
    }
}
{% endhighlight %}

</div>

