package com.javaClassAnnotations;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Logging.properties")
public class LoggingLeverSetter {

	@Value("${root.logger.level}")
	private String rootloggerLevel;
	@Value("${printed.logger.level}")
	private String printedLoggerLevel;
	
	@PostConstruct
	public void initLogger() {
		System.out.println("Started logging");
		Level rootlevel = Level.parse(rootloggerLevel);
		Level printedLevel =Level.parse(printedLoggerLevel);
		Logger applicationContexLogger = Logger.getLogger((AnnotationConfigApplicationContext.class.getName()));
		// get parent logger
				Logger loggerParent = applicationContexLogger.getParent();
		 
				// set root logging level
				loggerParent.setLevel(rootlevel);
				
				// set up console handler
				ConsoleHandler consoleHandler = new ConsoleHandler();
				consoleHandler.setLevel(printedLevel);
				consoleHandler.setFormatter(new SimpleFormatter());
				
				// add handler to the logger
				loggerParent.addHandler(consoleHandler);
		
	}
	
}
