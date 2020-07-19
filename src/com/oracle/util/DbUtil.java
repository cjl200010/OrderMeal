package com.oracle.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_food?useUnicode=true&characterEncoding=utf8";
	private String dbUserName="root";
	private String dbPassword="admin";
	private String jdbcName="com.mysql.jdbc.Driver";


	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}
	

	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}

	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("链接成功");
		} catch (Exception e) {
 			e.printStackTrace();
			System.out.println("链接失败");
		}
	}
}
