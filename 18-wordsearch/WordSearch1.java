import java.util.Random;
import java.util.Scanner;
import java.io.File;
public class WordSearch1{

    private char[][] board, key;
    private ArrayList<String> words;
    private ArrayList<String> wordsInPuzzle;
    Random r = new Random();
    
    public WordSearch1(int r, int c){
	//rnd = new Random();
	//words = new ArrayList<String>();
	//Scanner sc = null;
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch1(){
	this(40,40);
    }

    public String toString(){
	String s = "";

	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    private void makeKey() {
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		key[i][j] = board[i][j];
	    }
	}
    }
		
    public boolean addWordHelper(String w,int row, int col,int dr, int dc){
	int r = row, c = col;
				
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + dr;
	    c = c + dc;
	}

	r = row;
	c = col;

	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + dr;
	    c = c + dc;
	}
	return true;
    }

    
    public boolean addWord(String w) {
	int row = r.nextInt(board.length);
	int col = r.nextInt(board[0].length);
	int dr = -1 + r.nextInt(3);
	int dc = -1 + r.nextInt(3);
	if (dr == dc && dc == 0)
	    return false;
	return addWordHelper(w,row,col,dr,dc);
    }

    public void buildPuzzle(int numwords) {
	words = new ArrayList<String>();
	int i = 0;
	while (i > 0) {
	    int wordIndex = rnd.nextInt(wordlist.size());
	    String word = wordlist.get(wordIndex);
	    if (addWord(word)) {
		words.add(word);
		wordlist.remove(wordIndex);
		i++;
	    }
	}
    }

    public void fillBoard() {
	String alph = "abcdefghijklmnopqrstuvwxyz";
	Random loc = new Random();
	for (int b = 0; b < board.length; b++) {
	    for (int d = 0; d < board[b].length; d++) {
		if (board[b][d] == '.') {
		    board[b][d] = alph.charAt(loc.nextInt(26));
		}
	    }
	}
	//w.makeKey();
    }

    public static void main(String[] args) {
	WordSearch1 w = new WordSearch1(20,40);

	/* ----- read file && fill board ----- */

	    Scanner sc = null;
	    try {
		sc = new Scanner(new File("words.txt"));
	    } catch (Exception e) {
		System.out.println("Can't open file");
		System.exit(0);
	    }
	    while (sc.hasNext()) {
		String s = sc.next();
		w.addWord(s);
	    }
	    w.fillBoard();
	    //w.makeKey();
	    
	System.out.println(w);
    }
}
