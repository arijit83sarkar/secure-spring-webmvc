package com.raven.webmvcapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationDispatherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// application configuration mapping
		return new Class[] { ApplicationConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		// servlet mapping
		return new String[] { "/" };
	}
}
