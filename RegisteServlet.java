package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisteServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doGet(req, resp); // ����ɾ��������405�Ĵ���
		
		
		
		String username = req.getParameter("username");
		
		// ����ʹ��ISO-8859-1���н���
		byte[] bys = username.getBytes("ISO-8859-1");
		// ��ʹ��UTF-8�������±���
		String newusername = new String(bys,"UTF-8");
		System.out.println(newusername);
		
		String sex = req.getParameter("sex");		
		sex = new String(sex.getBytes("iso8859-1"),"utf-8");
				
		String password = req.getParameter("password");
		String[] hobbys = req.getParameterValues("hobby");
		String zym = req.getParameter("zym");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(sex);
		System.out.println(zym);
		
		// �����������
		for(String s:hobbys){
			System.out.println(s);
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("DoPost");
		// ֻ��POST�ύʱ��������Ч
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String sex = req.getParameter("sex");	
		
		String password = req.getParameter("password");
		String[] hobbys = req.getParameterValues("hobby");
		String zym = req.getParameter("zym");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(sex);
		System.out.println(zym);
		
		// �����������
		for(String s:hobbys){
			System.out.println(s);
		}
		
		
		
	}

}
