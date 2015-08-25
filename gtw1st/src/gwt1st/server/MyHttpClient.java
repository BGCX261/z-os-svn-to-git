package gwt1st.server;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;

/** 
 * <b>Description:TODO</b>
 * @author      gennady<br>
 * <br>
 * <b>Copyright:</b>     Copyright (c) 2006-2008 OXSEED AG <br>
 * <b>Company:</b>       OXSEED AG  <br>
 * 
 * Creation:  Feb 2, 2010::11:11:39 PM<br> 
 */
public class MyHttpClient extends HttpClient {

	@Override
	public int executeMethod(HttpMethod method) throws IOException,
			HttpException {
		// TODO Auto-generated method stub
		if ("GET".equals(method.getName())){
			method.addRequestHeader("a", "AA");
			method.getResponseBody();
			return 1;
		}
		else if ("POST".equals(method.getName()))return 2;
		else {
		return super.executeMethod(method);
		}
	}

}


 