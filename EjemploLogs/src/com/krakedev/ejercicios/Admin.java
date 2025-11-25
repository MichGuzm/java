package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	public void agregar() {
		logger.warn("mensaje de info");
		logger.info("mensaje de info");
		logger.debug("mensaje de info");
		logger.trace("mensaje de info");
		logger.error("mensaje de info");
		
	}
	
	
}
