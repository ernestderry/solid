package loggingAdaptor;

import clientLogging.LoggingService;
import fileLogging.FileLogger;


// Note, the logging adaptor class only provides access to the logMessage method in the FileLogger class
public class FileLoggingAdaptor implements LoggingService {
	FileLogger fileLogger = new FileLogger();

	@Override
	public void logMessage(String message) {
		fileLogger.logMessage(message);
	}

}
