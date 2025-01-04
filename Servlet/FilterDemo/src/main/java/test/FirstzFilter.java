package test;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebFilter(urlPatterns = "/test")


public class FirstzFilter implements Filter{
	private static final long serialVersionUID = 1L;
       
    
    public FirstzFilter() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
	
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		String apikey = request.getHeader("x-api-key");
		
		if("12345g".equals(apikey))
		{
			chain.doFilter(req, res);
		}else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().write("Request is not valid.");
		}
		
	}

}
