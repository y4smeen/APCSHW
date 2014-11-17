import java.util.*;

public class ArrayList1 {
    Random rnd = new Random();

    public ArrayList<Integer> rand(ArrayList<Integer> l){
	for (int len=l.size();len>0;len--){
	    //int x = rnd.nextInt(len);
	    //int y = l.remove(i);
	    //l.add(y);
	    int x = rnd.nextInt(len);
	    int y = l.get(x);
	    l.set(x , l.get(len-1));
	    l.set(len-1 , y);
	}
	return l;
    }


    public static void main(String[] args) {
			
	ArrayList1 r = new ArrayList1();
	ArrayList<Integer> l = new ArrayList<Integer>();

		System.out.println(l);
		    
    }
}
