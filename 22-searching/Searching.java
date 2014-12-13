import java.util.*;
import java.io.*;

public class Searching implements Comparable{
    private Comparable[] a;
    private int last = -1;
    private Random r = new Random();

    public Searching(int x) {
	a = new Comparable[x];
	a.fill();
    }

    public Searching() {
	this(15);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public void fill() {
	for (int i = 0; i < a.length; i++) {
	    a[i] = r.nextInt(100);
	}
	last = a.length - 1;
    }

    public void additem(Comparable item) {
	if (last >= a.length) {
	    Comparable[] b = new Comparable[a.length+1];
	    for (int i = 0; i < a.length; i++) {
		b[i] = a[i];
	    }
	    a = b;
	}
	a[last + 1] = item;
	last++;
    }

    public void sort() {
	Arrays.sort(a);
    }

    public static Comparable lsearch(Comparable item) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i].equals(item) == 0) return a[i];
	}
	return null;
    }

    /* binary search (only for sorted data sets) */
    public Comparable bsearch(Comparable item) {
	a.sort();
	int l = 0;
	int h = a.size - 1;
	while (h > l) {
	    int half = (l+h)/2;
	    if (a[half].compareTo(item) == 0) {
		return half;
	    }
	    if (a[half].compareTo(item) < 0) {
		l = half + 1;
	    }
	    if (a[half].compareTo(item) > 0) {
		h = half - 1;
	    }
	}
	return null;
    }

    public Comparable rbsearch(Comparable[] b, Comparable val) {
	
    }

    public static void main(String[] args) {
	Searching z = new Searching();
	System.out.println(z.toString());
	z.addItem(5);
	System.out.println(z.toString());

    }

}
