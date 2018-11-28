package runner;

//The FileLogger is now dependent on the OrderProcessor, or at least the interface that it uses.  The dependencies have now been inverted!
//According to Uncle Bob the interface should be owned by the OrderProcessor, i.e. it belongs in the same package.

//The FileLogger then implements that interface.
//A new logger, the SQLLogger, also implements the same interface and can be switched in place of the FileLogger without changing the OrderProcessor

//Instead we simply inject the logger we are using into the OrderProcessor.

//A down side with the Logger being dependent on the OrderProcessor is that the Logger cannot be used by another application.
//The OrderProcessor package would be needed because it holds the LoggingService interface that the logger implements.

import fileLogging.FileLogger;
import orderProcessing.LoggingService;
import orderProcessing.OrderProcessor;
import sqlLogging.SQLLogger;

public class runner {	
	public static void main (String[] args) {
		LoggingService ls = new FileLogger();
		OrderProcessor op = new OrderProcessor(ls);
		op.processOrder("ABC123");

		LoggingService ls2 = new SQLLogger();
		OrderProcessor op2 = new OrderProcessor(ls2);
		op2.processOrder("ABC123");
	}
}
