package mx.gob.shcp.dgtsi.sfu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Clase encargada de manejar el contexto de Spring
 * @author SCHP
 * @version 1.0
 */
public class SpringServiceFactory implements ApplicationContextAware {
    // ~ Static fields/initializers
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static ApplicationContext applicationContext;

    // ~ Constructors
    // -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
       * Crea un objeto <code>SpringServiceFactory</code>.
       */
    public SpringServiceFactory() {
    }

    // ~ Methods
    // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceId Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static boolean containsBean(String serviceId) {
        return applicationContext.containsBean(serviceId);
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceId Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static Object createBean(String serviceId) {
        return applicationContext.getBean(serviceId);
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceType Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    @SuppressWarnings("rawtypes")
    public static Object createBean(Class serviceType) {
        return applicationContext.getBean(serviceType.getName());
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     * @param args Documentar el parametro!
     * @param locale Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static String getMessage(String code, Object[] args, Locale locale) {
        return applicationContext.getMessage(code, args, locale);
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     * @param args Documentar el parametro!
     * @param locale Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static String getMessage(String code, Object[] args) {
        return applicationContext.getMessage(code, args, Locale.getDefault());
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static String getMessage(String code) {
        return applicationContext.getMessage(code, null, Locale.getDefault());
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param filePathName Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static InputStream getResourceAsStream(String filePathName) {
        try {
            return applicationContext.getResource(filePathName).getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param theApplicationContext Documentar el parametro!
     */
    public void setApplicationContext(ApplicationContext theApplicationContext) {
        applicationContext = theApplicationContext;

    }

    public static void close() {
        if (applicationContext != null)
            ((ConfigurableApplicationContext) applicationContext).close();
    }

}
