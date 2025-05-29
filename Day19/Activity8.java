//Logging for debugging
package Day19;

import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Activity8 {
    private static final Logger logger = Logger.getLogger(Activity8.class.getName());
    public static void main(String[] args) {
        /*Task 17: Replace System.out.println() with Logger (from java.util.logging) to log info, warnings, and errors.
→ Goal: Set up a simple logging configuration and use it for tracing.*/
/*Task 18: Use different log levels (INFO, WARNING, SEVERE) to categorize output messages.
→ Goal: Practice controlling output visibility.
 */
/*logger.setLevel(Level.ALL);
logger.info("This is an INFO level message");
try{
    int result = divide(10,0);
    logger.info("Division result: " + result);
}catch(ArithmeticException e){
    logger.severe("Error: Division by zero - " + e.getMessage());
}

logger.warning("This is a Warning level message.");
    }
public static int divide(int a,int b){
    return a/b;*/
    logger.setLevel(Level.INFO);
    logger.info("Application started.");
    int x=5;
    int y=0;
    if(y==0){
        logger.warning("Attempting to divide by zero.");
    }
    try{
        int result = divide(x,y);
        logger.info("Division result: " + result);
    }catch(ArithmeticException e){
        logger.severe("Exception occurred: " + e.getMessage());
    }
    logger.info("Application ended");
}
public static int divide(int a,int b){
    return a/b;
}
}
