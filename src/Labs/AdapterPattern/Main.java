package Labs.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        Logger1 logger = new LoggerAdapter();

        //log here
        logger.log(LogLevel.INFO, "This is an info message.");
        logger.log(LogLevel.DEBUG, "This is a debug message.");
        logger.log(LogLevel.ERROR, "This is an error message.");
        logger.log(LogLevel.FATAL, "This is a fatal error message.");
        logger.log(LogLevel.TRACE, "This is a trace message.");
        logger.log(LogLevel.WARNING, "This is a warning message.");
    }
}
