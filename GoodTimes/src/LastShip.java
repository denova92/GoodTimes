import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;

public class LastShip {
	
	public static void main(String... string)
	{
		Date d = new Date();
		
		System.out.println(d);
		
		long value = d.getTime();
		
		System.out.println(value);
		
		long newValue = -10000;
		
		Date d1 = new Date(newValue);
		
		System.out.println(d1);
		
		int seed;
		Random random = new Random();
		
		LinkedHashSet<Date> dates = new LinkedHashSet<>();
		
		for(int index = 0; index < 5; ++index)
		{
			Date r = new Date(random.nextInt() * 1000000);
			dates.add(r);
		}
	}

}
