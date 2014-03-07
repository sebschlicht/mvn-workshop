package de.uniko.mcws.mvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HalloWelt extends HttpServlet {

	private static final long serialVersionUID = 1059405952976400722L;

	@Override
	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws IOException {
		ResponseString respString = new ResponseString(request);
		PrintWriter writer = response.getWriter();

		writer.println(respString);
		writer.flush();
		writer.close();
	}

}
