---
layout: examHandoutNoName
num: e01
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
##  BeachCruiser.java
{% highlight java linenos %}
public class BeachCruiser extends Bicycle {
    private String color;
    public String getColor() { return this.color; }
    public BeachCruiser(double wheelDiameter,
                        String color) {
       super(1,wheelDiameter); // beach cruisers have 1 gear
       this.color = color;     
    }
}
{% endhighlight %}

## Bicycle.java

{% highlight java linenos %}
public abstract class Bicycle {
   private int numGears;
   private double wheelDiameter;
   public int getNumGears() { return this.numGears; }
   public double getWheelDiameter() { return this.wheelDiameter; }
   public Bicycle(int numGears,
                  double wheelDiameter) {
      this.numGears = numGears;
      this.wheelDiameter = wheelDiameter;
   }
}
{% endhighlight %}


## EBike.java

{% highlight java linenos %}
public class EBike extends Bicycle implements Rentable, Electric {
   private String batteryType;
   
   public double getCost(int miles, int time) {
      // $1.00 for first thirty minutes, and any portion of 30 min after
      return 1.00 + (time / 30 ); 
   }
   public int getChargeTime() { return 30; }

   // SOMETHING MISSING HERE

   private String name;
   public String getName() { return this.name;}
   public EBike( int numGears,
                 double wheelDiameter,
                 String name,
                 String batteryType) {
       // MISSING LINES OF CODE HERE


   }
}
{% endhighlight %}


<div style="float:right; width:30%; border: 1px solid black;padding:2em; line-height:200%; text-align:center;">
<h1>Code for </h1><h1>`GetAround` problem</h1>
</div>

## Electric.java

{% highlight java linenos %}
public interface Electric {
  public String getBatteryType(); // e.g. "36V","48V" 
  public int getChargeTime(); // minute to full charge
}
{% endhighlight %}


## Rentable.java


{% highlight java linenos %}
public interface Rentable { 
  public double getCost(int miles, int time); 
} 
{% endhighlight %}


## Scooter.java

{% highlight java linenos %}
public class Scooter implements Rentable, Electric {
   public String getBatteryType() { return "12V"; }
   public double getCost(int miles, int time) { return 1.00; }
   public int getChargeTime() { return 30; }
   private String name;
   public String getName() { return this.name;}
   public Scooter(String name) { this.name = name; }
}
{% endhighlight %}
</div>
<div class="page2 page-break-before">

<h2 markdown="1">Handout A, p. 2</h2>

<style>

</style>


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
