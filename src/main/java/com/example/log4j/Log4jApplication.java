    package com.example.log4j;

    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class Log4jApplication {

        private static final Logger logger = LogManager.getLogger(Log4jApplication.class);

        public static void main(String[] args) {
            SpringApplication.run(Log4jApplication.class, args);
            logger.trace("Entering method processOrder().");
            logger.debug("Received order with ID 12345.");
            logger.info("Order shipped successfully.");
            logger.warn("Potential security vulnerability detected in user input: '...'");
            logger.error("Failed to process order. Error: {. . .}");
            logger.fatal("System crashed. Shutting down...");
        }

    }
