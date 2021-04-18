package com.greedy.section01.model.dao;

import static com.greedy.common.JDBCTemplate.getConnection;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.greedy.section01.model.dto.CategoryDTO;
import com.greedy.section01.model.dto.OrderDTO;

public class OrderDAOTest {
	
	private Connection con;
	private OrderDAO orderDAO;
	private OrderDTO order;
	
	@Before
	public void setUp() {
		
		con = getConnection();
		orderDAO = new OrderDAO();
		
		// 주문할때 성성되는 정보를 미리 넣어주기
		order = new OrderDTO();
		order.setDate("20/04/06");
		order.setTime("16:42:44");
		order.setTotalOrderPrice(30000);
		
	}

	@Test
	@Ignore
	public void testSelectAllCategory() {
		
		List<CategoryDTO> categoryList = orderDAO.selectAllCategory(con);
		assertNotNull(categoryList);

	}
	
	@Test
	public void testInsertOrder() {
		int result = orderDAO.insertOrder(con, order);
		
		assertEquals(1, result);
		
	}
}
