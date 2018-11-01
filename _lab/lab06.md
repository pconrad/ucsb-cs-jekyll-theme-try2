---
layout: lab
num: lab06
prev_num: lab03
ready: false
desc: "Getting Started with Spring Boot Webapps"
assigned: 2018-11-01 17:00
due: 2018-11-09 23:59
github_org: "ucsb-cs56-f18"
starter_repo: "https://github.com/ucsb-cs56-f18/STARTER_lab06"
last_before: "Midterm Exam E02"
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




# Step 0: If you are working on your own machine

You can skip this step if:
* You are working on CSIL
* You are working on your own machine, but you already did this step for {{page.prev_num}}.

Otherwise, visit the page for [{{page.prev_num}}](/labs/{{page.prev_num}}) and follow the instructions under Step 0 to 
* Install JDK for Java 8 on your machine
* Install Maven on your machine
* Install the Heroku CLI on your machine.

# Step 1: Create a repo

Create an empty project repo under the {{site.org}} github organization.

| If working like this | Create a repo with this name|
|----------------------|-----------------------------|
| Alone                | <tt>{{page.num}}-githubid</tt>  |
| In a pair            | <tt>{{page.num}}-githubid1-githubid2</tt> (put `githubid1` and `githubid2` in alphabetical order |
| In a group of three  | <tt>{{page.num}}-githubid1-githubid2-githubid3</tt> (put `githubid1`, `githubid2` and `githubid3` in alphabetical order |



# Step 5: Login to Heroku 

If you didn't already create a Heroku account on the free plan, do so now.  There is additional information in the instructions for [{{page.prev_num}}](/labs/{{page.prev_num}}).

Then, at the command prompt, use this command to login to Heroku:

```
heroku login
```

Additionally, open a web browser window and login to heroku at <https://dashboard.heroku.com>.

# Step 6: Create a new Heroku App using the Heroku CLI

Logged into CSIL (or one of the machines in the CSTL, i.e. Phelps 3525), use this command to login to Heroku at the command line:

```
heroku login
```

Then, use this command to create a new web app running on heroku.  Substitute your github id in place of `githubid`.  Note that you should convert your githubid to all lowercase; heroku web-app names do not permit uppercase letters.

A reminder that this is an individual lab, so you should complete it for yourself, i.e. there is only one github id in the name, not a pair of github ids.   

Note: please do not literally put the letters <tt><i>githubid</i></tt> in your app name; you are meant to substitute your own github id there.


<tt>heroku create cs56-{{site.qxx}}-<i>githubid</i>-{{page.num}}</tt>


# Step 7: Modify the pom.xml file to refer to your heroku app

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



# Step 8: Submitting your work for grading

When you have a running web app, visit <{{page.gauchospace_url}}> and make a submission.

In the text area, enter something like this, substituting your repo name and your Heroku app name:

<div style="font-family:monospace;">
repo name: https://github.com/chrislee123/{{page.num}}-chrislee123<br>
on heroku: https://cs56-{{site.qxx}}-chrislee123-{{page.num}}.herokuapp.com<br>
</div>

Then, **and this is super important**, please make both of those URLs **clickable urls**.

The instructions for doing so are here: <https://ucsb-cs56-pconrad.github.io/topics/gauchospace_clickable_urls/>




