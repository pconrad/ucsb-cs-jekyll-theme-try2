---
layout: lab
num: proj03_mentors
student_num: proj03
ready: false
desc: "Mentor Duties for proj03"
assigned: 2018-11-29 17:00
due: 2018-11-29 17:00
all_issues_due: 2018-12-04 17:00
final_lab_start_time: 2018-12-06 17:00
github_org: "ucsb-cs56-f18"
google_drive_folder_url: "https://drive.google.com/drive/folders/1AIPxe23CNuz8ik_AHCseSw-hn-WV2IK6?usp=sharing"
seating_chart_url: "https://docs.google.com/spreadsheets/d/1IwxSfwdo0p38mooCNZpVPc2uzCRmowsLhqF8pEkaV3I/edit?usp=sharing"
google_drive_folder_name: CS56-F18-Shared
TA_reader_instructor_initials: "SR, JJ, or PC"
---

# Checklist before lab

Here's a checklist of things that should have been done by either you, or your team, based on the instructions from the [{{page.prev_student_num}}](/lab/{{page.prev_student_num}}/) and [{{page.prev_num}}](/lab/{{page.prev_num}}/):

1. Check the Kanban board.  Check that the students are on track to earn 1000 points.   If not raise your concerns with the team.

2. If these columns don't already exist, create columns for "Ready for QA (mentor)" and "Ready for grading (TA)" 
   in between the "In Progress" and "Done" columns.
   
   Anything the students have put into "Done", drag back into "Ready for QA (mentor)" if you haven't QA'd it yet
   (including writing all the needed information in the `FEEDBACK_teamname` repo for the team.)
   
3. Make sure that *you* are not the bottleneck for their progress, that is:
   * If you have issues that are waiting for QA, get the QA done (instructions below)
   * If they are new issues they've entered or are working on that have not been approved or estimated,
      review them and let them know either they are approved/estimated, or what your concerns are.
  
4. For QA purposes, ask the students if they have a version of the app up and running on Heroku.
   * If they do, ask them to put a link to that in the README.md of their forked repo.   If they already did
      this, and it wasn't part of any point estimate you already made, you can make a new issue and give them
      100 points for doing this, once it's in the README.md.
   * If they don't, check in with them to see whether it's feasible to get one of those up and running.
      You can make this a 100 point issue if it helps the team to get to 1000 points and/or helps to 
      incentivize getting this done.
   * Communicate with them over your communication channel before lab about this if possible.
   * If not, then do it during lab on Thursday.



# During lab on {{page.assigned | date: "%a, %b %d, %y"  }}

## Step 1: Agile Standup

The group should hold an Agile Standup.   Record attendance in the README.md of the Feedback repo.

It could be a note like:

```
# Standup 11/29/2018

Present: Amy, Brad, Chris, Dani, Eileen
Late: Frank
Absent: Jane
```

The standup should do TWO things this week
* inform team about each team member's accomplishments/commitments/roadblocks
* inform team about progress on all issues on the Kanban board

## Step 2: Help Team make a plan to get to 1000 (or 1100)

The team needs to get to 1000 (or 1100).  That includes having all of their issues QA'd and graded 
*before* the final lab starts at {{ page.final_lab_start_time | date: "%a, %b %d, %y at %h:%m %p"  }}

The deadline I gave the teams for having all their issue ready for QA is:
* {{page.all_issues_due | date: "%a, %b %d, %y at %h:%m %p"  }}

That gives you about 48 hours to do the final QA.  That's not a lot of time.

And that gives them ALMOST NO time to respond if they are problems, before grading happens.

* Communicate with your team about what will help you get the QA done earlier, 
   so that they have time to address problems, if any.
* If you want to give them more time after {{page.all_issues_due | date: "%a, %b %d, %y at %h:%m %p"  }}, you 
   *may* at your discretion, but realize that it means that *you* will then have less time to get *your* work
   done.  We need to have all of the QA work done BEFORE {{page.all_issues_due | date: "%a, %b %d, %y at %h:%m %p"  }}
   so that the TAs and I can do the final grading before or during the final lab.

## Step 3: Help Team Identify and Resolve Roadblocks

Finally, after all this planning, there is, we hope coding.  

Help the students with their coding in any way you can.

# How to do the QA Step


Here is an outline of the roles and responsibilities for grading of legacy code work.

* The <b>students</b> will submit their work by making pull requests that resolve issues.  
    * This is the one and only way to submit work for the legacy code labs.
* The <b>mentors</b> are responsible for handling the pull requests, and putting information in the feedback repos.
* The <b>TAs and Readers</b>, as a team, under the supervision of the <b>instructor</b> are responsible for grading. 



# Mentors: Before Writing your Feedback

You should do at least the following due diligence:

* Clone their repo yourself, and try compiling, running, etc. on the branch from which they did their pull request.
* Note any problems you encounter.
* Check which issues the students claim to be closing with the pull request.  See if you are satisfied that the issue is resolved. IF NOT, THEN REOPEN THE ISSUE WITH FEEDBACK.  
* In your "public" feedback, i.e. the feedback in comments on the issue itself, be VERY DIPLOMATIC and VERY FACE SAVING. Make only factual statements.   If there is anything too harsh or embarassing, put it in the PRIVATE feedback repo, and just make reference to that in the issue comments. For example: "Pull request 7 does not completely resolve issue 11, so I am reopening it. In particular, the bug when you click on the foobar button still seems to be present. See the private feedback repo for more details."  
* In the private feedback repo, you could say things like that are more critical: "We discussed structuring the code like x, but it appears you did not follow my advice. I wonder whether you may like to fix some of the indentation and remove some of the seemingly irrelevant comments that pertain to code that has already been removed."  Even there, try to practice diplomacy.

