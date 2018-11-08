---
layout: lab
num: proj01
ready: false
desc: "Starting your project: Story Map"
assigned: 2018-11-07 17:00
due: 2018-11-12 23:59
github_org: "ucsb-cs56-f18"
---

# Preparation

Before you come to lab, please watch at least the first two of these videos.  If possible, watch all three, but at least the first two:

* Part 1 (12:12) (Planning): <https://youtu.be/IsuIZaqnIuU>
* Part 2 (10:15) (Using a Github Project Kanban Board): <https://youtu.be/8U0FezxxMGU>
* Part 3 (16:28) (More User Stories and Issues): <https://youtu.be/lIB0WJzgSs8>

If you want to reference the slides from the videos, they are here: 
* [From User Story Mapping to Kanban in Github](https://docs.google.com/presentation/d/1UD5qIm5njZFF2s8OvCJdJPnsR_VvnavcZRP9cXRqRNw/edit?usp=sharing), a presentation by Phill Conrad and John Cutler


# Creating Your Story Map

## Step 1 (Graded):  Gather in your team, and start a flip chart

See the new seating chart here to know where to find your team.

* <https://ucsb-cs56-f18.github.io/info/lab_seating_chart_5pm/>
* <https://ucsb-cs56-f18.github.io/info/lab_seating_chart_6pm/>
* <https://ucsb-cs56-f18.github.io/info/lab_seating_chart_7pm/>

We will set up white board charts for each of you, along with flip chart markers, in four corners of the room.

Please start by coming up with the **name for your project**.  It should be something that can be used as the name of a github repo, so let's keep the number of characters to fewer than 20, e.g. `"Gaucho GE Grabber"` is 18.   

For example, if your project name is `Gaucho GE Grabber` your repo will end up being `ucsb-cs56-gaucho-ge-grabber`
* Your project name can be mixed case and have spaces, e.g. `"Gaucho GE Grabber"` 
* In repo names we are going with all lowercase, to keep things simple

Write the name of your project, your mentor, and the names of the people on your team, (with a checkmark beside those that are present, and an X by those that are absent.)

Example:

<div style="width: 30em; height: 20em; border: 4px solid #ccc; padding: 1em;" markdown="1" >

# Project: Gaucho GE Grabber

Mentor: Julia Roberts

Team: Phill Conrad ✓, Jinjin Shao ✓, Santha Ramamoorthy ✓, Henry Yang ✗, Oprah Winfrey ✗ 

</div>

Being present for today's lab, and making sure your name is on the flip chart with a ✓ is 20% of your grade for today's work.

## Step 2: Discuss the User Journey

As a team, discuss the "user journey" for your proposed application. 

That is, try to describe all of the events that lead someone to seek out your webapp and have an interaction with it, or perhaps a series of interactions. 

There should be a beginning, a middle and an end, where **value is exchanged**: 
* the user came with a *goal, need, or desire*, and 
* that goal was *met*, that need was *satisfied*, or that desire was *fulfilled*. 

Identify: 
* What is that goal, need or desire?
* What is the series of events, in chronological order?

Discuss this with your group, and on your paper, write down whatever comes to mind.  

IF IT IS HELPFUL, you *could* use the form shown in the video, and illustrated in class, where you have a series of stories that form column headings across the top of the page, and then you have descriptions of specific user interactions as sticky notes in the columns, as illustrated here (click for larger image):

<a href="/lab/proj01/story_map_example.png" data-ajax="false">
<img src="/lab/proj01/story_map_example_30pct.png" alt="Story Map Example">
</a>

BUT: at this stage, it is more important to get the ideas flowing.  There is no specific "right or wrong" way to get your ideas down on the paper.  Just write something
that captures the group consensus, or the candidate proposals, for the "user journey".

It can take any form: a list, or pictures,  a collection of <tt>As a __ I can __ so that __ </tt> type stories, or any combination of those.  Don't get bogged down on what form it takes.  Just get something down.

NOTE: Try to keep your description VERY HIGH LEVEL, avoiding specific implementation details.

* Good:  User selects a beverage from among several choices
* Too much detail: User clicks on a drop down menu; each beverage has an image which flashes with an animation as you hover over it, etc. etc. 

You don't have to do this "perfectly" the first time.  You may need to first get it all out as "brain dump" that contains too much detail, and then move to a higher level.  But get to the higher level as soon as you can.

Don't move on to the next step until you have the "spine" of your customer journey captured in some fashion.

You'll know you have it, and you are ready for this step when:

* It tells a coherent story.  You can describe this to any reasonable person 
   (e.g. a UCSB student that isn't in this class, particularly one that might be a target user) 
   and they will be able to follow what you are saying.
* None of your "spine" should be "implementation" focused.    It shouldn't depend, for example, even on whether
  it happens to be a webapp, or a mobile app, or even an app at all.    It shoudn't depend on technology specifics.

* The <b>value exchange</b> part is clearly identified: the goal/need/desire of the user, and how that gets acheived/met/fulfilled

## Step 3: Move towards minimum viable product

Now you have an outline, in some form (whatever form seemed reasonable to you)

At this stage, the story you have might have gone in one of two directions:

* **Grand Vision** (GV): You might have a story that really is very much your "ideal dream state" of the application when fully built out.   Keep in    mind that this may be far more than you can reasonably accomplish in the next 4 weeks.
* **Minimum Viable Product** (MVP) You might have already been thinking in terms of "minimal viable product", and you might have a really nice thin slice of value for your end user, something you might *actually* be able to deliver in  4 weeks (or 1 week, or even 1 day.)
   
It's likely that each of our teams will be somewhere on the spectrum between these two extremes.  Discuss where you think
your team is on that spectrum.
   
Assuming that your team is somewhere closer to GV than to MVP, you'll now want to set aside the description of your
GV for the moment.  Use it as a reference to inform your efforts to redo the exercise, but focusing on an MVP.

Maybe you can draw on top of your GV description, and circle the parts (in a different color) that you think might
be part of your MVP.

The big question to keep in mind is:

> How can we make "this" possible for the user with less complexity, less code, less time

Here "this" is the goal/need/desire.


## Step 4: (Optional) Make a new chart in the form shown in part 1 of the video

At this stage, you need to make a decision.  
* Are you ready to go straight to user stories and tasks, as shown in part 2 of the video?
* Or, would it help to first make a new user story map, in the format shown in part one of the video (and illustrated in the picture?)

If making a new map would help, do that.  If you are ready to go staight to user stories and issues in Github, then go to the next step.

## Step 5: (Required, Graded) Make a Kanban board for your project

Now, we are at the part that is most important to the future success of your project, and the part for which you will be graded (this is the other 80% of your grade for today's work.)

### Step 5a: Locate the repo your mentor created for you.

Your mentor will have set up a github repo for your project under the organization [ucsb-cs56-webapps](https://github.com/ucsb-cs56-webapps]. 

(If you can't find that repo,  ask your mentor for help.  If that repo doesn't exist yet, you mentor should look at the [{{page.num}}\_mentors](/lab/{{page.num}}_mentors/) page for instructions on what they should do to set it up.)

This repo is *read only* for you.  So you'll need to fork it, which is the next step.

### Step 5b: Fork the repo into the [{{page.github_org}}](https://github.com/{{page.github_org}})  organization

You will do your work in a *fork* of this repo.  Take these steps:
1. One member of your team should fork the repo to the [{{page.github_org}}](https://github.com/{{page.github_org}}) organization.
2. That member should then add ALL of the other members of your team to that repo as collaborators **with admin access**.
   (If you are not sure what that means, consult with your mentor.)
3. In the README for that fork of the repo, add a section with the heading `# Fall 2018` and under that heading, put down the first names (only) and the github ids for the members of your team.  Also write 1-2 sentences describing the main idea of your webapp (this is NOT a long detailed description; just the highest level description possible.)


   


<hr>

Credits: Many thanks to [John Cutler](https://twitter.com/johncutlefish?lang=en) for his assistance in consulting on this project step.
