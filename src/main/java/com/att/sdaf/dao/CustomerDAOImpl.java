package com.att.sdaf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CustomerDAOImpl implements CustomerDAO {

	public DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		}

	@Override
	public void insertData(String Name, String employeeNo, String mobilNo) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO EMPLOYEE " +
				"(NAME, EMPLOYEENO, MOBILENO) VALUES (?, ?, ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Name);
			ps.setString(2, employeeNo);
			ps.setString(3,mobilNo);
			ps.executeUpdate();
			ps.close();
				
		} catch (SQLException e) {
			throw new RuntimeException(e);
				
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	}

