package orderProcessing;

import orderProcessing.LoggingService;

public class OrderProcessor {
	
	LoggingService logger;
	
	public OrderProcessor(LoggingService logger) {
		this.logger = logger;
	}
	
	public void processOrder(String orderRef) {
		
		logger.logMessage("processing order "+orderRef);
		
	}
}
