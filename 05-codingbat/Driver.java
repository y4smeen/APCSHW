public class Driver {
    public String nonStart(String a, String b) {
	String x = a.substring(1,a.length());
	String xx = b.substring(1,b.length());
	return x + xx;
    }
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    public int diff21(int n) {
	if ((n-21)<0) {
	    int x = 21-n;
	    return x;
	}
	else {
	    int x = 2*(n-21);
	    return x;
	}
    }
}

