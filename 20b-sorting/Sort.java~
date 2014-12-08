import java.util.*;
import java.io.*;

public class Sort {

    int[] data;
    int[] copy;
    Random r;
    
    public Sort(int n) {
	r = new Random();
	data = new int[n];
	copy = new int[n];
	fill();
    }

    public Sort() {
	this(20);
    }

    public void fill() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = r.nextInt(100);
	}
    }

    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }

    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }

    public void isort() {
	//moves current element into the right place
	int i,j;
	for (i = 1; i < data.length; i++) {
	    int tmp = data[i];
	    for (j = i - 1; j >= 0 && tmp < data[j]; j--) {
		data[j + 1] = data[j];
	    }
	    data[j + 1] = tmp;
	}
    }

    public void ssort() {
	//finds min value and puts it in the right place
	int i,j,min;
	for (i = 0; i < data.length-1; i++) {
	    min = i;
	    for (j = i + 1; j < data.length; j++){
		if (data[j] < data[min]) {
		    min = j;
		}
	    }
	    int tmp = data[min];
	    data[min] = data[i];
	    data[i] = tmp;
	}
    }

    public void builtin() {
	Arrays.sort(data);
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s += data[i] + " ";
	}
	return s;
    }

    public static void main(String[] args) {
	Sort s = new Sort();
	System.out.println(s);
	s.builtin();
	System.out.println(s);
    }

}
