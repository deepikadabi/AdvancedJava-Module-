package serv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")

public class LifeCycleServlet extends HttpServlet{
  @Override
public void init() throws ServletException {
	System.out.println("Init method called");
}
  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method called");
	}
  @Override
	public void destroy() {
		System.out.println("Destroy method called");
	}
}
