package com.capgemini.inventorymanagementsystem.dto;




import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity                             //it specifies that the class is entity and is mapped to a database table
@Table(name = "productorder") //it specifies the name of the database table to be used for mapping
public class ProductOrder {
	
	@Id                          //it specifies the primary key of an entity
@Column(name="orderid")
	int orderId;        //it is the member is only visible within the class,not from another class
	@Column(name="itemname") //to declare a column in table
	String itemName;
	@Column(name="quantityunit")//to declare a column in table
	int quantityUnit;
	@Column(name="price_per_unit")
	 double pricePerUnit;
	@Column(name="totalprice")
	double totalPrice;
	@Column(name="orderdate")
    Date orderDate;
	@Column(name="deliverydate")
	 Date deliveryDate;
	@Column(name="deliverystatus")
  String deliveryStatus;
	@Column(name="distributerid")
	int distributorId;
	@Column(name="manufacturingdate")
	 Date manufacturingdate;
	@Column(name="expirydate")
Date expirydate;
	//getter and setter methods
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	public Date getManufacturingdate() {
		return manufacturingdate;
	}
	public void setManufacturingdate(Date manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public ProductOrder(int orderId, String itemName, int quantityUnit, double pricePerUnit, double totalPrice, Date orderDate, Date deliveryDate, String deliveryStatus, int distributorId,
			Date manufacturingdate, Date expirydate) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.distributorId = distributorId;
		this.manufacturingdate = manufacturingdate;
		this.expirydate = expirydate;
	}
	public ProductOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}