package com.example.icecreamDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class IcecreamProduct {
	
	@Id
	private String icecreamName;
	private String description;
	private String imageUrl;
	public String getIcecreamName() {
		return icecreamName;
	}
	public void setIcecreamName(String icecreamName) {
		this.icecreamName = icecreamName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	

}
