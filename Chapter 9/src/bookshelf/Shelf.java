package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() { // ArrayList의 new는 주로 생성자에서 해준다.
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
