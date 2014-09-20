public class Driver {
    public static void main(String[] args){
	String full = "yasmeen roumie";
	int space = full.indexOf(" ");
	String first = full.substring(0,space);
	String last = full.substring(space+1,full.length());
    }
}
