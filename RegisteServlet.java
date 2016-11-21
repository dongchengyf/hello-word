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
//		super.doGet(req, resp); // 必须删除，否则报405的错误
		
		
		
		String username = req.getParameter("username");
		
		// 首先使用ISO-8859-1进行解码
		byte[] bys = username.getBytes("ISO-8859-1");
		// 再使用UTF-8进行重新编码
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
		
		// 遍历输出爱好
		for(String s:hobbys){
			System.out.println(s);
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("DoPost");
		// 只对POST提交时的乱码有效
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
		
		// 遍历输出爱好
		for(String s:hobbys){
			System.out.println(s);
		}
		
		
		
	}

}
