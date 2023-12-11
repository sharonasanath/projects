package com.example.icecreamDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.icecreamDatabase.Entity.Login;
import com.example.icecreamDatabase.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public Login login(@RequestHeader String email_id ,
			@RequestHeader String password) {
		
		return loginService.login(email_id, password); 
	}
	
//	@PostMapping("/post")
//	public Login addLogin(@RequestBody Login login) {
//		
//		return loginService.addLogin(login);
//	}
//	
//	@PutMapping("/update")
//	public Login updateLogin(@RequestHeader String email_id , @RequestBody Login login ) {
//		
//		return loginService.updateLogin(email_id,login);
//	}
//	
//	@DeleteMapping("/delete")
//	public void deleteLogin(@RequestHeader String email_id) {
//		loginService.deleteLogin(email_id);
//		
//		
//	}
	

}
