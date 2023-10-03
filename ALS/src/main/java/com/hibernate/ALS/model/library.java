package com.hibernate.ALS.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Anime_library")
public class library
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="Anime_Title")
	private String title;
	@Column(name="Anime_Genre")
	private String genre;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "library [id=" + id + ", title=" + title + ", genre=" + genre + "]";
	}

	public library(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}

	public library() {
		super();
	}
	
	
}