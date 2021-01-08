package practice;

import java.util.ArrayList;

public class Student {

	private String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book(title);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getBookTitle() + " ");
		}
		System.out.println("입니다");
	}
}
