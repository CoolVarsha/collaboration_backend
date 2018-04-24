package com.niit.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebConfig extends WebMvcConfigurerAdapter {
	public WebConfig(){
		System.out.println("WEBCONFIG class is instantiated");
	}
}
