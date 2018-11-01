---
layout: lab
num: lab06
prev_num: lab03
ready: true
desc: "Getting Started with Spring Boot Webapps"
assigned: 2018-11-01 17:00
due: 2018-11-09 23:59
github_org: "ucsb-cs56-f18"
starter_repo: "https://github.com/ucsb-cs56-f18/STARTER_lab06"
last_before: "Midterm Exam E02"
gauchospace_url: "https://gauchospace.ucsb.edu/courses/mod/assign/view.php?id=1639566"
---

Coming soon

<hr>

Previously, in {{page.prev_num}}, you worked with a small Hello, World app based on a web technology known as SparkJava.

We learned a few concepts there, such as:
* Working with Maven
* Getting a simple Java web app up and running on localhost and checking that it is up and running
* Getting that webapp up and running on Heroku

We are now going to turn to a different Java web framework, one called Spring Boot.

Spring Boot is:
* A bit more challenging to work with that SparkJava, but
* More widely supported, documented
* An entry way to learning about a technology called Spring, which is widely adopted and used in practice in "real world" Java web app development.

We'll start by putting up a simple Hello World app, and then a little at a time, we'll add some features to that app, documenting as we go.


# Step 0: Choose to work alone, in a pair, or in a trio

You may work alone, in a pair, or in a trio (group of three), but if you work with others, please work with others that are IN THE SAME ROW, IN THE SAME SECTION, assigned to the same mentor as you.  


# Step 1: If you are working on your own machine

You can skip this step if:
* You are working on CSIL
* You are working on your own machine, but you already did this step for {{page.prev_num}}.

Otherwise, visit the page for [{{page.prev_num}}](/labs/{{page.prev_num}}/) and follow the instructions under Step 0 to 
* Install JDK for Java 8 on your machine
* Install Maven on your machine
* Install the Heroku CLI on your machine.

# Step 2: Create a repo

Create an empty project repo under the {{site.github_org_name}} github organization

* Empty means: No `README.md`, no `.gitignore`, and no `LICENSE`

Choose the name based on your githubid, or if working in a pair or trio, based on the combination of your github ids:

