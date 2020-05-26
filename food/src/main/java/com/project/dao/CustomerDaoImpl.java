package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int create(Customer cs) {
		String sql="insert into customer values(?,?,?,?,?)";
		int res=jt.update(sql,cs.getUserName(),cs.getAddress(),cs.getPhoneNumber(),cs.getItem(),cs.getQuantity());
		return res;
		
		
	}

}
