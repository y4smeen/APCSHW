import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(Strint[] args) {
	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    System.out.println("Next Line: " + s);
	}
    }
}
