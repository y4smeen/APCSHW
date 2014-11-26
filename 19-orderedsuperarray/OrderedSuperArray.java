public class OrderedSuperArray extends SuperArray {
    String[] data;
    int last;

    public OrderedSuperArray() {
	data = new String[1];
	last = -1;
    }
	/*
    public String toString(int x) {
	return Integer.toString(x);
    }
	*/

    public boolean add(String i) {
	if (last >= data.length - 1) {
	    String[] newdata = new String[data.length*2];
	    for (int j = 0; j < data.length; j++) {
		newdata[j] = data[j].toString;
	    }
	    data = newdata;
	}
	data[last+1] = i;
	last++;
	return true;
    }

    public void add(String i) {
	if (last >= data.length - 1) {
	    String[] newdata = new int[data.length*2];
	    for (int j = 0; j < data.length; j++) {
		newdata[j] = data[j];
	    }
	    data = newdata;
	}
	for (int j = 0; j < data.length; j++) {
	    if (data[j].compareTo(i)) 


}
