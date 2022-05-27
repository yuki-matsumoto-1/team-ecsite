package jp.co.internous.knights.model.domain;

import java.sql.Timestamp;

public class MstProduct {
	private int id;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int price;
	private String imageFullPath;
	private String releaseDate;
	private String releaseCompany;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	
	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getProductDescription() {
		return productDescription;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	
	public String getImageFullPath() {
		return imageFullPath;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	
	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

}
