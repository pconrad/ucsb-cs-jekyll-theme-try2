---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout A"
qtr: f18
---

<style>

body { font-size: 90%;
 line-height: 102%;
}

 td  {
  padding-left:5px; padding-right: 5px;
}
</style>

<h2>Useful Reference Items related to Sorting</h2>

Here are a few reminders of things we discussed in class, but that you might
reasonably need a "reference" for if you were using them in the real world.

The interface `java.util.Comparator<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compare(T o1, T o2)` |  Compares its two arguments `o1` and `o2` for order. <br>Returns a negative integer, zero, or a positive integer <br>as the first argument is less than, equal to, or greater than the second.  |

</div>

The interface `java.lang.Comparable<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compareTo(T o)` | Compares `this` object with the specified object `o` for order. <br>Returns a negative integer, zero, or a positive integer <br>as `this` object is less than, equal to, or greater than the specified object.|

</div>


The class `java.util.ArrayList<E>` includes this method:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>




<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

The class `java.util.Collections` contains the following static method:

|`static <T extends Comparable<? super T>> void` |  `sort(List<T> list)` | Sorts the specified list into ascending order, <br>according to the natural ordering of its elements. |

</div>

The classes `java.lang.String` and `java.lang.Double` implement `Comparable<String>` and `Comparable<Double>`, each in the
way that you would expect.

## Other potentially useful methods

In `java.lang.Integer`:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

|`public static int` | `compare(int i1, int i2)` |  Compares the two specified int values.  <br> The sign of the int value returned <br>matches the contract of the `compare` method in `java.util.Comparator` |

</div>

<hr style="margin:3em; ">



