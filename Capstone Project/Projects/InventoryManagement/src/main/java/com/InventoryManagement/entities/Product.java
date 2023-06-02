package com.InventoryManagement.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

	
	@Entity
	@Table(name = "Product")
	public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String productName;
		private String warranty;
		private Integer billNumber;
		private Integer Quantity; 
       //private String status;
		
     	//@DateTimeFormat(pattern="dd-MM-yyyy")
		@Temporal(TemporalType.DATE)
		private Date date;
		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getWarranty() {
			return warranty;
		}
		public void setWarranty(String warranty) {
			this.warranty = warranty;
		}
		public Integer getBillNumber() {
			return billNumber;
		}
		public void setBillNumber(Integer billNumber) {
			this.billNumber = billNumber;
		}
		public Integer getQuantity() {
			return Quantity;
		}
		public void setQuantity(Integer quantity) {
			Quantity = quantity;
		}
		
		


}
