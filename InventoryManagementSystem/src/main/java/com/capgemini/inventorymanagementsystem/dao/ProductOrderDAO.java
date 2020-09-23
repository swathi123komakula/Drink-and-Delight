package com.capgemini.inventorymanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.ProductOrder;

@Repository                                    //it indicates that the class is a repository
public interface ProductOrderDAO extends JpaRepository<ProductOrder,Integer>
{
	@Query("select p from ProductOrder p where orderid=?1") //its value attribute contains the JPQL or SQL to execute
	public ProductOrder getProductDetail(int orderid);
}
