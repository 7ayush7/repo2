package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DBFactory extends JpaRepository<Department, String>{

}
