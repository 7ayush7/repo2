package com.example.demo;

import java.util.List;

public interface Service {

	public List<Mobile> getMobiles();
	public Mobile getMobileDetails(int id);
	public int mobileTotalCount();
}
