package service;

import java.sql.SQLException;
import java.util.List;

import dao.EmployeeOpration;
import dao.EmployeeOprationImpl;
import domian.Employee;
import domian.PageBean;

public class EmployeeServiceImpl implements EmployeeService {

	
	/**
	 * 	��ҳ��ҵ�����
	 */
	@Override
	public PageBean getPageDatas(String pageNo) {
		//ÿҳ��ʾ��¼��
		int pageSize = 5;
		
		// �ж��Ƿ񴫵�ҳ��
		if("".equals(pageNo) || pageNo==null) {
			pageNo = "1";
		}
		//����Dao�� �����ݿ��ȡ����
				EmployeeOpration op =new EmployeeOprationImpl();
		//   pageNo�޶�
		
		// ��ȡ�ܵļ�¼��
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
