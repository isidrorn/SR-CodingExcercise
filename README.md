# SR-CodingExcercise

## Technologies
Project is created with:
* Java version: 1.8
* Maven version: 3.8.7
* JUnit version: 4.11

## Assumptions

Following the "simple library" instructions I made next assumptions: 

Meant to be imported by the game client or such.
It is not runnable nor interactive. 
Deliverable is in non-executable .jar format
Since it isn't stated how many concurrent Boards can exist it is an instantiable POJO else should be a Singleton
No console prints or logs for debugging due to simplicity of code, but would add logging if project was somewhat bigger

Given there arent many constraints in the spec I have added my own measures to ensure library users cant: 
- Change team's name or locality after creation 
- Change a game's name 



## Setup
Checkout project and import into workspace as Maven Project
