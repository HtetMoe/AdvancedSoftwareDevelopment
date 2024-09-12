package Labs.AdapterPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    public void logMessages() {
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }

    public static void main(String[] args) {
        LoggerUtil loggerUtil = new LoggerUtil();
        loggerUtil.logMessages();
    }
}
