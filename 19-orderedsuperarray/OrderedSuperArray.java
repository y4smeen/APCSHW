public class OrderedSuperArray extends SuperArray {
    String[] data;
    int last;

    public OrderedSuperArray() {
	data = new String[1];
	last = -1;
    }

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
	    String s1 = data[j];
	    int v = i.compareTo(s1);
	    if (v == 0) {
		this.moveup(j);
		data[j] = i;
	    }
	    if (v < 0) {
	    }
	    if (v > 0) {
	    }
	}
    }

    public void moveup(int index) {
	for (int j = last; j > index; j--) {
	    data[j + 1] = data[j];
	}
	last++;
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
	for (int i = index; i < last; i++) {
	    data[i] = data[i + 1];
	}
	data[last] = 0;
	last--;
	return old;
    }

    public String[] getData() {
	return data;
    }

}
