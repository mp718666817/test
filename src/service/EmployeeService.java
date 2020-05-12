package service;

import domian.PageBean;

public interface EmployeeService {

	
	/*
	 *	PageBean - 页面数据封装类 	
	 */
	PageBean  getPageDatas(String pageNo);
	
}
