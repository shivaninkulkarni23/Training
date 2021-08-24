package com.amdocs.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;

public class Testproject {
AdminDAOImpl admin=new AdminDAOImpl();
UserDAOImpl user=new UserDAOImpl();
	@Test
	public void testAdmin() {
		assertEquals(true,admin.check("s@gmail.com", "pass") );
	}
	@Test
	public void testUser() {
		assertEquals(true, user.check("d@gmail.com", "d123"));
	}
	@Test
	public void testDeleteUser() {
		assertEquals(true, user.deleteUser(2));
	}
	
}
