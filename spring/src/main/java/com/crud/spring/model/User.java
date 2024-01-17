package com.crud.spring.model;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String first_name;
	 private String last_name;
	 private String email;
	 
	 public String getFirst_name() {
	        return first_name;
	    }

	    public String getLast_name() {
	        return last_name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }

	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public Long getId() {
	        return id;
	    }
	    



}
