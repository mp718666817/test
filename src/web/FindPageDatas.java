package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domian.PageBean;
import service.EmployeeService;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class FindPageDatas
 */
@WebServlet("/FindPageDatas")
public class FindPageDatas extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPageDatas() {
        super();
    }

    
    public String findpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 获取当前页的页码
    	String pageNo = request.getParameter("pageNo");
    	// 调用业务Bean完成分页功能
    	EmployeeService service = new EmployeeServiceImpl();
    	PageBean pageBean = service.getPageDatas(pageNo);
    	request.setAttribute("pageBean", pageBean);
    	request.getRequestDispatcher("index.jsp").forward(request, response);
    	return null;
    }
    
    
}
