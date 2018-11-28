package sqlLogging;

import clientLogging.LoggingService;

public class SQLLogger implements LoggingService {

	@Override
	public void logMessage(String message) {
		System.out.println("logging to sql database - " + message);
		//log to sql database
	}
	
	public String getLoggingDatabase() {
		//return SQL Logging datbase name
		return "database";
	}

}
