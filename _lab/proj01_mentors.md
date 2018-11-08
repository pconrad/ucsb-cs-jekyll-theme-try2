---
layout: lab
num: proj01_mentors
student_num: proj01
ready: false
desc: "Mentor Duties for proj01"
assigned: 2018-11-07 17:00
due: 2018-11-07 19:50
github_org: "ucsb-cs56-f18"
last_before: "Midterm Exam E02"
google_drive_folder_url: "https://drive.google.com/drive/folders/1AIPxe23CNuz8ik_AHCseSw-hn-WV2IK6?usp=sharing"
seating_chart_url: "https://docs.google.com/spreadsheets/d/1IwxSfwdo0p38mooCNZpVPc2uzCRmowsLhqF8pEkaV3I/edit?usp=sharing"
google_drive_folder_name: CS56-F18-Shared
---

This page describe what mentors need to do to support their teams to work on [proj01](/lab/proj01/).

The step numbers below correspond to the steps in the student facing lab instuctions.

Their Step 0, like yours, consists of items they are (ideally) supposed to do before coming to lab on {{page.due | date: "%a, %b %d"}}. (Sorry for short notice.)

# Step 0a: Make sure you have the access you need

You will need:

* To have edit access in the following Google Drive folder 
   * [{{google_drive_folder_name}}]({{google_drive_folder_url}}).  
   * This folder should be accessible only to Instructors, TAs, and tutors/mentors for {{site.course}}, {{site.qxx}}
