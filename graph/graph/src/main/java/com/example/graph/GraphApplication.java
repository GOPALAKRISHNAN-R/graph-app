package com.example.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Simple Java Application for Graphs
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

@SpringBootApplication
@ComponentScan(basePackages={"com.example.graph.controller"})
public class GraphApplication extends WebMvcConfigurerAdapter {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("").setViewName("home");
	}

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
	}

}
