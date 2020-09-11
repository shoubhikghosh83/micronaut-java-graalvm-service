package com.tech.service.controller;

import com.tech.service.model.Customer;
import com.tech.service.service.BaseService;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/v1")
public class BaseController {

	private final BaseService service;
	
	public BaseController(final BaseService service)
	{
		this.service = service;
	}
	
	@Get("/getCustomer")
	public Customer getCustomer()
	{
		return service.getCustomer();
	}
}
