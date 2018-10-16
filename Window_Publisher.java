package VIC;

import javax.xml.ws.Endpoint;
import VIC.Window_Impl;
 
//Endpoint publisher
public class VIC_Publisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/window", new Window_Impl());
    }
 
}