| If working like this | Create a repo with this name|
|----------------------|-----------------------------|
| Alone                | <tt>{{page.num}}-githubid</tt>  |
| In a pair            | <tt>{{page.num}}-githubid1-githubid2</tt> (put `githubid1` and `githubid2` in alphabetical order |
| In a group of three  | <tt>{{page.num}}-githubid1-githubid2-githubid3</tt> (put `githubid1`, `githubid2` and `githubid3` in alphabetical order |

# Step 3: Add pair or trio partners as collaborators

Whoever creates the repo should add the other pair/trio members as collaborators on Github.

# Step 4: Clone repo and pull in starter code

The starter code for this assignment is in <{{page.starter_repo}}>

To add that as a remote:


<p><tt>git remote add starter {{page.starter_repo}}</tt></p>
	
Then do:

```
git pull starter master
git push origin master
```

Then try runnning the starter code with:

```
mvn spring-boot:run
```

It should bring up a running webapp on <http://localhost:8080>.

If so, you are ready for the next step.



# Step 5: Choose a web app and document your choice

Now, choose one of the webapps described at that link below, or come up with your own idea for a webapp.
   *  [Proposed Webapps from when the class rated ideas](/info/proposed_webapps/)

Then:
   
* In the README.md of your repo, make a note at the top of the file indicating which of these proposed webapps you chose.
* Also add your name, and if working in a pair or trio, the names of all members of your group.
* If you choose your own webapp, write a brief description of the app on the README.md of your repo.

# Step 6: Modify the nav bar, and the placeholder pages

You are now going to imagine that you have built a "minimum viable product" for the webapp that you chose.

Imagine what the navigation bar of that app looks like. 
* What options are on that navigation bar?  What is the text on each of those?
* What is on the page that that page links to?

Now modify the code:

* Change the names of the links in `HelloController.java` to be the links you want to link to, instead of `/link1` and `/link2`
* Change the names of the files in `/src/main/resources/templates/` from `page1.ftl` and `page2.ftl` to reasonable names.
* On the pages, replace the text there with a brief description of what would happen on that page.  For example:

<blockquote markdown="1">
On this page, the user will be able to enter the name of a city they want to visit, and press "find coffee shops".  The 
page will then show a list of all the coffee shops in that city.
</blockquote>

OR: 

<blockquote markdown="1">
On this page, the user will enter all of the courses they still need to take in order to graduate.  Those courses will then
be stored in the database so that they are there the next time the users logs in.
</blockquote>

Iterate on this until the navigation bar has a set of options, and a set of placeholder pages that, if you implemented all of them with the functionality described, would be a reasonably good start at the webapp proposed.

# Step 7: Login to Heroku 

If you didn't already create a Heroku account on the free plan, do so now.  There is additional information in the instructions for [{{page.prev_num}}](/labs/{{page.prev_num}}).

Then, at the command prompt, use this command to login to Heroku:

```
heroku login
```

Additionally, open a web browser window and login to heroku at <https://dashboard.heroku.com>.

# Step 8: Create a new Heroku App using the Heroku CLI

Logged into CSIL (or one of the machines in the CSTL, i.e. Phelps 3525), use this command to login to Heroku at the command line:

```
heroku login
```

Then, use this command to create a new web app running on heroku.  Substitute your github id in place of `githubid`.  Note that you should convert your githubid to all lowercase; heroku web-app names do not permit uppercase letters.

A reminder that this is an individual lab, so you should complete it for yourself, i.e. there is only one github id in the name, not a pair of github ids.   

Note: please do not literally put the letters <tt><i>githubid</i></tt> in your app name; you are meant to substitute your own github id there.


<tt>heroku create cs56-{{site.qxx}}-<i>githubid</i>-{{page.num}}</tt>


# Step 9: Modify the pom.xml file to refer to your heroku app

In the `pom.xml` file, find the `<plugins>` element.   Add the following `<plugin>` somewhere inside the `<plugins`> element.  
* That is, the entire contents from `<plugin>` to `</plugin>` should be nested between the the `<plugin>` open tag, and the `</plugins>` close tag.

```xml
  <plugin>
	<groupId>com.heroku.sdk</groupId>
	<artifactId>heroku-maven-plugin</artifactId>
	<version>2.0.3</version>
	<configuration>
          <jdkVersion>1.8</jdkVersion>
          <!-- Use your own application name -->
	  <!-- at Heroku CLI, use heroku apps to list, or use Heroku Dashboard -->
          <appName>ucsb-cs56-pconrad-08-28-18</appName> 
          <processTypes>
            <!-- Tell Heroku how to launch your application -->
            <!-- You might have to remove the ./ in front   -->
            <web>java $JAVA_OPTS -jar target/sparkjava-demo-01-1.0-jar-with-dependencies.jar</web>

          </processTypes>
	</configuration>
   </plugin>
```

The line you need to change is the one that says:

```
 <appName>ucsb-cs56-pconrad-08-28-18</appName> 
```

Change this to the name of your heroku app.  If you've forgotten it, you can locate it either by typing:

```
heroku apps
```

or by logging into the Heroku Dashboard in a web browser at <https://dashboard.heroku.com/apps>

Then, type the following to deploy your web app to Heroku:

```
mvn package heroku:deploy
```

You should see a lot of output.  At the end of this output, you should see something like this:

```
...
[INFO] remote: -----> heroku-maven-plugin app detected
[INFO] remote: -----> Installing JDK 1.8... done
[INFO] remote: -----> Discovering process types
[INFO] remote:        Procfile declares types -> web
[INFO] remote: 
[INFO] remote: -----> Compressing...
[INFO] remote:        Done: 54M
[INFO] remote: -----> Launching...
[INFO] remote:        Released v10
[INFO] remote:        https://ucsb-cs56-pconrad-08-28-18.herokuapp.com/ deployed to Heroku
[INFO] remote: 
[INFO] -----> Done
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 39.539 s
[INFO] Finished at: 2018-08-31T01:56:14-07:00
[INFO] Final Memory: 29M/268M
[INFO] ------------------------------------------------------------------------
```

The line that you are looking for is this one:

```
[INFO] remote:        https://ucsb-cs56-pconrad-08-28-18.herokuapp.com/ deployed to Heroku
```

That is the URL where you should now be able to see your webapp running.  This URL should be accessible from any web browser connected to the internet.

# What if it doesn't work?

If it doesn't work, try these things before asking a mentor, TA, or instructor for help.

1. Make sure you are logged into Heroku at CLI with `heroku login`.  If you exited your CSIL shell (logged out) and logged back in again, you have to login to Heroku again.  Then repeat the commands.
2. Try, try running `heroku apps`.  Make sure the `<appname>app-name-goes-here</appname>` element in the `heroku-maven-plugin` section of your `pom.xml` matches the name of your heroku app exactly.
3. If it does, try `heroku logs --app appname` (substitute the name of your app where you see `appname`).  You'll see the log output of that app on Heroku.   
   * You may find it helpful to open a second Terminal, login to CSIL and the Heroku CLI, and use `heroku logs --app appname --tail`, which keeps the log output running continously.
   * You can also see your logs in a web browser at: <https://dashboard.heroku.com/apps/app-name/logs> (note that you need to put your `app-name` in the URL instead of `app-name`.  
   * You can navigate to this from <https://dashboard.heroku.com/> by selecting your app, clicking on it,  selecting the `More` menu at upper right, and the selecting `Logs`.



# Step 10: Submitting your work for grading

When you have a running web app, visit <{{page.gauchospace_url}}> and make a submission.

In the text area, enter something like this, substituting your repo name and your Heroku app name:

<div style="font-family:monospace;">
repo name: https://github.com/chrislee123/{{page.num}}-chrislee123<br>
on heroku: https://cs56-{{site.qxx}}-chrislee123-{{page.num}}.herokuapp.com<br>
</div>

Then, **and this is super important**, please make both of those URLs **clickable urls**.

The instructions for doing so are here: <https://ucsb-cs56-pconrad.github.io/topics/gauchospace_clickable_urls/>




