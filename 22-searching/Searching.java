import java.util.*;
import java.io.*;

public class Searching implements Comparable{
    private Comparable[] a;

    public void additem() {
	Comparable[] b = new ;
    }

    public void Sort() {
    }

    public static Object lsearch(Comparable[] a, Comparable val) {
	Arrays.sort(a);
	for (int i = 0; i < a.length; i++) {
	    if (a[i].compareTo(val) == 0) return a[i];
	}
	return null;
    }


    /* binary search (only for sorted data sets)
       search for s
       if s = a[mid] we're done
       if s < a[mid]
          h = mid - 1
	  use l = mid - 1
    */
    public static Object bsearch(Comparable[] b, Comparable val) {

	

    }

    public static Object rbsearch(Comparable[] b, Comparable val) {
    }

    public static void main(String[] args) {
    }

}
