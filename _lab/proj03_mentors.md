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
