import java.io.*;
import java.util.*;

public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch() {
	this(20,40);
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

    public void addWordH(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col < 0 || col + l > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c++;
	    }
	}
    }

    public void addWordB(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col - l < -1 || col > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c--;
	    }
	}
    }

    public void addWordV(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col < 0 || col + l > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		row++;
	    }
	}
    }

    public void addWordVB(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col < 0 || col + l > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		row--;
	    }
	}
    }
    public void addWordDUR(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col < 0 || col + l > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c++;
		row--;
	    }
	}
    }
    
    public void addWordDUL(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col - l< 0 || col > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c--;
		row--;
	    }
	}
    }

    public void addWordDDR(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col < 0 || col + l > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c++;
		row++;
	    }
	}
    }
    
    public void addWordDDL(String w, int row, int col){
	int c = col;
	int l = w.length();
	if (row < 0 || row > board.length){
	    throw new IndexOutOfBoundsException();
	}
	if (col - l < 0 || col > board[0].length){
	    throw new IndexOutOfBoundsException();
	}
	
	for (int i = 0; i < w.length(); i++){
	    if (board[row][c] != w.charAt(i) && board[row][c] != '.'){
		throw new ArithmeticException();
	    }
	    else {
		board[row][c] = w.charAt(i);
		c--;
		row++;
	    }
	}
    }
    
    public boolean addWord(String w){
    	Random r = new Random();
    	boolean y = false;
    	//for (int i = 0; i <)
    	return y;
    }
    
    public void ReadFile(){
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

    public static void main(String[] args){
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,15); //should work
	//w.addWordH("look",3,18); //test illegal overlap
	//w.addWordH("look",3,18); //test illegal overlap
        //w.addWordH("look",-3,20); //test illegal row
	//w.addWordH("look",3,55); //test illegal col
	w.addWordB("troll",3,21);
	w.addWordV("omg",5,8);
	w.addWordVB("nope",10,10);
	//etc
	System.out.println(w);
        
    }
}
