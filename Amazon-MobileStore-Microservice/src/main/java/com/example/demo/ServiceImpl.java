package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	@Autowired
	Repository repo;
	
	@Override
	public List<Mobile> getMobiles() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Mobile getMobileDetails(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).isPresent()?repo.findById(id).get():new Mobile();
	}

	@Override
	public int mobileTotalCount() {
		// TODO Auto-generated method stub
		return repo.mobileTotalCount();
	}

	
}
