package Harshat;

import java.io.Serializable;

public class Product implements Serializable {

	     int productId;
	     String productName;
	     double price;
		public Product(int productId, String productName, double price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName="
					+ productName + ", price=" + price + "]";
		}
	     
		

}
