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
 * 	���е����󶼻ύ����ǰServlet
 * 
 * 		  ��ǰServlet��� �ַ�ת��
 *
 */
public class BaseServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*��ǰservice��ȥ��������ָ���ķ��������ҵ�����*/
		String methodName = request.getParameter("methodName");
		if("".equals(methodName)||methodName==null) {
			ServletOutputStream out = response.getOutputStream();
			out.write("�봫��methodName".getBytes());
			out.flush();
			out.close();
			return ;
		}
		
		// ��ȡ������ֽ����ļ�
		Class<? extends BaseServlet> clzz = this.getClass();
		 try {
				// ��ȡ������ָ������
			Method m = clzz.getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			// ��������ķ������᷵���ַ���- �ض����ҳ�棩
			Object page = m.invoke(this, request,response);
		
			if(page!=null) {
					response.sendRedirect(page+"");
			}
			
			/*�����еķ���  Ҫô �������ݸ�ҳ��  Ҫôͨ��IO���ķ�ʽ��Ӧ�����  ͨ���ض���*/
			
			
			
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
