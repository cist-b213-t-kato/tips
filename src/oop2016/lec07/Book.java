package oop2016.lec07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Book {

	private String title;
	private int price;
	private List<Person> authors;
	
	public Book(){
		this.title = "";
		this.authors = new ArrayList<>();
	}
	
	public Book(String name, List<Person> authors){
		this.title = name;
		this.authors = authors;
	}
	
	public void addAuthor(Person author){
		authors.add(author);
	}
	
	public int getAuthorsSize(){
		return authors.size();
	}
	
	public void printState(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.title);
		
		sb.append("  著者:");
		sb.append(authors.get(0).getName());
		IntStream.range(1, authors.size())
			.forEach(i -> {
				Person author = authors.get(i);
				sb.append(",");
				sb.append(author.getName());
			});
		
		System.out.println(sb.toString());
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
