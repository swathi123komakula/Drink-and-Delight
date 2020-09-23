package com.capgemini.inventorymanagementsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialOrderDAO;
import com.capgemini.inventorymanagementsystem.dto.RawMaterialOrder;


@Service
public class RawMaterialOrderService<rmsdao> {
	@Autowired
	RawMaterialOrderDAO rmsdao;
	public void setpsdao(RawMaterialOrderDAO rmsdao) { this.rmsdao=rmsdao;}
	
	@Transactional(readOnly=true)
	public RawMaterialOrder getOrder(int orderId)
	{
		return rmsdao.getRawDetail(orderId);
	}


	}

