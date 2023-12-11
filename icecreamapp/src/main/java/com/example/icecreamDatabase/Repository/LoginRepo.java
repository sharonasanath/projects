package com.example.icecreamDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.icecreamDatabase.Entity.Login;
@Repository
public interface LoginRepo extends JpaRepository<Login, String>{
	@Query(value = "select * from Login where email_id=?" , nativeQuery = true)
	Login findByEmail(String email_id);


}
