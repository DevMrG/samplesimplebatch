package com.mkyong.Processor;



import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Employee;

public class CustomProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
