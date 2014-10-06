public class Frame{
    public String frame(int r, int c){
	String x = "";
	for(int xx = 1; xx <= r; xx ++){
	    for (xxx = 1; xxx <= c; xxx ++)
		if (xx == 1||xx == r||xxx == 1||xxx == c){
		    x += "*";
		}
		else{
		    x += " ";
		}
	    x += "\n";
	}
	return x;
    }
	
    public String stringSplosion(String str) {
	String y = "";
	for (int x = 0; x <= str.length(); x ++){
	    y += str.substring(0,x);
	}
	    return y;
    }
    public String stringX(String str) {
	String x = "";
	for (int c = 0; c < str.length(); c ++){
	    if (!(str.substring(c, c+1).equals("x") && c < (str.length()-1) && c > 0)){
		x += str.substring(c,c+1);
	    }
	}
	return x;
    }

}