package VIC;
import java.util.Random;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "VIC.Window")
public class Window_Impl implements Window{
 
	@Override
	public String Window(String name) {
	Random rand = new Random();
	int  n = rand.nextInt(4) + 1;
	System.out.println(name);

	if (name.equals("Window 1") || name.equals("Window 2") || name.equals("Window 3")) {
		//open, half open, closed, closed and locked
		if (n == 1)
		{
			System.out.println(name + " is open.");
			return name + " is open.";
		}
		else if (n == 2)
		{
			System.out.println(name + " is half open.");
			return name + " is half open.";
		}
		else if (n == 3)
		{
			System.out.println(name + " is closed.");
			return name + " is closed.";
		}
		else
		{
			System.out.println(name + " is closed and locked.");
			return name + " is closed and locked.";
		}

	}
	else 
	{
		if (name.contains("Door"))
		{
			System.out.println(" ");
			return " ";
		}
		else
		{
		System.out.println(name+" is not recognized.");
		return "Sorry,  " + name + " is not recognized.";
		}
	}
 	}
}