# ProBuildsHelp
Helps with getting item builds and runes for League of Legends
Asks for the champion you are playing and pulls up the probuilds.com page on that champion and from there it shows builds, runes and specific players.
Some champions require full names and others have abbreviations shown in the prompt. 

Not super advanced or groundbreaking, just wanted to help a litte with items and runes if someone needs help. 

#Current Iteration
Uses basic boolean logic with switch statements and a lot of clunky, unessecary coding to get user input and then create URL and then using the standard Library desktop class, launch that URL with the native browser of the system. 

#Next Interation
Effiency: Want to make more efficent, lots of boolean logic with switch statement and string literals are not optimized. Want to implement using HashMap with the the champion name being the key and then the ID that identifies that champion on ProBuilds.com to be the value.
Ease of Change: In addition, also want to store all of these values within a text file for ease of access and each time running the program, have it reload the HashMap, causing more time and memory used, but always gets the most up to date additions.
GUI: Want to implment a basic Java GUI using Java Swing, makes more appealing and easier to use for all. 
