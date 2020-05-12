package service;

import java.sql.SQLException;
import java.util.List;

import dao.EmployeeOpration;
import dao.EmployeeOprationImpl;
import domian.Employee;
import domian.PageBean;

public class EmployeeServiceImpl implements EmployeeService {

	
	/**
	 * 	分页的业务操作
	 */
	@Override
	public PageBean getPageDatas(String pageNo) {
		//每页显示记录数
		int pageSize = 5;
		
		// 判断是否传递页码
		if("".equals(pageNo) || pageNo==null) {
			pageNo = "1";
		}
		//调用Dao层 从数据库获取数据
				EmployeeOpration op =new EmployeeOprationImpl();
		//   pageNo限定
		
		// 获取总的记录数
			int count;
			try {
				count = op.count();
				PageBean<Employee> pageBean = new PageBean<>(Integer.parseInt(pageNo), pageSize, count);
				List<Employee> findBypage = op.findBypage(pageBean.getPageNo(), pageBean.getPageSize());
				pageBean.setDatas(findBypage);
				return pageBean;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

}
