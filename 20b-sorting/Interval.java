import java.util.*, java.io.*;

public class Interval {
    private Random r = new Random();
    private int low, high;
    private int numIntervals = 0;

    private void setup(int l, int h) {
	high = h;
	low = l;
	numIntervals++;
    }

    public Interval(int l, int h) {
	setup(l,h);
    }

    public Interval() {
	h = r.nextInt(100);
	l = r.nextInt(high);
	setup(l,h);
    }

    public String toString() {
	String s = "Interval Number: " + numIntervals + "[" + low + ", " + high + "]";
	return s;
    }

    public static void printStuff() {
	System.out.println("Stuff");
    }

    public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	    System.out.println(new Interval());
	}
	/* works b/c printStuff is static
	   it belongs to the class and is created with the class 
	   not with the instances
	   we can call it without interval b/c we're in the class
	*/
	printStuff();
	Interval.printStuff();//calling off the class, like Math.sqrt
	Interval x = new Interval();
	x.printStuff();//we can also call off an instance
    }
}
