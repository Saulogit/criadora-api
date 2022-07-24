package br.com.alura.alura.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {

	@Id
	private String id;
	private String title;
	private String image;
	private double ranking;
	
	
	public Linguagem(String title, String image, double ranking) {
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public double getRanking() {
		return ranking;
	}
	
	public String getId() {
		return id;
	}
	
}
