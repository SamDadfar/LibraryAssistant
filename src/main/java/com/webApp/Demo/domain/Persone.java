package com.webApp.Demo.domain;

import javax.persistence.*;

@Entity
public class Persone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="persone_id")
	private long personeId;
	@Column(name="persone_name")
	private String personeName;
	@Column(name="persone_description")
	private String personeDescription;
	/*@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="persone",optional=true)
	private Author author=null;
	
	public Author getAuthor() {
		return author;
	}*/
	/*public void setAuthor(Author author) {
		if(author!=null)
			author.setPersone(this);
		this.author=author;
	}*/
	public long getPersoneId() {
		return personeId;
	}
	public void setPersoneId(long personeId) {
		this.personeId = personeId;
	}
	public String getPersoneName() {
		return personeName;
	}
	public void setPersoneName(String personeName) {
		this.personeName = personeName;
	}
	public String getPersoneDescription() {
		return personeDescription;
	}
	public void setPersoneDescription(String personeDescription) {
		this.personeDescription = personeDescription;
	}
	
	
}
