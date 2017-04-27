package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
//	aki esta el truco la lista de customer es un arrayList
// y se añade un CUstomer a essa lista. 
// per primero hay que crear un Customer por lo get/sette	


	@Override
	public List<Customer> findAll(){
		List<Customer> personas = new ArrayList<>();
		Customer personita = new Customer();
		
		personita.setFirstname("Pepe");
		personita.setLastname("Perez");
		
		personas.add(personita);
		
		return personas;
	}
	

}
