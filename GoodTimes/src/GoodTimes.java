import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class GoodTimes {

    private static final int BILLION  = 1_000_000_000;
    private static final int MILLION  = 1_000_000;
    private static final int THOUSAND = 1_000;

    public static void firstAttemtToMeasureTimeDifferende() {
	Date date = new Date();
	System.out.println(date);
	// There is special date, January 1, 1970
	long longdate = date.getTime();
	System.out.println(longdate);

	Date secondDate = new Date();
	System.out.println(secondDate);

	String msg = "Time difference:" + (secondDate.getTime() - longdate);
	inform(msg);


	// getTime returns milliseconds
    }
    
    private static void inform(String msg) {
	String line = String.join("", Collections.nCopies(msg.length(),"="));
	System.out.println(line);
	System.out.println(msg);
	System.out.println(line);
	
    }

    public static void createRandomwithMath() {
	//
	// The first way with Math.random()
	// this is a value between [0.0, 1.0)
	
	long startTime = System.nanoTime();
	System.out.println("Start " + startTime);
	for (int i = 0; i < 5; ++i) {
	    double value = Math.random();
	}
	long endTime = System.nanoTime();
	long diff = endTime - startTime;
	String msg = "Elapsed time: " + diff + " nanoseconds";
	inform(msg);
    }
    
    public static void createRandomWithRandom() {
	// this is Random
	//
	// Random number class
	// 
	Random random = new Random(10);
	long startTime = System.nanoTime();
	List<Double> x = new ArrayList<>();
	String msg  = "Start time in nanoseconds " + startTime;
	inform(msg);
	for (int i = 0; i < 15; ++i) {
	    double value = random.nextDouble();
	    x.add(value);
	}
	long endTime = System.nanoTime();
	long diff = endTime - startTime;
	
	msg = "Elapsed time: " + diff + " nanoseconds";
	inform(msg);
	
	// 
	// Read on lambda expressions
	// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
	//
	x.forEach(e -> System.out.println(e));
	// Modify in place each value, Question from the class
	x.replaceAll(e ->  e * THOUSAND);
	x.forEach(r -> System.out.println(r));

    }
    
    public static void main(String[] args) {
	
	firstAttemtToMeasureTimeDifferende();

	createRandomwithMath();
	
	createRandomWithRandom();
    }

}
