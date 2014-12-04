import java.util.*;

public class SuperArray {
    String[] data;
    int last;

    public SuperArray() {
	this(1);
	//data = new String[1];
	last = -1;
    }
    public SuperArray(int a) {
	data = new String[a];
    }
    
    public String toString() {
	String x = ""; //x = "["
	for (int i = 0; i < data.length-1; i++) {
	    x += data[i] + ", "; 
		//Integer.toString(data[i]) + ", ";
	    //x += Integer.toString(data.get(i)) + (i == data.length - 1) ? "" : ", ";
	}
	//x += "]";
	return "["+x+data[data.length-1]+"]";
    }

    public boolean add(String j) {
	int len = data.length;
	if (size() == len) len++;
	String[] newData = new String[len];
	for (int ind = 0; ind < len; ind++) {
	    newData[ind] = data[ind];
	}
	newData[size()] = j;
	data = newData;
	return true;
    }

    public int size() {
	int result = 0;
	boolean nc = false;
	for (int i = data.length - 1; i >= 0; i--) {
	    if (data[ind] != null) nc = true;
	    if (nc) result++;
	}
	return result;
    }

    /*
    public boolean add(String i) {
	if (last >= data.length-1) {
	    String[] newdata = new String[data.length*2];
	    for (int j = 0; j < data.length; j++) {
		newdata[j] = data[j];
	    }
	    data = newdata;
	    }*/
	/*
	  if i is larger than current
	        move on
	  if i is smaller than current
	        add before
	  if i is equal to current
	        add after/before
	*/
    /*
	for (int k = 0; k < last; k++) {
	    if (i.compareTo(data[k]) >= 0) {
		for (int m = last; m > k - 1; m--) {
		    data[m + 1] = data[m];
		}
		data[k] = i;
	    }
	}
	last++;
	return true;
    }
*/
    /*
    public void add(int index, String i) {
	if (last >= data.length-1) {
	    String[] newdata = new String[data.length*2];
	    for (int j = 0; j < data.length; j++) {
		newdata[j] = data[j];
	    }
	    data = newdata;
	}
	for (int j = last; j >= index; j--) {
	    data[j+1] = data[j];
	}
	data[index] = i;
	last++;
    }
    */
    public int size() {
	return last + 1;
    }

    public String get(int index) {
	return data[index];
    }

    public String set(int index, String i) {
	String old = data[index];
	data[index] = i;
	return old;
    }

    public String remove(int index) {
	String old = data[index];
	//move stuff back
	for (int i = index; i < last; i++) {
	    data[i] = data[i + 1];
	}
	data[last] = "";
	last--;
	return old;
    }

    public String[] getData() {
	return data;
    }
    
    //insertion sort
    public void isort() {
	//last = data.length-1;
	String s;
	for (int i = 0; i <= last; i++) {
	    int j;
	    s = data[i];
	    for (j = i; j > 0 && s.compareTo(data[j-1]) < 0; j--) {
		data[j] = data[j-1];
	    }
	    data[j] = s;
	}
    }

    //selection sort
    public void ssort() {
	String current;
	for (int i = 0; i <= last; i++) {
	    int j;
	    current = data[i];
	    for (j = i; j > 0 && 
	

    public static void main(String[] args) {
	SuperArray s = new SuperArray();
        /*
	s.add(2);
	s.add(7);
	s.add(26);
	s.add(2,15);
	System.out.println("my toString: " + s.toString());
	System.out.println(s.size());
	System.out.println(s.get(2));
	s.set(0,3);
	System.out.println(Arrays.toString(s.data));
	s.remove(2);
	System.out.println(Arrays.toString(s.data));
	*/
	s.add("A");
	s.add("B");
	s.add("D");
	s.add("E");
    }
}