# Mentors: Writing Feedback (but NOT grading)

The first thing to do is to put in a heading appropriate to the "round" of work that the students did.  
List it as "Mentor evaluation" with your name in parens.

For example:

<tt># Mentor evaluation (Chris Helpfulperson) </tt>

Then, under that heading, list the issues that the students worked on.  It is helpful if you can:

* provide a link to the pull request.
* specify the issue number and title
* make that a clickable link to the issue
* write down the number of points that the issues was estimated for, along with any request from the
  students for additional points, where applicable.
  
Example:


```

Pull request: https://github.com/UCSB-CS56-Projects/cs56-games-hopscotch/pull/12

* [Issue: #7](https://github.com/UCSB-CS56-Projects/cs56-games-hopscotch/issues/7) Change the menu

| +o?-  | Summary | Comments  
|-------|------|--------|
|   o   | Did they solve the core problem of the issue? |   |
|   o   | Is the code style and organization satisfactory? |   |
|   o   | Did they break anything else or create unintended consequences? |   |


Original Estimate: 250.  Student Requesting 300 in comment.


* [Issue: #97 Update JUnit tests](https://github.com/UCSB-CS56-Projects/cs56-games-hopscotch/issues/97)

| +o?-  | Summary | Comments  
|-------|------|--------|
|   o   | Did they solve the core problem of the issue? |   |
|   o   | Is the code style and organization satisfactory? |   |
|   o   | Did they break anything else or create unintended consequences? |   |

Estimate: 200 


* [Issue #26: Change Help Menu to Make it Non-Editable](https://github.com/UCSB-CS56-Projects/cs56-games-hopscotch/issues/26)

| +o?-  | Summary | Comments  
|-------|------|--------|
|   o   | Did they solve the core problem of the issue? |   |
|   o   | Is the code style and organization satisfactory? |   |
|   o   | Did they break anything else or create unintended consequences? |   |

Estimate: 50
```

Then, under each issue, put some comments to help guide the TA/Instructor that will do the actual grading.  

* If there are any bugs that you find, see whether the bugs were there in the code BEFORE the students worked on it. If the 
   bug is a NEW bug, that's something you'll want to mention.
* Look at the "diff" provided in the pull request.  Look at the code.  Observe whether the code looks well written,
   naming, indentation, general code style, whether the OOP aspects are improving, or getting worse, whether test
   coverage is improving, or getting worse, etc.
* Then, write a few words of overall feedback that will provide helpful information to  the TA/Instructor
   as they decide whether to award the exact number of points, fewer points, or extra points.
* It is probably *not* appropriate to specifically *recommend* exact, fewer, or extra points.  That looks and smells like
    "grading", which you are NOT authorized to do.   However, pointing out factual information such as the following is
    entirely appropriate:
    
    * The menu looks better than it did before
    * The code is better structured (or: more fragmented)
    * The test coverage is improved (or: more classes were added, but without any test coverage)
    * etc.
* If issues are closed successfully, then note this in the feedback repo.

Those things all send a signal to the TA/Instructor of what to look for, but stop short of recommending a specific action.
If you have any questions on this, please consult your instructor.

If the pull request does in fact improve the code, and does not make anything worse, then *accept the pull request* and note that you did so in the feedback repo.  Delay accepting the pull request ONLY if/when there is some serious problem with the code the students have written.    

If you do NOT think you can accept the pull request, then the sooner you indicate this, and the specific concerns you have, the better.  The worst situation is to end up at the end of the course with three dozen unresolved pull requests across 15 repos.   Please don't let that happen!   Deal with them as soon as you can!
  


# TA/Instructors: Do the grading 

Here's how grading works for TA/Readers/Instructors:

* Periodically, making a sweep through the feedback repos.
* As you see information about closed issues, make an independent judgment about each case.  
* As a TA/Reader doing grading, if/when, you see that the issue is closed, and you are satisfied with the point value assigned, then do these two things:

1. NOTE that you have awarded points in the FEEDBACK repo.  
    * This note should have your initials ({{page.TA_reader_instructor_initials}}), i.e initials of an instructor or a TA
    * The commit should also be done by the github id of an instructor or TA
    * It should indicate how many points were awarded.
    
2. In the feedback repo, near the bottom, add a section "Points awarded by instructors/TAs"
    * Here, just make a running tally of the points added into proj1, proj2, proj3, proj4.  
    * This section should answer the question: the 250 points in proj1, and the 100 points in proj2, where do they come from? (See example below).
    
3.  Record or update the current point total for proj1, proj2, proj3, or proj4 in Gauchospace.
    
```
# Points awarded by TA/Instructor

## proj1

* 200: all 200 points from issue #7
* 50: first 50 of 150 points for issue #8

Total: 250

## proj2

* 100: last 100 points of 150 for issue #8.

Total: 100

## proj3

no points awarded yet

## proj4

no points awarded yet

```


    

