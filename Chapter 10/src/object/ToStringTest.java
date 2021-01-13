package object;

class Book implements Cloneable{
	String title;
	String author;

	public Book(String title, String author) {
		this.title  = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ToStringTest {
	// toString() : 어떤 객체의 정보를 string 형태로 표현해야할 때 호출되는 메서드
	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		
		System.out.println(str.toString());
		System.out.println(str);
		
		// clone() 예제
		Book book2 = (Book)book.clone();
		System.out.println(book2);
	}

}
