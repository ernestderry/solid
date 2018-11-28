package fileLogging;

import orderProcessing.LoggingService;

public class FileLogger implements LoggingService {

	@Override
	public void logMessage(String message) {
		System.out.println("logging to file system");
		//log message to file system;
	}

}
