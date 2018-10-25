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
If running in linux lab, the bat files won't work.

The reason is the default version of Java in the lab is Java 10, not 8.
For this reason, the client and servers can't run. 
You have the option of either using the provided bash scripts.

Door Server:
./run_door.sh

Window Server:
./run_window.sh

Client:
./run_client.sh Door 2 <or whatever argument you want to pass>

OR, you can run the commands manually.

Door Server:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Door_Publisher

Window Server:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Window_Publisher

Client:
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp ../ VIC.Simulation_Client "Door 1" <or whatever argument you want to pass>



