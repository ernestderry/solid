package orderProcessing;

import fileLogging.FileLogger;

public class OrderProcessor {

	FileLogger logger = new FileLogger();
	
	public void processOrder(String orderRef) {
		
		logger.logMessage("processing order "+orderRef);
		
	}
	
}
