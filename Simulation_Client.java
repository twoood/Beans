package VIC;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import VIC.Door;
import VIC.Window;

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


    URL location_of_wsdl_1 = new URL("http://localhost:8080/window?wsdl");
 
        QName name_of_service_1 = new QName("http://VIC/", "Window_ImplService");
 
        Service service1 = Service.create(location_of_wsdl_1, name_of_service_1);
 
        Window window = service1.getPort(Window.class);


	String response1 = window.Window(args[0]);
 
        System.out.println(response1);
 
    }
 
}