package com.capgemini.inventorymanagementsystem.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.ProductOrderDAO;
import com.capgemini.inventorymanagementsystem.dto.ProductOrder;
@Service
public class ProductOrderService {

	 
@Autowired
ProductOrderDAO psdao;
public void setpsdao(ProductOrderDAO psdao) { this.psdao=psdao;}

@Transactional(readOnly=true)
public ProductOrder getOrder(int distributerId)
{
	return psdao.getProductDetail(distributerId);
}


}

