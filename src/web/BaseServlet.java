package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 	所有的请求都会交给当前Servlet
 * 
 * 		  当前Servlet完成 分发转向
 *
 */
public class BaseServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*当前service会去调用子类指定的方法来完成业务操作*/
		String methodName = request.getParameter("methodName");
		if("".equals(methodName)||methodName==null) {
			ServletOutputStream out = response.getOutputStream();
			out.write("请传递methodName".getBytes());
			out.flush();
			out.close();
			return ;
		}
		
		// 获取子类的字节码文件
		Class<? extends BaseServlet> clzz = this.getClass();
		 try {
				// 获取子类中指定方法
			Method m = clzz.getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			// 调用子类的方法（会返回字符串- 重定向的页面）
			Object page = m.invoke(this, request,response);
		
			if(page!=null) {
					response.sendRedirect(page+"");
			}
			
			/*子类中的方法  要么 返回数据给页面  要么通过IO流的方式响应浏览器  通过重定向*/
			
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	
	
}
