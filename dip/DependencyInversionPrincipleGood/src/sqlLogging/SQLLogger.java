package sqlLogging;

import orderProcessing.LoggingService;

public class SQLLogger implements LoggingService {

	@Override
	public void logMessage(String message) {
		System.out.println("logging to sql database");
		//log to sql database
	}

}
