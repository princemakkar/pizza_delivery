package com.onlinefood.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlinefood.dao.CustomerOrderDao;
import com.onlinefood.model.CustomerOrder;

@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao{

        @Autowired
        private SessionFactory sessionFactory;

        public void addCustomerOrder(CustomerOrder customerOrder) {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(customerOrder);
            session.flush();
        }
}
