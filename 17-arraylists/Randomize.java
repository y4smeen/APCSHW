import java.io.*;
import java.util.*;
public class Randomize {
    Random rnd = new Random();
    public ArrayList<Integer> shuffle1(ArrayList<Integer> l) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	while (l.size()>0) {
	    int i = rnd.nextInt(l.size());
	    int v = l.remove(i)l
		result.add(v);
	}
	return result;
    }

    public ArrayList<Integer> shuffle2(ArrayList<Integer> l) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	for (int s = l.size(); s > 0; s--) {
	    int i = rnd.nextInt(s);
	    int v = l.remove(i);
