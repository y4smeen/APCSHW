public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    public String tri1(int h){
	String x = "";
	int c = 0;
	while (c <= h) {
	    int cc = 0;
	    while (cc < c) {
		x += "*";
		cc += 1;
	    }
	    x += "\n";
	    c += 1;
	}
	return x;
    }

    public String tri2(int h){
	String x = "";
	int c = 1;
	while (c <= h) {
	    int cc = 0;
	    int d = h - c;
	    while (cc < d) {
		x += " ";
		cc += 1;
	    }
	    int e = 1;
	    while (e <= c) {
		x += "*";
		e += 1;
	    }
	    x += "\n";
	    c += 1;
	}
	return x;
    }
	
    public String tri3(int h){
	String x = "";
	for (int d = 1; d <= h; d ++){
	    int s = 0;
	    String a = "";
	    while (s < h - d){
		x += " ";
		s += 1;
	    }
	    while (s < h - 1){
		a += "*";
		s += 1;
	    }
	    x += a + "*" + a + "\n";
	}
	return x;
    }
    public String diamond(int h){
	int a = h-h/2;
	int z = h/2;
	String x = tri3(a);
	for (int c = z; c > 0; c --){
	    int r = 0;
	    String p = "";
	    while (r < z - c){
		x += " ";
		r += 1;
	    }
	    while (r < z - 1){ 
		p += "*";
		r += 1;
	    }
	    if (!(a == z)){
		x += " ";
	    }
	    x += p + "*" + p + "\n"
	}
	return x;
    }
    public String tri4(int h){
	String x = "";
	for (int d = h; d > 0; d --){
	    int c = 0;
	    while (c < h-c){
		x += " ";
		rc ++;
	    }
	    while (c < h){
		x += "*";
		c ++;
	    }
	    x += "\n";
	}
	return x;
    }
}
