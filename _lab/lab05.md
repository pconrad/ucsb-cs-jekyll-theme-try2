---
layout: lab
num: lab05
prev_num: lab04
ready: true
desc: "Sorting"
assigned: 2018-10-25 16:00
due: 2018-11-02 23:59
github_org: "ucsb-cs56-f18"
starter_repo: "https://github.com/ucsb-cs56-f18/STARTER_lab05"
last_before: "Midterm Exam E01"
---

<div style="background-color: #dfe; border: 4px inset #c00; font-size: 120%; width:80%; margin-left:auto;margin-right:auto;text-align:center;">
You will need to read this article first in order to know how to do this lab:
<https://ucsb-cs56-pconrad.github.io/topics/java_sorting/>
Some of that will be review from the text, but there is also some new information; particularly 
about using lambda functions to sort.
</div>



In this lab:

* New concepts:
   - Sorting using lambda functions
* More on:
   -   using packages
   -   writing your own JUnit tests
   -   test coverage

Step-by-Step
============

# Step 0: Set up your repo

Create your repo the same way you did for [lab01](/lab/lab01/), [lab02](/lab/lab02/), and [lab04](/lab/lab04/)
   * under the <tt>{{page.org}}</tt> organization
   * name should be <tt>{{page.num}}-githubid</tt> OR <tt>{{page.num}}-githubid1-githubid2</tt> as appropriate
   * private, and initially *empty* (no README.md, .gitignore or LICENSE).
   * add your pair partner as a collaborator
     
Clone this empty repo into your `~/cs56` directory, or wherever you prefer to work.

You'll use your <tt>{{page.prev_num}}</tt> repo as your starter code.  

To add the starter as a remote, cd into the repo you cloned, then do:

<div>
  <tt>git remote add starter <i>git-url-of-repo-from-{{page.prev_num}}</i> </tt>
</div>

Then do: 
```
git pull starter master
git push origin master
```

That should get your repo for {{page.num}} set up with a copy of your repo from {{page.prev_num}}.

# Step 1: Copy code for a new class and a new set of tests into your repo.

Though there is starter code for this week, it is not a full repo; instead it is just two files that you need to copy to their
proper spots.  In that repo, <https://github.com/ucsb-cs56-f18/STARTER_lab05>, you'll find these files:

| File | Where to copy it in your {{page.num}} repo |
|------|----------|
| Menu.java | `src/main/java/edu/ucsb/cs56/pconrad/menuitems` |
| MenuTest.java | `src/test/java/edu/ucsb/cs56/pconrad/menuitems` |

To copy these to their proper spots, you could do any of the following.  How you get the file there is up to you.   At this point, you will be expected to have the skills to do that, but if you need some suggestions, here you go:

1. Clone this repo to another directory (not  inside of your {{page.num}} repo directory, but as a sibling, for example).  Then use the Unix `cp` or `mv` file to copy the file into it's proper spot.
2. Use the "raw" tab on the github site to expose a version of the file that doesn't have any extra formatting (line numbers, etc.).  Then any of the following techniques:
   * Use "save as" in your web browser to save a copy into the correct directory
   * Copy the URL, then cd into the target directory, and use <tt>wget <i>url</i></tt> to get the file.
   * Open the target filename in an editor as an empty file, and use copy/paste to paste in the contents.
   
   

# Step 2: Start writing code to make tests pass

In the previous lab, {{page.prev_num}}, you implemented several methods of a class called `MenuItem` that represents
item on a restaurant Menu.   Now, we will implement the `Menu` class.   The details about the `Menu` class appear below.

Ideally, we'd need to discuss sorting, `java.lang.Comparable`, `java.util.Comparator`, 
and Java lambda expressions in lecture first; instead, here is a link to some materials you can read to learn what you need to know:
* <https://ucsb-cs56-pconrad.github.io/topics/java_sorting/>



Just like last week, note that the starter code:
* Has stubs for SOME of the needed methods, but NOT ALL of them
* Has unit tests for SOME of the needed methods, but NOT ALL of them

I suggest that you work in this order:
* <b>First, Add stubs for all of the methods that don't have them yet.</b>  
   * Until you do this, you won't be able to run any of the instructor unit tests on Gradescope.
   * The reasons is that the instructor tests won't compile against your code unless and until you have those methods.
* <b>Then, try submitting on Gradescope</b>
   * At this point, you should have a clean compile for both the student and instructor code, though you won't be passing most of the unit tests.
* Then, one at a time, work on each method
   * If the method doesn't have a unit test yet, <b>write the test first and see it fail</b>.
   * Then make the test pass.
   * Then submit on Gradescope and see if the test for that method passes on Gradescope
   * Continue until all of your methods work.

# Details about methods of Menu


The methods for `Menu` are as follows:

| Modifier and Type	| Method | Description |
|-|-|-|
|`void	add(MenuItem mi)` | add a menu item to the menu (to the wrapped `ArrayList<MenuItem>`)|
|`String`|	`csv()` | Produce a listing of each item in csv format, with newlines between each item.  Order is whatever order the items are currently in the ArrayList |
|`String`|	`csvSortedByName()` | same as `csv()`, but the items should be sorted in lexicographic order by name. |
|`String`|	`csvSortedByCategoryThenName()` | same as `csv()`, but the items should be sorted by category.  With the same category, the items should be sorted by name.  |
|`String`|	`csvSortedByCategoryThenPriceDescendingThenByName()` | same as `csv()`, but the items should be sorted by category.  With the same category, the items should be sorted by name. |
|`String`|	`csvSortedByPriceThenName()` | same as `csv()`, but the items should be sorted by price, from lowest to highest.  When more than one items has the same price, the items of the same price should be sorted by name. |

# Step 3: Checking Test Case Coverage 

As you did last week, be sure that you've added your pair partner to your submissions on Gauchospace

Then, check your test coverage: 
* Run: `mvn test jacoco:report`
* Then, open the file `target/site/jacoco/index.html` in a browser:
   * In CSIL or Phelps 3525, from your top level repo directory, use 
      either `firefox target/site/jacoco/index.html` or `google-chrome target/site/jacoco/index.html`
   * That will also work if you are ssh-ing in to CSIL, but only if you have X11 forwarding enabled.
   * If working *directly* on your own machine (i.e. not ssh-ing in), you can probably 
      just double-click on the file `target/site/jacoco/index.html` to open it.
 
Some of the points in the manual inspection may be awarded on the basis of having good test coverage.  
While 100% test coverage is not always the goal, in this particular exercise, it *should be possible*.   

So if you see that you don't have 100% test coverage, go back and write some additional unit tests.

For a review of how to read the test coverage reports provided by Jacoco, see: <https://ucsb-cs56-pconrad.github.io/topics/testing_jacoco_reports/>


# End of description for {{page.num}}

