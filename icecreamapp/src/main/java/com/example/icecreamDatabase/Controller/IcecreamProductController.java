package com.example.icecreamDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.icecreamDatabase.Entity.IcecreamProduct;
import com.example.icecreamDatabase.Service.IcecreamProductService;

@RestController
public class IcecreamProductController {
	
	@Autowired
	IcecreamProductService icecreamproductService;
	
	@PostMapping("/post")
	public IcecreamProduct addProduct(@RequestBody IcecreamProduct product) {
		
		return icecreamproductService.addProduct(product);
	}
	
	@PutMapping("/update")
	public IcecreamProduct updateProduct(@RequestHeader String icecreamName,@RequestBody IcecreamProduct product) {
		
		return icecreamproductService.updateProduct(icecreamName,product);
	}
	
	@DeleteMapping("/delete")
	public void deleteProduct(@RequestHeader String icecreamName) {
		
		icecreamproductService.deleteProduct(icecreamName);
		
	}

}
