import java.io.*;
import java.util.Vector;

class Book implements Serializable {
	private static final long serialversionUID = 123456789L;
	String bookID, title;
	int price;
	Vector authors;
	Book(String t, Vector a, int p){
		String filename = "BID.txt"
    	FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
		
		
	}
	
}
