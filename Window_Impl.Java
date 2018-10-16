package VIC;

import java.util.Random;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "VIC.VIC")
public class Window_Impl implements VIC{
 
	@Override
	public String VIC(String name) {
	Random rand = new Random();
	int  n = rand.nextInt(4) + 1;

	//open, half open, closed, closed and locked
	if (n == 1)
	{
		System.out.println(name + " is open.")
	}
	else if (n == 2)
	{
		System.out.println(name + " is half open.")
	}
	else if (n == 3)
	{
		System.out.println(name + " is closed.")
	}
	else
	{
		System.out.println(name + " is closed and locked.")
	}

		return "Window status returned";
	}
 
}