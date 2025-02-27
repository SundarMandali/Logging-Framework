package logging_framework;

public class Main {

	public static void main(String[] args) {
		LogProcessor logObject=new InfoLogProcessor(
				new DebugLogProcessor(
						new ErrorLogProcessor(null)
						)
				);
		logObject.log(LogProcessor.ERROR, "Exception in this code block");
		logObject.log(LogProcessor.DEBUG, "Need to debug this code");
		logObject.log(LogProcessor.INFO, "Just for Info");
	}

}
