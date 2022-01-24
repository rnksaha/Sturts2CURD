
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rounak
 */
public class LoggerUtil {
    public static void initLogger() {
    try {
      String filePath = "E:/log/mylog.log";
      PatternLayout layout = new PatternLayout("%-5p %d %m%n");
      RollingFileAppender appender = new RollingFileAppender(layout, filePath);
      appender.setName("myFirstLog");
      appender.setMaxFileSize("1MB");
      appender.activateOptions();
      Logger.getRootLogger().addAppender(appender);
    } catch (IOException e) {
    }
}
    
}
