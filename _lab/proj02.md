---
layout: lab
num: proj02
ready: true
desc: "Working on your issues"
assigned: 2018-11-15 17:00
due: 2018-11-28 23:59
github_org: "ucsb-cs56-f18"
---


# Step 1: Hold an Agile Standup Meeting (Scrum)


# Step 2: Understand the process of earning your 1000 points (Read below)


# Step 3: Make a decision about your point awarding

* DEFAULT: only folks assigned to issues earn the points.

* ALTERNATIVE: (requires unanimous team agreement, recorded in feedback repo) All for one, one for all.  ALL team members earn ALL points for every issue completed by team.

# Step 4: Work on your issues


# A note on Skunkworks projects

You may find it helpful to an an issue for a "skunkworks" project.  That's where you build a bit of throwaway code as a "proof-of-concept" or an "experiment".  

For example, if you have 
* never worked with an SQl database before
* never tried to setup an OAuth login before
* never tried to access a Google API before

You might want to do those things in a separate standalong throwaway project before integrating those into your main code base.

For those purposes, you can set up a skunkworks project.

1. Create a issue describing the skunkworks project you want to create
2. Create a repo with the name sw-team-name-issue5  for example, if the issue is #5 on your repo
3. Work on that issue separately in a branch called issue5, then do a "pull request" to the master branch of that same repo.
4. Other than that, it works the same way as regular issues, and you can get points the same way.




## Process in Brief

First the process in brief, then a detailed description of each step.
1. **Issue is created** in Github (by anyone) and placed in "To-Do" column of your Project on github.
2. **Issue is approved and points are estimated** by Mentor, TA or Instructor. 
   As part of this **define clearly what "done" means**.
3. **Issue is assigned** to one or more team members and placed in "In-Progress" column.
4. You **actually work** on the issue.
4. **Issue is completed** and a **Pull Request** is entered. At this point, issue moves to the
   "Needs Review" column.
5. **Pull Request is peer-reviewed** by mentor.  
6. **Feedback is placed in the (private) feedback repo** for
   the team that worked on the issue.
7. **TA or Instructor** assigns a grade (recorded in the feedback repo).
8. **Points are recorded on Gauchospace**

## Process in Detail

1. **Issue is created** in Github (by anyone) and placed in "To-Do" column of your Project on github.
   
   For the issues and Kanban board links for your teams, see the [Teams Page](/info/teams/) 

2. BEFORE you start working on the issue, get the issue "approved" by a mentor, TA or instructor,
   and get a point estimate.  This happens by having either a mentor, TA, or instructor
   make a comment of the form: `Approved, Estimate 200 points` on the issue, on Github.
   
   Point estimates should be 100, 200 or 400. (Guidelines for point
   estimation appear below.)   If you start working on the issue before it is approved and estimated,
   you do so at your own risk.  
   
   It is very important that the mentor be sure there is a clear **definition of "done"**.
   Try to make sure that what "done" looks like is as clearly spelled out as possible.
   If the issue is too vague, it will difficult to estimate, and even *harder* to determine
   later whether students have earned the points.  This is a very important step! 
   Discuss the *definition of "done"* with the team.
       
3. **Issue is assigned** to one or more team members and placed in "In-Progress" column.

   You (or your mentor) will drag the issue from the "To-do" column into the "In-Progress"
   column on your project page, here.  Also, you or your mentor can assign people to the 
   issue on github.  This helps us track who is working on what, and simplifies the process
   later of who gets credit.  (Note that you can make adjustments to that in the pull request
   if who worked on something and who should get credit changes.)
   
   Also **discuss the definition of "done"** with the folks to whom the issue is assigned.
   
4. This is the stage where you actually work on the issue.  Get it to the "done" criteria.
   
   
4. **Issue is completed** and a **Pull Request** is entered. 

   At this point, issue moves to the
   "Needs Review" column (You should add a "Needs Review" column to your Kanban board when the first issue
   gets to this stage.  If you already put any issues in the Done column, create this column and move them back.)
   
   After creating the pull request, add a comment that references the issue
   that it addresses.  If you use the syntax `#` followed by an issue number, 
   e.g. `fixes #4`, then the `#4` becomes a hyperlink to the issue.  This is very
   helpful.
   
   Then, notify your mentor that the issue is done, and ask them to review it.
   
5. **Pull Request is peer-reviewed** by mentor.  

   MENTORS: More detail about peer-reviewing issues will be posted on the [proj02_mentors](/labs/proj02_mentors/) page soon.
   It will be similar to this process from past instances of CS56: 
   <https://ucsb-cs56-pconrad-mentors.github.io/topics/legacy_code_projects_giving_feedback/>
   
6. **Feedback is placed in the (private) feedback repo** for
   the team that worked on the issue.
      
7. **TA or Instructor** assigns a grade (recorded in the feedback repo).

   
8. **Points are recorded on Gauchospace**

   

# Guidelines for point estimation

* 100: Straightforward change; just follow the example. It's clear what to do and how to do it.
* 200: Involves a bit of work, and a bit of figuring things out, but if you work at it a bit, it
   all falls into place.   The process has been outlined pretty clearly, and we've gone over it.
* 400: Involves more than just applying concepts from a tutorial that we've gone over in class.
   Either:
   * It involves applying concepts from a tutorial we have *not* gone over
   * It involves indepdendent research (e.g. google searches, StackOverflow, etc.) to
      figure out how to solve the problem.
   * You can see that there are some "known unknowns" and possibly some "unknown unknowns"
      that will have to be addressed.

Note that these are *initial estimates*.  After the fact, you can present a case why a point
value should be increased.   The case involves explaining the good faith effort you made to
solve the problem, and why it was more complex than the initial estimate might have indicated.

It does NOT involve conversations such as "we started the night before it was due" or 
"my cat ran over my dog, and then my hamster threw up on my computer, and then I broke my leg".
