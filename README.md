# ucsb-cs-try1

This is my first attempt at factoring out a remote theme for supporting UCSB CS course repos.

This first attempt only tries to factor out things into a better way of supporting the same functionality that already exists.

Here's the plan

| Stage | Goal | Repo |
|-------|------|------|
| 1     | Move to remote theme for course instance repos | ucsb-cs-try1 |
| 2     | Move to remote theme for course heading repos | ucsb-cs-try2 |
| 3     | Try to marry those together into one remote theme |    |
| 4     | Try to move to structure with individual quarters under same github org | |
| 5     | Try to move to remote storage to select which quarter | |
| 6     | Try to move to navigation with Bootstrap instead of Jquery mobile | |

Features Removed
---------------

The following features were removed because it wasn't clear there was any widespread use of them.

If they are desired, they can be added back in a future release:

* Support for flipclock, via `flipclock.js` and `flipclock.css`

TODO
----

* In `lecture_next_prev_links.html`, there is a loop that's probably O(n^2).  Try replacing with JS code that will run in time O(n).   
* Can `head.html` and `head_hwk.html` be refactored into a single file with some variables to switch on or off the extra css and js for homework assignments?
