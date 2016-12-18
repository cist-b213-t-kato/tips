package oop2016.lec07;

import java.util.ArrayList;
import java.util.List;

public class BookApp {
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		Book book1 = new Book();
		book1.setTitle("すぐわかる化学");
		book1.setPrice(900);
		book1.addAuthor(new Person("千歳 光"));
		book1.addAuthor(new Person("長沼 次郎"));
		books.add(book1);
		
		Book book2 = new Book();
		book2.setTitle("すぐわかる電磁気学");
		book2.setPrice(1000);
		book2.addAuthor(new Person("長都 花子"));
		book2.addAuthor(new Person("白老 渚"));
		books.add(book2);
		
		Book book3 = new Book();
		book3.setTitle("Javaプログラミング");
		book3.setPrice(1211);
		book3.addAuthor(new Person("神田 社"));
		book3.addAuthor(new Person("秋原 バラ"));
		book3.addAuthor(new Person("ジョン ドゥ"));
		books.add(book3);
		
		System.out.println("1000円未満の本");
		books.stream().filter(book->book.getPrice()<1000)
			.forEach(book->book.printState());
		System.out.println();
		
		System.out.println("8文字以下のタイトルの本");
		books.stream().filter(book->book.getTitle().length()<=8)
			.forEach(book->book.printState());
		System.out.println();

		System.out.println("著者が2人以下の本");
		books.stream().filter(book->book.getAuthorsSize()<=2)
			.forEach(book->book.printState());
		System.out.println();
		
	}
}
