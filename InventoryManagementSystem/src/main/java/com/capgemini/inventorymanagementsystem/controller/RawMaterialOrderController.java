package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.RawMaterialOrder;
import com.capgemini.inventorymanagementsystem.service.RawMaterialOrderService;


@CrossOrigin(origins = "http://localhost:4200") //it enables cross-origin resource sharing only for the specific method
@RestController                                 //it is used to create restful webservices
public class RawMaterialOrderController
{
	@Autowired                                 //can be used to autowire bean on the setter and getter method
	RawMaterialOrderService rawMaterialOrderService;
	public void setRawMaterialOrderService(RawMaterialOrderService rawMaterialOrderService)
	{
		this.rawMaterialOrderService=rawMaterialOrderService;
	}


   @GetMapping("rawmaterialorder/getOrder/{orderId}") //this annotation is used to get the detail
   public RawMaterialOrder getOrder(@PathVariable int orderId) //it is used for data passed in the URI 
   {
	   return rawMaterialOrderService.getOrder(orderId);
   }
   
}
  


