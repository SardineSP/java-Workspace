package com.kh.test.movie.model.vo;

public class Movie {
	private String title;
	private String director;
	private String mainActor;
	private String genre;
	private int runningTime;
	private boolean screening;
	
	public Movie() {
	}
	
	public Movie(String title, String director, String mainActor, String genre, int runningTime, boolean screening) {
		super();
		this.title = title;
		this.director = director;
		this.mainActor = mainActor;
		this.genre = genre;
		this.runningTime = runningTime;
		this.screening = screening;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMainActor() {
		return mainActor;
	}
	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public boolean isScreening() {
		return screening;
	}
	public void setScreening(boolean screening) {
		this.screening = screening;
	}
	
	public void print() {
		System.out.println("title : " + title + ", director : " + director + ", mainActor : " + mainActor + ", genre : " + genre + ", runningTime : " + runningTime + ", screening : " + screening);
	}
	
	
}
