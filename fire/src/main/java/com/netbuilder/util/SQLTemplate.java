package com.netbuilder.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class SQLTemplate {

	private DataSource dataSource;
	
	public SQLTemplate(DataSource DataSource){
		this.dataSource=DataSource;
	}
	
	/**
	 * Gets the ResultsSet for executing a Query
	 * 
	 * @param table
	 * @return ResultSet
	 * @throws SQLException 
	 */
	
	public ResultSet getResultSetForQuery(String table, String sql) throws SQLException{
		ResultSet rs = null;
		Statement statement = dataSource.getConnection().createStatement();
		rs = statement.executeQuery(sql);
		return rs;
	}
	
	/**
	 * Updates Tables
	 * @param sql
	 */
	
	public void update(String sql){
		try {
			Statement statement = dataSource.getConnection().createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * Deletes Tables
	 * @param sql
	 */
	
	public void delete(String sql){
		update(sql);
	}
	
	
	public  void deleteAll(String table){
		try {
			Statement statement = dataSource.getConnection().createStatement();
			statement.executeUpdate("DELETE * From "+table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}

