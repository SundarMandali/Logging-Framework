package logging_framework;

public class ErrorLogProcessor extends LogProcessor{
	ErrorLogProcessor(LogProcessor logProcessor){
		super(logProcessor);
	}
	
	void log(int logLevel,String message) {
		if(logLevel==LogProcessor.ERROR) {
			System.out.println("ERROR log: "+message);
		}else {
			super.log(logLevel, message);
		}
	}
}
