
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rouna
 */
public class LoggerTest {
    public static void main(String[] args) {
    //calling initLogger() method to initialize properties. 
    //You need to call this method only once.
    LoggerUtil.initLogger(); 
    
    //Getting the already registered logger 'myFirstLog'
    Logger accessLog = Logger.getLogger("myFirstLog");
 
    accessLog.info("This is my first info message.");
    accessLog.warn("This is my first warn message.");
    accessLog.error("This is my first error message.");
    accessLog.fatal("This is my first fatal message.");
  }
    
}
