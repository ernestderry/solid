package paymentProcessing;

import clientLogging.LoggingService;

public class Payment {

	LoggingService logger;

	public Payment(LoggingService loggingService) {
		logger = loggingService;
	}

	public void takePayment(double amount) {
		logger.logMessage("taking payment for " + amount);
	}
}
