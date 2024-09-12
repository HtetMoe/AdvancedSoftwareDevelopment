package Labs.AdapterPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerAdapter implements Logger1 {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class); //existing class

    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel) {
            case DEBUG:
                logger.debug(message);
                break;
            case ERROR:
                logger.error(message);
                break;
            case FATAL:
                logger.fatal(message);
                break;
            case INFO:
                logger.info(message);
                break;
            case TRACE:
                logger.trace(message);
                break;
            case WARNING:
                logger.warn(message);
                break;
            default:
                logger.info(message);
                break;
        }
    }
}
