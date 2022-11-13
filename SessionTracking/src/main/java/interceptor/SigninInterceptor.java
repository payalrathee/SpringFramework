package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SigninInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("filter");
		HttpSession session=request.getSession();
		if(session.getAttribute("email")!=null)
			return true;
		else 
		{
			response.sendRedirect("signin");
			return false;
		}
	}

}
