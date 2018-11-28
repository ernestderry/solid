package runner;

import clientLogging.LoggingService;
import fileLogging.FileLogger;
import loggingAdaptor.FileLoggingAdaptor;
import loggingAdaptor.SQLLoggingAdaptor;
import orderProcessing.OrderProcessor;
import paymentProcessing.Payment;
import sqlLogging.SQLLogger;

public class runner {
	public static void main(String[] args) {

		// 2 different components can use the File Logger but not directly. They
		// use the FileLoggerAdaptor which adapts the FileLogger
		// to their requirements. i.e. only exposes the necessary methods
		// (Interface Segregation Principle).

		// The OrderProcessor is still not dependent on a low level component,
		// i.e. the FileLogger. It remains dependent on the interface that's
		// inside its own package. However, a FileLoggingAdaptor is constructed
		// separately and it is this that is coupled to the OrderProcessor.
		// The FileLoggingAdaptor then exposes the lower level component and adapts it
		// to fit the needs of the OrderProcessor.  It doesn't expose all of its methods.
		
		// If the OrderProcessor wants to use a different logger then we need
		// another adaptor, e.g. the SQLLoggingAdaptor.
		
		// Using this approach another application, e.g. paymentProcessing can also
		// use the logger.  It can use the same FileLoggingAdaptor as the OrderProcessor or
		// it could have its own adaptor.		

		// By using a logging adapter to implement the client-owned interface,
		// both the high-level client components and the logging component
		// are able to remain free from dependency upon one another.
		// While this approach dispenses with the notion of dependency inversion
		// from the low-level component point of view, it achieves the
		// Dependency Inversion principle’s goal of decoupling without affecting
		// the potential reuse of lower-level components.
		// Though this level of decoupling is certainly not necessary in every
		// case, this technique offers a more flexible option for those
		// wishing to maximize the level of decoupling between application and
		// infrastructure components.
		// See
		// http://aspiringcraftsman.com/2008/12/28/examining-dependency-inversion/

		LoggingService fileLogger = new FileLoggingAdaptor();
		OrderProcessor op = new OrderProcessor(fileLogger);
		Payment payment = new Payment(fileLogger);
		op.processOrder("ABC123");
		payment.takePayment(100.00);

		LoggingService sqlLogger = new SQLLoggingAdaptor();
		OrderProcessor op2 = new OrderProcessor(sqlLogger);
		Payment payment2 = new Payment(sqlLogger);
		op2.processOrder("ABC123");
		payment2.takePayment(100.00);
	}
}
