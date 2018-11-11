---
layout: exam
num: e01
ready: true
desc: "Midterm E01 Partial Key"
exam_date: 2018-10-24 12:30
---


<style>
.key {
    font-family: 'Marker Felt', 'Chalkduster','Cartoonist Hand','Comic Neue','Comic Sans MS',cursive,sans-serif;
    padding: 1em;
    margin: 1em;
    border: 4px solid #393;
    background-color: #ffe;
}
    
.key pre {
   font-family: 'Marker Felt', 'Chalkduster','Cartoonist Hand','Comic Neue','Comic Sans MS',cursive,sans-serif;
}
</style>

<script>

$(document).ready(function(){

    console.log("ready function inside exam .md file");
    $('div.will-it-compile-with-output-problem').each(function(i) {
        var div = $(this).clone();
        $(this).html($(document.getElementById("will-it-compile-with-output-problem")).clone().html());
        $(this).find(".code-goes-here").append(div);
    });
});

</script>


<ol>

<li markdown="1" class="page-break-before"> Suppose you write a `Student` class in Java with private data members:

```java
 private String name;
 private int perm;
```
and constructor:
```java
public Student(String name, int perm);
```

In a main program, you write:

{%highlight java linenos%}
  Student s = new Student("Chris Gaucho",1234567);
  System.out.println("s=" + s);
{%endhighlight%}

The output is:

```
s=Student@7852e922
```

<ol>
<li markdown="1" style="margin-bottom:1em;">
(3 pts) What method
is being implicitly invoked on the object `s` on line 2 of the listing
above to produce the value `Student@7852e922`, and in what class is
that method defined?

<p class="key" markdown="1">
the `toString()` method of `java.lang.Object`
</p>

</li>
<li markdown="1" style="margin-bottom:1em;">
(3 pts) Describe what you would need to do
if you wanted to change the output of line 2 above to something like
<br>`s=Chris Gaucho(1234567)` but WITHOUT changing line 2.

Your change should make it so that any time an reference to a Student object is concatenated to something like `"x="`, this formatting of the name and perm is automatically done.

Note: Don't write the Java code, just *describe* in English, using correct Java and Object-Oriented Programming terminology, at a high-level,  what code needs to be written, and in what class that code belongs.

