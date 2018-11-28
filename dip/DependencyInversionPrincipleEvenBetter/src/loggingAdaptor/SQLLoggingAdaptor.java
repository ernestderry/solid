package loggingAdaptor;

import clientLogging.LoggingService;
import sqlLogging.SQLLogger;

//Note, the logging adaptor class only provides access to the logMessage method in the SQLLogger class
public class SQLLoggingAdaptor implements LoggingService {

	SQLLogger logger = new SQLLogger();
	
	@Override
	public void logMessage(String message) {
		logger.logMessage(message);
	}

}
