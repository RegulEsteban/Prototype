package mx.gob.shcp.dgtsi.sfu.web.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class EnvInit implements ServletContextListener {
	
	private static final String URL_FS = "EnvironmentFS";
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
        try{
        String fileSystem = arg0.getServletContext().getInitParameter(URL_FS);         
        if (System.getProperty(URL_FS) == null)
           System.setProperty(URL_FS, fileSystem);
           
        }catch(Exception e){
          log.error("Error al setear FileSystem y Monitor de Archivos: " + e.getMessage(), e);
          throw new RuntimeException("Error al setear FileSystem y Monitor de Archivos: " + e.getMessage(), e);
        }
	}

}
