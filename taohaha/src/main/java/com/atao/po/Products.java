package com.atao.po;

import java.math.BigDecimal;
import java.util.Date;

public class Products {
    private Long productId;

    private String productName;

    private String productPic;

    private BigDecimal productPrice;

    private Integer productKc;

    private Byte productState;

    private String productTypeName;

    private Date created;

    private Date updated;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductKc() {
        return productKc;
    }

    public void setProductKc(Integer productKc) {
        this.productKc = productKc;
    }

    public Byte getProductState() {
        return productState;
    }

    public void setProductState(Byte productState) {
        this.productState = productState;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    @Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPic=" + productPic
				+ ", productPrice=" + productPrice + ", productKc=" + productKc + ", productState=" + productState
				+ ", productTypeName=" + productTypeName + ", created=" + created + ", updated=" + updated + "]";
	}

	public void setUpdated(Date updated) {
        this.updated = updated;
    }
}