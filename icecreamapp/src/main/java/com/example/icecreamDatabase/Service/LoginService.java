package com.example.icecreamDatabase.Service;

import com.example.icecreamDatabase.Entity.Login;

public interface LoginService {
	
    Login login(String email_id,String password);
	
    Login addLogin(Login login);
	
	Login updateLogin(String email_id, Login login);
	
	void deleteLogin(String email_id);

}
