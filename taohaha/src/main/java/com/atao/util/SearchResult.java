package com.atao.util;

import java.math.BigDecimal;

public class SearchResult {
	 private String productId;
	 private String productName;
	 @Override
	public String toString() {
		return "SearchResult [productId=" + productId + ", productName=" + productName + ", productPic=" + productPic
				+ ", productPrice=" + productPrice + ", productTypeName=" + productTypeName + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPic() {
		return productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	private String productPic;
	 private long productPrice;
	 private String productTypeName;
	 
	
}
