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

public boolean nearHundred(int n) {
	if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
		return true;
	}
	else {
		return false;
	}
}

public boolean mixStart(String str) {
	if (str.length() >= 3) {
		String x = str.substring(1,3);
		if (x.equals("ix")) {
		return true;
		}
		else{
		return false;
		}
	}
	else {
		return false;
	}
}

public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5) {
		return 0;
	}
	else if ((tea/candy) >= 2 || (candy/tea) >= 2) {
		return 2;
	}
	else {
		return 1;
	}
}

public boolean lastDigit(int a, int b, int c) {
	int x = a%10;
	int xx = b%10;
	int xxx = c%10;
	return (x==xx||x==xxx||xx==xxx);
}
