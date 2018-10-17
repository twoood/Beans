package VIC;

import javax.xml.ws.Endpoint;
import VIC.Door_Impl;
 
//Endpoint publisher
public class Door_Publisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/door", new Door_Impl());
    }
 
}