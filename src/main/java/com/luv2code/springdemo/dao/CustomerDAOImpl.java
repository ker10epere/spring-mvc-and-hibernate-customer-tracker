package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);

		return query.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(new Customer(id));
	}
	
	@Override
	public void deleteCustomerHQL(Integer id) {
		Session session = sessionFactory.getCurrentSession();

		Query<?> query = session.createQuery("delete from Customer where id=:id");
		query.setParameter("id", id);

		query.executeUpdate();
	}
}
