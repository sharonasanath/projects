package com.example.icecreamDatabase.Service;

import com.example.icecreamDatabase.Entity.IcecreamProduct;

public interface IcecreamProductService {

    IcecreamProduct addProduct(IcecreamProduct product);
	
	IcecreamProduct updateProduct(String icecreamName,IcecreamProduct product);
	
	void deleteProduct(String icecreamName);
}
