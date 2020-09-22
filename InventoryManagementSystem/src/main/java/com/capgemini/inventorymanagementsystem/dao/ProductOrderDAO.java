package com.capgemini.inventorymanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.ProductOrder;

@Repository
public interface ProductOrderDAO extends JpaRepository<ProductOrder,Integer>
{
	@Query("select product from ProductOrder product where distributerid=?1")
	public ProductOrder getProductDetail(int distributerid);
}
