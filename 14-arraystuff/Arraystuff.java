import java.util.*;

public class  Arraystuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;
    // By making x final, we can set it once but then never change it
    // private final int x = 123;

    /*--------------------- Constructors --------------------*/ 

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}
    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	
    }
    
    public int find(int n){
    	int x;
    	for (x = 0; x < a.length; x++){
    		if (a[x] == n){
    			return x;
    		}
    		else {
    			return -1;
    		}
    	}
    }
    
    public int maxVal(){
    	int x = a[0];
    	int i;
    	for (i = 0; i < a.length; i++){
    		if (a[i] > x){
    			x = a[i];
    		}
    	}
    	return x;
    }
    
    public int freq(int i){
    	int y = 0;
    	for (int x = 0; i < a.length; x++){
    		if (a[x]==i){
    			y++;
    		}
    	}
    	return y;
    }
    
}
