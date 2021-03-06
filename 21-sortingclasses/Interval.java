import java.util.*;
import java.io.*;

public class Interval {
    public static final double PI = 3.14;
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
	int h = r.nextInt(100);
	int l = r.nextInt(h);
	setup(l,h);
    }

    public String toString() {
	String s = "Interval Number: " + numIntervals + " --> [" + low + ", " + high + "]";
	return s;
    }

    public static void printStuff() {
	System.out.println("Stuff");
    }

    public int compareTo(Interval other) {
	return (this.high - this.low) - (other.high - other.low);
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
	x.printStuff();//we can also call off an instance]

	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	String[] sa = {"frog","toad","iguana","komono dragon","bearded lizard"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));

	int[] ia = {20,1,55,100,33,201};
	System.out.println(Arrays.toString(ia));
	Arrays.sort(ia);
	System.out.println(Arrays.toString(ia));

	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));


    }
}
