package mindmap.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class CustomAccessDeniedHanlder implements AccessDeniedHandler {
	
	private static final Logger Log = LoggerFactory.getLogger(CustomAccessDeniedHanlder.class);
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		Log.error("Access Denied Handler");
		
		Log.error("Redirect....");
		
		response.sendRedirect("/error/accessError");
	}
}