<p class="key" markdown="1">
in `public class Student` we should override the `toString()` method of `java.lang.Object` with one that returns a string formatted with the name and perm as shown.   (Note: it's not a required part of the answer, but since several folks mentioned it in their incorrect answers, I'll note: We don't need getters because `toString` is a member function
</p>

</li>
</ol>


</li>

<li markdown="1" class="page-break-before"> For this question, you
need page 1 of [Handout A](handout_a/) with code for various Java
files: `BeachCruiser.java`, `Electric.java`, `Scooter.java`,
`Bicycle.java`, `EBike.java`, and `Rentable.java`.  This code is in a
program called `GetAround` that helps users plan how to get around
Isla Vista.

All of the files on [Handout A](handout_a/) are complete and will compile EXCEPT for `EBike.java`, which is missing two things:
* The body of the constructor is empty, and needs some code (lines 18-20)
* There is one other thing missing (indicated by "something missing here" on line 10).

<ol>
<li markdown="1">
(8 pts) Fill in the missing code for the constructor in the space below.   The correct answer is somewhere between two and six lines of code, and should fit easily in the space provided.  (Hint: Pay attention to inheritance and interfaces.)

<div style="clear:both;">
</div>

```java
 public EBike( int numGears,
                 double wheelDiameter,
                 String name,
                 String batteryType) {
```   
<p class="key" markdown="1">
```
  super(numGears, wheelDiameter);                                   
  this.name = name;
  this.batteryType = batteryType;
```
</p>

```
   }
```
<p class="key" markdown="1">
Note: if you don't include `super(numGears, wheelDiameter);` you get:
```
required: int,double
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
```
Also, the following code produces an error:
```java
this.numGears = numGears;
this.wheelDiameter = wheelDiameter;
```

The error is:

```
EBike.java:21: error: numGears has private access in Bicycle
		this.numGears = numGears;
		    ^
EBike.java:22: error: wheelDiameter has private access in Bicycle
		this.wheelDiameter = wheelDiameter;
```
</li>
<li markdown="1"> (4 pts) In the space below, write the other missing part from `EBike.java`   It is at least one line of code, and at most three lines of code; so it should easily fit in the space provided.    Answer as though the code you write would be placed at line 10 of the listing for `EBike.java` on [Handout A](handout_a/).

```




```
</li>
</ol>
</li>

<li markdown="1"> Continue to refer to the code
on Handout A.

*Please assume that you have made the changes* from the two questions above.

Indicate, for each method, whether it compiles or not, and if it does compile, theoutput when invoked.

<style>
table.will-it-compile-outer tr td  { border: none; }
table.will-it-compile-inner tr td { border: 1px solid black; }
td.code-goes-here { width: 32em; }
</style>

<div id="will-it-compile-with-output-problem" class="template">
<table class="will-it-compile-outer">
<tr>
<td class="code-goes-here">
</td>
<td>
<table class="will-it-compile-inner">
<tr><th>Will it compile?</th><th>Output when called (only if it compiles)</th></tr>
<tr>
<td><span style="font-size: 200%;">&#x2610;</span> Yes <br><span style="font-size: 200%;">&#x2610;</span> No </td>
<td style="height:4em; width:20em;"></td>
</tr>
</table>
</td>
</tr>
</table>
</div>


<ol>

<li> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga01() {
    BeachCruiser a = new BeachCruiser(21.5, "blue");
    System.out.println("ga01: " +  a.getColor());
  }
```

</div>

</li>


<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga02() {
      Bicycle b = new BeachCruiser(22.0, "yellow");
      // System.out.println("ga02: " +  b.getColor());
  }
```


</div>

</li>

</ol>

</li>

<li style="clear:right;" class="page-break-before" markdown="1">

Continued from previous problem...

Some of these methods will compile and run, while others will not.

Indicate, for each method, whether it compiles or not, and if it does compile, the output when invoked, in the context of the classes on [Handout A](handout_a/).

<ol>

<li markdown="1"> (3 pts)




<div class="will-it-compile-with-output-problem" markdown="1" >


```java
  public static void ga03() {
      BeachCruiser c = new BeachCruiser(26.0, "red");
      System.out.println("ga03: " +  c.getWheelDiameter());
  }
```


</div>

</li>

<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga04() {
      Rentable d = new EBike(1,24.0,"Hopr","12V");
      System.out.println("ga04: " + d.getCost(5,45));
  }
```


</div>

</li>

<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga05() {
      Rentable e = new EBike(1,24.0,"Hopr","12V");
      // System.out.println("ga05: " + e.getName());
  }
```
</div>


</li>

<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga06() {
      Electric f = new EBike(3,26.0,"Hopr3","12V");
      // System.out.println("ga06: " + f.getName());
  }
```
</div>


</li>


</ol>

</li>

<li style="clear:left;" class="page-break-before" markdown="1">Continued from previous problem...

Some of these methods will compile and run, while others will not.

Indicate, for each method, whether it compiles or not, and if it does compile, the output when invoked in the context of the classes on [Handout A](handout_a/).

<ol>

<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">


```java
  public static void ga07() {
      Electric g = new Scooter("Lime");
      System.out.println("ga07: " + g.getBatteryType());
  }
```

</div>

</li>


<li markdown="1"> (3 pts)

<div class="will-it-compile-with-output-problem" markdown="1">

```java
  public static void ga08() {
      Scooter h = new Scooter("Bird");
      System.out.println("ga08: " + h.getChargeTime());
  }
```


</div>


</li>


</ol>

</li>

<li class="page-break-before" markdown="1" style="margin-bottom:1em;" >


<style>
 div.dog { font-size: 110%;
   line-height: 110%;
    margin: 0.5em;
    padding: 0.5em;
     width: 65%;

 }

div.dog * td  {
  padding-left:5px; padding-right: 5px;
  }
 div.fill-in-blanks-smaller {
   width: 30%;
   float: left;
 }

 .fill-in-blanks-smaller table {

  }
 .fill-in-blanks-smaller table * td {
   margin: 0.5em 0.5em 0.5em 0.5em;
   padding: 0.5em 0.5em 0.5em 0.5em;
   font-size: 150%;
   line-height: 150%;
 }

</style>


(10 pts) Refer to the code for the class `Dog` with a `main`
that creates some `Dog` objects.

Your job: figure out after which line of main() each of the following Dog
objects is eligible for garbage collection.

If an object is still not eligible for garbage collection when the
last line of main is reached, write "never".  Each answer should be a
line number, or the word never.

<div style="clear:right;">
</div>

<div class="fill-in-blanks-smaller" markdown="1">

| Object         | Fill in line  here |
|----------------|--------------------|
| (a) `Kiki`     |                    |
| (b) `Lassie`   |                    |
| (c) `Molly`    |                    |
| (d) `Ninja`     |                    |
| (e) `Otto`     |                    |        

</div>


<div class="dog" markdown="1" style="float:right;">
{% highlight java linenos %}
public class Dog {
    
    private static Dog bestInShow = null;
    private String name;
    
    public static void setBestInShow(Dog b) {
        bestInShow = b;
    }
    
    public static Dog getBestInShow() {
        return bestInShow;
    }
    
    public Dog(String name) { this.name = name;}
    
    public static void main(String [] args) {

        Dog d1 = new Dog("Kiki");
        Dog d2 = new Dog("Lassie");
        Dog d3 = new Dog("Molly");
        Dog d4 = new Dog("Ninja");
        Dog d5 = new Dog("Otto");
        Dog d6 = d3;
        
        setBestInShow(d2);   
        d5 = d1;             
        d4 = d2;             
        d1 = null;           
        d3 = null;           
        d5 = null;           
        d2 = null;           
        d4 = null;           
        d6 = null;           
        setBestInShow(null); 
    }
}
{% endhighlight %}

</div><!-- dog -->


</li>



<li style="clear:right;" class="page-break-before" markdown="1"> Given the following program below,
determine whether each line of code involves boxing or unboxing, and check either neither box, one of the boxes, or both boxes, as applicable.

There is a reference for `ArrayList` on p. 2 of [Handout A](handout_a/) if that helps.
<style>

div.box-unbox {
 margin-left: 1em;
  margin-right: 1em;
}
div.box-unbox table * td  {
  text-align:center;
}

div.box-unbox table * td span {
  text-align:center;
  font-size: 200%;
  padding: 4px 0px 4px 0px;
  
}

</style>
<div class="box-unbox" style="float:left;">

| Points | Line<br>number |  Auto-Boxing | Auto-Unboxing |
|--------|-------------|---------------|--------------|
| (2 pts) | 5 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 6 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 7 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 8 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     	|
| (2 pts) | 9 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     	|


</div>

<div class="box-unbox">

| Points | Line<br>number |  Auto-Boxing | Auto-Unboxing |
|--------|-------------|---------------|--------------|
| (2 pts) | 10 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 11 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 12 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 13 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |
| (2 pts) | 14 |   <span>&#x2610;</span>   |  <span>&#x2610;</span>     |

</div>

<div style="margin: 1em; clear:both; padding:1em;">

{% highlight java linenos %}
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
{% endhighlight %}

</div>

</li>

<li  markdown="1">
Working with the same program as in the previous problem,
what is the output of:

<style>
div.fill-in-blanks table * th {
 font-weight: normal;
}
div.fill-in-blanks table * td {
 font-size: 250%;
}
</style>

<div class="fill-in-blanks">

| (8 pts) Line 15? (fill in blanks below) |  (4 pts) Line 16? (fill in box below) |
|----|----|
|`a=____ b=____ c=____ d=____`|`             `|

</div>

</li>

<li markdown="1" class="page-break-before"> Suppose you were asked the two questions below
at a job interview.  How would you answer?

For full credit:
* Focus on what the interviewer is asking.  In each case, they are asking "What problem does the tool solve, or what need does it address".  Be sure you answer that question.
* Be sure there is enough detail in your answer that the interviewer is sure you understand what you are talking about.
* On the other hand, avoid including unnecessary detail.  No one likes a long-winded answer, and if you accidentally say something incorrect, you may lose points (and in the real world, the opportunity for a job offer.)
<ol>
<li style="margin-bottom:20em;margin-top:1em;">(4 pts) Ant and Maven are both
tools that are used to solve the same basic problem.  What is the problem that these
tools are designed to solve, or the need that they address?  Be sure to identify what kind of person has that problem or need, and in what circumstances.
</li>

<li >(4 pts) JUnit solves a different problem (or addresses a different need).   What problem does JUnit solve (or what need does it address?  As before, identify who has the problem/need and under what circumstances.

</li>
</ol>
</li>


<li markdown="1" class="page-break-before"> Suppose you were asked the two questions below
at a job interview.  How would you answer?

For full credit:
* Focus on what the interviewer is asking.  In each case, they are asking "what is the problem that the tool solves?" Be sure you answer that question.
* Be sure there is enough detail in your answer that the interviewer is sure you understand what you are talking about.
* On the other hand, avoid including unnecessary detail.  No one likes a long-winded answer, and if you accidentally say something incorrect, you may lose points (and in the real world, the opportunity for a job offer.)

<ol>

<li style="clear:both; margin-bottom:20em;">(4 pts) What problem does Jacoco solve, or what need does it address?  Who has that need or problem, and in what context?
</li>

<li style="margin-bottom:20em;">(4 pts) Same question, about Javadoc
</li>
</ol>

</li>

</ol>
