package com.capgemini.inventorymanagementsystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.ProductOrderDAO;
import com.capgemini.inventorymanagementsystem.dto.ProductOrder;
@Service                             //indicates that an annotated class is a service class
public class ProductOrderService {

	 
@Autowired
ProductOrderDAO psdao;
public void setpsdao(ProductOrderDAO psdao) { this.psdao=psdao;}

@Transactional(readOnly=true)
public ProductOrder getOrder(int orderId)
{
	return psdao.getProductDetail(orderId);
}


}

