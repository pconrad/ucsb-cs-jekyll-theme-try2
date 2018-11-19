---
layout: examHandoutNoName
num: e02
ready: true
desc: "Handout A"
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

<div class="page2 page-break-before">

<h2 markdown="1">Handout A, p. 2</h2>


<h2 markdown="1">class `java.util.ArrayList<E>`</h2>

<div style="font-size:90%; font-family: Arial Narrow, sans-serif;">

The following excerpts from the javadoc for `java.util.ArrayList<E>` may be
helpful to you in completing this exam.

Inheritance Hierarchy (complete)

```
java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
      java.util.ArrayList<E>
```

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| All Implemented Interfaces: | `Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess` |
| Direct Known Subclasses: | `AttributeList, RoleList, RoleUnresolvedList` |

</div>

## Constructors (complete)

<div markdown="1" class="hanging-indent-table">

| `ArrayList()` | Constructs an empty list with an initial capacity of ten.
| `ArrayList(Collection<? extends E> c)` | Constructs a list containing the elements of the specified collection,<br>in the order they are returned by the collection's iterator. |
| `ArrayList(int initialCapacity)` | Constructs an empty list with the specified initial capacity. |

</div>

## Most important methods, with brief description

<div markdown="1" class="hanging-indent-table">

| `boolean` | `add(E e)` | Appends the specified element to the end of this list. |
| `void` | `add(int index, E element)` | Inserts the specified element at the specified position in this list. <br>Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).<br>throws `IndexOutOfBoundsException` if `(index < 0 || index > size())`|
| `void` | `clear()` | Removes all of the elements from this list.|
| `E` | `get(int index)` | Returns the element at the specified position in this list. |
| `int` | `indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this list, <br>or -1 if this list does not contain the element. |
| `boolean` | `isEmpty()` | Returns true if this list contains no elements. |
| `int`	|  `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this list,<br>or -1 if this list does not contain the element. |
| `E` | `remove(int index)` | Removes the element at the specified position in this list.|
| `boolean` | `remove(Object o)` | Removes the first occurrence of the specified element from this list, if it is present. |
| `E` | `set(int index, E element)` | Replaces the element at the specified position in this list with the specified element.<br>Returns the element previously at the specified position<br> throws `IndexOutOfBoundsException` if `(index < 0 || index >= size())`|
| `int` | `size()` | Returns the number of elements in this list. |
| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>

## Additional methods, listed by method signature only.

<div markdown="1" class="hanging-indent-table">

| `boolean addAll(Collection<? extends E> c)` | `boolean	addAll(int index, Collection<? extends E> c)` |
| `Object   clone()` |  `boolean  contains(Object o)` |
| `void	   ensureCapacity(int minCapacity)` | `void forEach(Consumer<? super E> action)` |
| `Iterator<E> iterator()` | `ListIterator<E>  listIterator()` |
| `ListIterator<E> listIterator(int index)` | `boolean removeAll(Collection<?> c)` |
| `boolean removeIf(Predicate<? super E> filter)` | `protected void removeRange(int fromIndex, int toIndex)` |
| `void replaceAll(UnaryOperator<E> operator)` | `boolean retainAll(Collection<?> c)` |
| `Spliterator<E>  spliterator()` | `List<E> subList(int fromIndex, int toIndex)`
| `Object[] toArray()` | `<T> T[] toArray(T[] a)` |
| `void    trimToSize()` | |

</div>

## Methods inherited from:

<div markdown="1" class="hanging-indent-table">

| `class java.util.AbstractList` | `equals, hashCode` |
| `class java.util.AbstractCollection` | `containsAll, toString` |
| `class java.lang.Object` | `finalize, getClass, notify, notifyAll, wait, wait, wait` |
| `interface java.util.List` |  `containsAll, equals, hashCode` |
| `interface java.util.Collection` |  `parallelStream, stream` |

</div>
</div>

