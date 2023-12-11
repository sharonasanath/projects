package com.example.icecreamDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.icecreamDatabase.Entity.IcecreamProduct;
@Repository
public interface IcecreamProductRepo extends JpaRepository<IcecreamProduct, String>{
	
	@Query(value = "select * from icecream_product where icecream_name=?" , nativeQuery = true)
	IcecreamProduct findByIcecreamName(String icecreamName);

}
