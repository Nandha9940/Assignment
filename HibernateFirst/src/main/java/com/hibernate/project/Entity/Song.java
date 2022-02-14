package com.hibernate.project.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity

public class Song {
@Id	
	private int id;
	private String Name;
	private String artist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", Name=" + Name + ", artist=" + artist + "]";
	}

	

}
