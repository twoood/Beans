UAH CS-453 Project 2
---------------------------
Due: 10/25/2018

Written by:
------------
Cailin Simpson
Tom Wood

Project Structure:
------------------------------------------

Client:
------------
Simulation_Client.java

Publishers:
--------------
Window_Publisher.java
Door_Publisher.java

Interfaces:
-------------
Door.java
Window.java
VIC.java

Services:
--------------
Window_Impl.java
Door_Impl.java


IMPORTANT NOTE:
--------------
If running in linux lab, the bat files won't work,you must run the following commands from within the VIC directory:

Door Server:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Door_Publisher

Window Server:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Window_Publisher

Client:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Simulation_Client "Door 1" <or whatever argument you want to pass>



