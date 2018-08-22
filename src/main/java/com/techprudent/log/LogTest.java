package com.techprudent.log;

import javax.annotation.PostConstruct;

import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author tech prudent
 *
 */
@Component
public class LogTest {

	/**
	 * {@link SLF4JLogger}
	 */
	Logger logger = LoggerFactory.getLogger(LogTest.class);

	/**
	 * {@link PostConstruct}, once the bean initialization is done, dependency
	 * injection gets over, this postConstruct method will get executed
	 */
	@PostConstruct
	private void debugLog() {
		logger.info("\n");

		logger.trace("TRACE Message");
		logger.debug("DEBUG Message");
		logger.info("INFO Message");
		logger.warn("WARN Message");
		logger.error("ERROR Message");

		logger.info("\n");
	}
}
