package dao;

import java.sql.SQLException;
import java.util.List;

import domian.Employee;

/**
 * 
 * @author tosit
 *	�����Ա��Ļ�������
 */
public interface EmployeeOpration {

	
	/*��ҳ��ʾ��Ա��Ϣ*/
	List<Employee> findBypage(Integer pageNo,Integer pageSize)throws SQLException;
	
	/*��ȡ�ܵļ�¼��*/
	int  count()throws SQLException;
}
