package com.tech.service.service;

import javax.inject.Singleton;

import com.tech.service.model.Customer;

@Singleton
public class BaseService {

	
	public Customer getCustomer()
	{
		return Customer.builder().custId("100").custName("Shoubhik").build();
	}
}
