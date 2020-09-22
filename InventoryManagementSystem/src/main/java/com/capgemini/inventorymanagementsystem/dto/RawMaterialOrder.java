package com.capgemini.inventorymanagementsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rawmaterialorder")

public class RawMaterialOrder {

	@Id
	@Column(name="orderid")
	int orderId;
	@Column(name="itemname")
    String itemName;
	@Column(name="quantityunit")
	 int quantityUnit;
	@Column(name="price_per_unit")
 double price_per_unit;
	@Column(name="totalprice")
    double totalPrice;
	@Column(name="orderdate")
Date orderDate;
	@Column(name="deliverydate")
	 Date deliveryDate;
	@Column(name="deliverystatus")
 String deliveryStatus;
	@Column(name="supplierid")
 int supplierId;
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
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
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
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public RawMaterialOrder(int orderId, String itemName, int quantityUnit, double price_per_unit, double totalPrice,
			Date orderDate, Date deliveryDate, String deliveryStatus, int supplierId) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantityUnit = quantityUnit;
		this.price_per_unit = price_per_unit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.supplierId = supplierId;
	}


	
	

	

	



}