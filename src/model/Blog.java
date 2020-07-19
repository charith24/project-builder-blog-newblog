package model;

import java.time.LocalDate;

// Type your code
public class Blog{
	String title;
	int description;
	LocalDate postedOn;
	
	public Blog(String title, int description, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
}