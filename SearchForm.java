package jp.co.internous.knights.model.form;

import java.io.Serializable;


public class SearchForm implements Serializable{

	private static final long serialVersionUID = 1640663696787324779L;

	private int category;
	private String productName;

	public void setCategory(int category) {
		this.category = category;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
}
