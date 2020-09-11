package com.tech.service.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Introspected
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	
	private String custId;
	private String custName;
}
