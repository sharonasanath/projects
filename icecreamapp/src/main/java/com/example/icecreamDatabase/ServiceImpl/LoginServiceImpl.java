package com.example.icecreamDatabase.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icecreamDatabase.Entity.Login;
import com.example.icecreamDatabase.Exception.ResourceNotFoundException;
import com.example.icecreamDatabase.Repository.LoginRepo;
import com.example.icecreamDatabase.Service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepo loginrepo;

	@Override
	public Login login(String email_id, String password) {
		Login login = loginrepo.findByEmail(email_id);
		if(login!=null) {
			if(login.getPassword().equals(password)) {
				return login;
			}else {
				throw new ResourceNotFoundException();
			}
		}
		return login;
	}

	@Override
	public Login addLogin(Login login) {
		return loginrepo.save(login);
	}

	@Override
	public Login updateLogin(String email_id, Login login) {
		Login login1 = loginrepo.findByEmail(email_id);
		if(login1!=null) {
			login1.setEmail_id(login.getEmail_id());
			login1.setPassword(login.getPassword());
			return loginrepo.save(login);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void deleteLogin(String email_id) {
		Login login =loginrepo.findByEmail(email_id);
		if(login!=null) {
			loginrepo.delete(login);
		}else {
			throw new ResourceNotFoundException();
		}
		
	}

}
