package VIC;
import java.util.Random;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "VIC.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {
	Random rand = new Random();
	int  n = rand.nextInt(30) + 1;

	if (n > 30)
	{
		System.out.println(name + " is locked")
	}
	



		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
 
}