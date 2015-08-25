package gwt1st.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * <b>Description:TODO</b>
 * @author      gennady<br>
 * <br>
 * <b>Copyright:</b>     Copyright (c) 2006-2008 OXSEED AG <br>
 * <b>Company:</b>       OXSEED AG  <br>
 * 
 * Creation:  Jan 27, 2010::5:58:54 PM<br> 
 */
public class HiService extends HttpServlet  {

 

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().write("Darova Bakum! Privet s Googla!!! ");
	}

}


 