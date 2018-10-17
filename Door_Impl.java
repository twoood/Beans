package VIC;
import java.util.Random;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "VIC.Door")
public class Door_Impl implements Door{
 
	@Override
	public String Door(String name) {
	Random rand = new Random();
	int  n = rand.nextInt(30) + 1;
	System.out.println(name);

	if (name.equals("Door 1")|| name.equals("Door 2"))
	{

		if (n > 20)
		{
			
			System.out.println("Returning " + name+" status");
			return name + " is open.";
		}
		else if (n > 10)
		{
			
			System.out.println("Returning " + name+" status");
			return name + " is closed but not locked.";
		}
		else
		{
			
			System.out.println("Returning " + name+" status");
			return name + " is closed but not locked.";
		}
	}
	else
	{
		System.out.println(name+" is not recognized.");
		return "Sorry,  " + name + " is not recognized.";
	}
	}	
 
}