package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescripton() {
		return productDescripton;
	}

	public void setProductDescripton(String productDescripton) {
		this.productDescripton = productDescripton;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Product(String productId, String productName, String productDescripton, String productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescripton = productDescripton;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Id
	@Column(name = "productId")
	private String productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productDescription")
	private String productDescripton;
	@Column(name = "productPrice")
	private String productPrice;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescripton="
				+ productDescripton + ", productPrice=" + productPrice + "]";
	}

}
