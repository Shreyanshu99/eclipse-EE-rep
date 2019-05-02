package com.IP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpCheckDemo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String ip = req.getRemoteAddr();
		
		ServletOutputStream prt = res.getOutputStream();
		
		prt.print("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
				+ "<title>IP check Demo</title>"
				+ "<style type=\"text/css\">"
				+ "	.heading {"
				+ "		margin-left: 500px;"
				+ "		margin-top: 50px;"
				+ "		color: blue;"
				+ "		font-size: 23px;"
				+ "	}");
		
		prt.print("</style>"
				+ "</head>"
				+ "<body>"
				+ "	<b class=\"heading\">IP verification</b><br>"
				+ "	Hello! "+name+"<br>"
				+ " ID: "+id+"<br>"
				+ " IP: "+ip+"<br>");
		
		prt.print("</body>"
				+ "</html>");
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		doGet(req, res);
	}

}
