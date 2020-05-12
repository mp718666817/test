package utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbUtil {

	
	
	public  static ComboPooledDataSource cpds = new ComboPooledDataSource();
	
	/**
	 * 获取数据库连接
	 */
	public static Connection getConn() throws SQLException {
		return cpds.getConnection();
	}
	
}
