package sharma.log4j.example;

import org.apache.log4j.Logger;

public class Log4jExample {

    private final static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }

}
