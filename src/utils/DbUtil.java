package utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbUtil {

	
	
	public  static ComboPooledDataSource cpds = new ComboPooledDataSource();
	
	/**
	 * ��ȡ���ݿ�����
	 */
	public static Connection getConn() throws SQLException {
		return cpds.getConnection();
	}
	
}
