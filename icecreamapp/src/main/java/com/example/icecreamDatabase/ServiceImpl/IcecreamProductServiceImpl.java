package com.example.icecreamDatabase.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icecreamDatabase.Entity.IcecreamProduct;
import com.example.icecreamDatabase.Exception.ResourceNotFoundException;
import com.example.icecreamDatabase.Repository.IcecreamProductRepo;
import com.example.icecreamDatabase.Service.IcecreamProductService;

@Service
public class IcecreamProductServiceImpl implements IcecreamProductService{
	
	@Autowired
	IcecreamProductRepo icecreamproductrepo;

	@Override
	public IcecreamProduct addProduct(IcecreamProduct product) {
		return icecreamproductrepo.save(product);
	}

	@Override
	public IcecreamProduct updateProduct(String icecreamName,IcecreamProduct product) {
		IcecreamProduct product1 = icecreamproductrepo.findByIcecreamName(icecreamName);
		if(product1!=null) {
			
			product1.setDescription(product.getDescription());
			product1.setImageUrl(product.getImageUrl());
			return icecreamproductrepo.save(product);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void deleteProduct(String icecreamName) {
		IcecreamProduct product2 =icecreamproductrepo.findByIcecreamName(icecreamName);
		if(product2!=null) {
			icecreamproductrepo.delete(product2);
		}else {
			throw new ResourceNotFoundException();
		}
		
	}
	
	

}
