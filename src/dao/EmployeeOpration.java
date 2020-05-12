package dao;

import java.sql.SQLException;
import java.util.List;

import domian.Employee;

/**
 * 
 * @author tosit
 *	定义雇员表的基本操作
 */
public interface EmployeeOpration {

	
	/*分页显示雇员信息*/
	List<Employee> findBypage(Integer pageNo,Integer pageSize)throws SQLException;
	
	/*获取总的记录数*/
	int  count()throws SQLException;
}
