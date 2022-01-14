package com.niit.SampleBackendProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.info("Looger info");
        LOG.error("Looger info");
        LOG.warn("Looger info");
        LOG.fatal("Looger info");
        LOG.debug("Looger info");
        
    }
}
