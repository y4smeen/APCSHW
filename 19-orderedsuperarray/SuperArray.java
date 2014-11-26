import java.util.*;

public class SuperArray {
    int[] data;
    int last;

    public SuperArray() {
	data = new int[1];
	last = -1;
    }

    public String toString() {
	return " ";
    }

    public boolean add(int i) {
	if (last >= data.length-1) {
	    int[] newdata = new int[data.length*2];
	    for (int j = 0; j < data.length; j++) {
		newdata[j] = data[j];
	    }
	    data = newdata;
	}
	data[last + 1] = i;
	last++;
	return true;
    }

    public void add(int index, int i) {
	if (last >= data.length-1) {
	    int[] newdata = new int[data.length*2];
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

    public int size() {
	return last + 1;
    }

    public int get(int index) {
	return data[index];
    }

    public int set(int index, int i) {
	int old = data[index];
	data[index] = i;
	return old;
    }

    public int remove(int index) {
	int old = data[index];
	for (int i = index; i < last; i++) {
	    data[i] = data[i + 1];
	}
	data[last] = 0;
	last--;
	return old;
    }

    public int[] getData() {
	return data;
    }

    public static void main(String[] args) {
	SuperArray s = new SuperArray();
	/*
	s.add(2);
	s.add(7);
	s.add(26);
	s.add(2,15);
	System.out.println(Arrays.toString(s.data));
	System.out.println(s.size());
	System.out.println(s.get(2));
	s.set(0,3);
	System.out.println(Arrays.toString(s.data));
	s.remove(2);
	System.out.println(Arrays.toString(s.data));
	*/
    }
}
