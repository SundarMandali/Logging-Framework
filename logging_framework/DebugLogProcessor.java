package logging_framework;

public class DebugLogProcessor extends LogProcessor{
	
	DebugLogProcessor(LogProcessor logProcessor){
		super(logProcessor);
	}
	
	void log(int logLevel,String message) {
		if(logLevel==LogProcessor.DEBUG) {
			System.out.println("Debug log: "+message);
		}else {
			super.log(logLevel,message);
		}
	}
}
