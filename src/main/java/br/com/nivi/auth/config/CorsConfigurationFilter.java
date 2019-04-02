package br.com.nivi.auth.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Filtro que habilita o CORS
 * 
 * @author vinicios.rodrigues
 *
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsConfigurationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;

		resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		if ("OPTIONS".equals(req.getMethod())) {
			resp.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
			resp.setHeader("Access-Control-Max-Age", "3600");
			resp.setStatus(HttpServletResponse.SC_OK);
		} else {
			chain.doFilter(req, resp);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}