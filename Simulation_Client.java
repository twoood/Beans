package VIC;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import VIC.Door;

/* This example does not use wsimport. Instead, it
creates a service instance manually. */
 
public class Simulation_Client{
 
	public static void main(String[] args) throws Exception {
 
	URL location_of_wsdl = new URL("http://localhost:8080/door?wsdl");
 
        QName name_of_service = new QName("http://VIC/", "Door_ImplService");
 
        Service service = Service.create(location_of_wsdl, name_of_service);
 
        Door hello = service.getPort(Door.class);


	String response = hello.Door(args[0]);
 
        System.out.println(response);
 
    }
 
}