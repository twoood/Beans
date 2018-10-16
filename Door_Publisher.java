package VIC;

import javax.xml.ws.Endpoint;
import VIC.Door_Impl;
 
//Endpoint publisher
public class VIC_Publisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/hello", new Door_Impl());
    }
 
}