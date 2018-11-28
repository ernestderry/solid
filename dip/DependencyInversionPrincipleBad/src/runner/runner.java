package runner;

// The OrderProcessor is dependent on the FileLogger.  If we want to change the FileLogger to a different logger
// we need to change the OrderProcessor class/package.

import orderProcessing.OrderProcessor;

public class runner {
	public static void main(String[] args) {
		OrderProcessor op = new OrderProcessor();
		op.processOrder("ABC123");
	}
}
