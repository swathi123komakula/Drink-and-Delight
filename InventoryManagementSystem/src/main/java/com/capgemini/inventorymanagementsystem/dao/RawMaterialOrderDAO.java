package com.capgemini.inventorymanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.RawMaterialOrder;


@Repository
public interface RawMaterialOrderDAO extends JpaRepository<RawMaterialOrder,Integer>
{
	@Query("select raw from RawMaterialOrder raw where orderid=?1")
	public RawMaterialOrder getRawDetail(int orderid);
}