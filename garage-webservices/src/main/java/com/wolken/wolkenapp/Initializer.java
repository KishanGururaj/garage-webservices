package com.wolken.wolkenapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	

		@Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {RestApplicationConfig.class};
		}

		@Override
		protected String[] getServletMappings() {
			// TODO Auto-generated method stub
			return new String[] {"/"};
		}

	}



