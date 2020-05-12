package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import domian.Employee;
import utils.DbUtil;

public class EmployeeOprationImpl implements EmployeeOpration {

	
	private QueryRunner qr = new QueryRunner(DbUtil.cpds);
	
	@Override
	public List<Employee> findBypage(Integer pageNo, Integer pageSize) throws SQLException {
		String sql = "select * from emp limit ?,?";
		return qr.query(sql,new Object[] {((pageNo-1)*pageSize),pageSize},new BeanListHandler<>(Employee.class));
	}

	@Override
	public int count() throws SQLException {
		String sql = "select count(*) from  emp";
		Object query = qr.query(sql,new  ScalarHandler());
		return Integer.parseInt(query+"");
	}

}
