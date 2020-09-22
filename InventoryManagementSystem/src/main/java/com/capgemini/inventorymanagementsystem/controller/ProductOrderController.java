package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.ProductOrder;
import com.capgemini.inventorymanagementsystem.service.ProductOrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductOrderController
{
	@Autowired
	ProductOrderService productOrderService;
	public void setProductStockService(ProductOrderService productOrderService)
	{
		this.productOrderService=productOrderService;
	}


   @GetMapping("productorder/getOrder/{distributerId}")
   public ProductOrder getOrder(@PathVariable int distributerId)
   {
	   return productOrderService.getOrder(distributerId);
   }
   
}
  




