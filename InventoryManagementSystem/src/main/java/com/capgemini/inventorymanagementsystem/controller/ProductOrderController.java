package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.ProductOrder;
import com.capgemini.inventorymanagementsystem.service.ProductOrderService;

@CrossOrigin(origins = "http://localhost:4200")  //it enables cross-origin resource sharing only for this specific method
@RestController                                                //it is used to create restful web services using spring MVC
public class ProductOrderController
{
	@Autowired                                               //can be used to autowire bean on the setter and getter method
	ProductOrderService productOrderService;
	public void setProductOrderService(ProductOrderService productOrderService)
	{
		this.productOrderService=productOrderService;
	}


   @GetMapping("productorder/getOrder/{orderId}")           //this annotation is used to get the details
   public ProductOrder getOrder(@PathVariable int orderId) //it is used for data passed in the URI
   {
	   return productOrderService.getOrder(orderId);
   }
   
}
  