* Once you have access to that folder, you should be able to edit this spreadsheet as/when needed:
   * [CS56 F18 Lab Seating Chart](https://docs.google.com/spreadsheets/d/1IwxSfwdo0p38mooCNZpVPc2uzCRmowsLhqF8pEkaV3I/edit?usp=sharing)
   * By convention, certain pages of that spreadsheet are published as the seating charts on the [{{github_org}}.github.io](https://{{github_org}}.github.io) website.
* To be an owner in the following github organizations:
   * [ucsb-cs56-webapps](https://github.org/ucsb-cs56-webapps)
       * This gives you the ability to create the official repos for the webapp projects.  Students will have read only access to these.
   * [ucsb-cs56-f18](https://github.org/ucsb-cs56-f18)
        * This gives you the ability to work with the students in the repo they fork to do their work, and to work with their Kanban boards, issues, etc.
* To have TA like access on Gauchospace
   * This is so that you can create a group and a discussion board at Step 3, if necessary.
   * If you don't have this access, ask the instructor to add you.
    
# Step 0b: Choose which team you will mentor

Consult the lab seating chart pages for your lab section:

* https://ucsb-cs56-f18.github.io/info/lab_seating_chart_5pm/
* https://ucsb-cs56-f18.github.io/info/lab_seating_chart_6pm/
* https://ucsb-cs56-f18.github.io/info/lab_seating_chart_7pm/

Let one of the TAs or instructors know which team you want to mentor, and have them add your name to the chart.

Or better yet, access the editable version in the Google Drive folder [{{google_drive_folder_name}}({{google_drive_folder_url}}), and add your name directly to the team of your choice.

# Step 1: Locate the corner of the room where that team is meeting

There should be a flip chart there for them to work from, along with flip chart markers.

If it is available, we might also use Phelps 3526 for one or more of the teams.

Find your team.   Help guide them through introducing themselves to one another.   Try to make sure that everyone is supported and is participating.

In this step, and every step that follows: You should use a light touch
* Let them guide the process as much as possible, and let them lead the way.  
* Be a facilitator and "guide on the side" more than a group leader.  
* If they seem lost, do tep in and take charge just long enough to try to help them get back on track, but
* Always use the smallest possible intervention.
  * As in software: do the *simplest, smallest thing that could possibly work*.

# Step 2: Documenting work on flip chart

Check to see that they are following the instructions at [{{page.student_num}}](/lab/{{page.student_num}}/) for this step.  
As long as they are, stay out of their way, but keep an eye on the process.

You should take pictures of their flip charts (or see that someone else does), and then upload those to the github repo they create later (under a directory called `./cs56/f18/images/proj01`) at the top level of the repo.  The image names are unimportant at this stage; we can always rename them later.  Right now, we just want to capture what they put on the charts.)

# Step 3: Communications Channel

As at every step, check to see that they are following the instructions at [{{page.student_num}}](/lab/{{page.student_num}}/) for this step.  

The biggest one is: no more than 5 minutes on this discussion.

After 4 minutes, give them a deadline, and start creating the discussion board on Gauchospace.

The convention will be to create it at the top of the page, with the name `5pm_team_name`.  We'll also need to create groups.  If this happens a lot, we'll create documentation for how to do it (we'll probably do that on the fly, since we might not need it if everyone chooses Slack, or WeChat.)


# Step 4: Discuss User Journey / Create repo under [ucsb-cs56-webapps](https://github.com/ucsb-cs56-webapps) for your team

Make sure they get started with discussing the User Journey, as documented here [{{page.student_num}}](/lab/{{page.student_num}}/) for this step.  

But quickly, try to pull yourself OUT of the discussion, and while they talk, go do this administrative step:

Under the [ucsb-cs56-webapps](https://github.com/ucsb-cs56-webapps)  organization, create a repo called `ucsb-cs56-project-name` where `project-name` is the name your team chooses for its project.

If you are unable to do so because you are not an owner, consult someone that is already an owner (e.g. a TA, instructor, or even a fellow mentor).

# Steps 5, 6

As with the other "discussion" type steps, your role here is to mostly stay out of the way, but observe, listen, and keep the group on track.   Try to get one of the students to be the discussion leader.  If you end up in that role, try repeatedly to work yourself out of that job.

# Step 7a, 7b, 7c

Just supervise and watch.  They should be able to do this on their own, but do keep an eye out to make sure they are doing it properly.   Advise as needed.

### Step 7d: "Have your mentor review your Kanban board and approve issues"

*THIS* is the most important step of the day, because the students literally cannot proceed without it, and it takes time; unlike creating the repos, where its so fast, that the TA or instructor could do it at the scale of the entire class in about 10 minutes, this is where we really need individual attention from each team mentor.

When giving feedback on issues, do it in writing using comments. Consider asking them questions such as these:

* I wonder whether this is specific enough. Can you clarify x, y and z?
* Tell me more about a and b.  Why does the user need this?  Is it really part of MVP?

That can sometimes be more effective them telling them exactly what to do; but in whatever way you wish to communicate, as long as it is kind and respectful, let the students know (via comments on the issues) what they need to do before feel comfortable approving.

## If you have experience with estimating points

If you have estimated points for CS56 issues before (100 pts, 200 pts, 400 pts), etc:
   * Then, go ahead and put point estimates on the issues
If you have not done this before
   * Find one of the mentors or TAs that has (we can use Slack for this)
   * Sit with them and do the initial estimates hand-in-hand with them
   * This does NOT have to happen during your 50 minute lab section tonight, but it should happen as soon as possible so that the students can get started on planning their work for the rest of the quarter.
   
### Step 7e: "Assignment of Issues"

Try to help guide the student through the assignment of issues.  Let them know that they need to decide how whether to divide up the work into pairs, groups, trios, etc.

Sometimes issues have dependencies on one another, so you can't work on issue A until issue B is finished.

This is where they may also need some guidance in coming up with some Skunkworks issues (the folks who were in Summer 2018 will know what that means) that will help them do more "in parallel".  If you aren't familiar with the Skunkworks idea, ask Sasha, Rachel, Wilson, Zihao, Santha or Prof. Conrad for more info on that.  (If there is time, I'll write something up on the course website about it.)

# What comes next?

I'll have some tasks over the next week for each of the mentors to provide the students with feedback on how they did with their work on proj01.  

This will help get us set up for the way in which we evaluate work for the webapp projects.  

This will include:
* Setting up one private <tt>FEEDBACK_<i>team_name</i></tt> repos under the <tt>{{page.github_org}}</tt>; these are private repos where we give each of the team members read only access.   
   * Mentors put "feedback" (not grades) into these repos.
   * TAs/Instructors add grades
* Setting up four to six individual private <tt>FEEDBACK_<i>githubid</i></tt> repos under the <tt>{{page.github_org}}</tt> for your individual team members.   This is where we will record whether or not the individual team members met each of the criteria for earning points for `proj01`  
   * Note: it would be super nice to have a webapp that would set those `FEEDBACK_*` repos automatically, eh?
   * It is totally possible.  It's a simple matter of programming. I'm happy to walk someone through it.
* After the due date for proj01, checking those criteria for each of your six team members and recording the information.












