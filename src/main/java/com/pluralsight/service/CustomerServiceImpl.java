package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	//aki va la logica del programa y se instancia la interface a travez 
	//la clase repositorio
	
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	//aki se crea los web services
	
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}
	
	
	
}
