import java.util.*;

public class ArrayLists{
    public static void main(String[] args) {
			
		ArrayList<Integer> ai = new ArrayList<Integer>();

		Random r = new Random();
		for (int i = 0; i < 20; i++) {
				ai.add(r.nextInt(5));
		}
		System.out.println(ai);
		for (int i = 0; i < ai.size()-1; i++) {
		    int current = ai.get(i);
		    int next = ai.get(i + 1);
		    if (current == next) {
			ai.remove(i);
			i--;
		    }
		}
		System.out.println(ai);
		

    }
		
}
